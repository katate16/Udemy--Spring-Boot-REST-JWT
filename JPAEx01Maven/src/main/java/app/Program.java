package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {

	public static void main(String[] args) {
		Person p = new  Person(null, "Zeca das Couves", "zedacouve@gmail.com");
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("JPAex01");
		EntityManager em = emFactory.createEntityManager();
		
		em.getTransaction().begin();
		
		// em.persist(p);
		var x = em.find(Person.class, 1);
		em.getTransaction().commit();
		
		System.out.println(x.toString());
		em.close();
		emFactory.close();
	}

}
