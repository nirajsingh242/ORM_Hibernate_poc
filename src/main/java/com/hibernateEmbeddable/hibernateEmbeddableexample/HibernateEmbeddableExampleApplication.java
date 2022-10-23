package com.hibernateEmbeddable.hibernateEmbeddableexample;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernateEmbeddable.hibernateEmbeddableexample.entity.Address;
import com.hibernateEmbeddable.hibernateEmbeddableexample.entity.Name;
import com.hibernateEmbeddable.hibernateEmbeddableexample.entity.User;

@SpringBootApplication
public class HibernateEmbeddableExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateEmbeddableExampleApplication.class, args);
		
		Name name = new Name("Ramesh", "M", "Fadatare");
		Address address = new Address("111", "Puadroad", "Pune", "Maharastra", "India", "411038");
		User user = new User(name, "ramesh@gmail.com", address);

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(user);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

}
