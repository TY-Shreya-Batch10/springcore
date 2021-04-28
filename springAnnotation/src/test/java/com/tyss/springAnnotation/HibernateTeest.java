package com.tyss.springAnnotation;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springAnnotation.Config.EntityManagerConfig;
import com.tyss.springAnnotation.beans.EntityManagerDemo;
import com.tyss.springAnnotation.beans.Movies;

public class HibernateTeest {

	public static void main(String[] args) {
		 Movies m = new Movies();
	        m.setMid(4);
	        m.setMname("sahoo");
	        m.setMrating(8.5);
	        m.setMreview("good");
		ApplicationContext context = new AnnotationConfigApplicationContext(EntityManagerConfig.class);
               EntityManagerDemo demo= context.getBean(EntityManagerDemo.class);
               EntityManager entityManager=demo.getEntityManager();
               EntityTransaction entityTransaction=entityManager.getTransaction();
               entityTransaction.begin();
               entityManager.persist(m);
               entityTransaction.commit();
               System.out.println("Record inserted succesfully");
	}

}
