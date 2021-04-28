package com.tyss.springAnnotation.Config;

import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springAnnotation.beans.EntityManagerDemo;

@Configuration
public class EntityManagerConfig {
    @Bean
	public EntityManagerDemo getEntityManagerDemo() {
    	EntityManagerDemo entityManagerDemo= new EntityManagerDemo();
		 entityManagerDemo.setEntityManager(Persistence.createEntityManagerFactory("Many").createEntityManager());;
		return entityManagerDemo;
	}
}
