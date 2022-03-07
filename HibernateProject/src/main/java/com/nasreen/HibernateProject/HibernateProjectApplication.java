package com.nasreen.HibernateProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nasreen.HibernateProject.entity.Person;
import com.nasreen.HibernateProject.repository.PersonRepository;
@EntityScan("com.nasreen.HibernateProject.entity")
@ComponentScan("com.nasreen.HibernateProject.repository")
@SpringBootApplication
public class HibernateProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext allbeans = SpringApplication.run(HibernateProjectApplication.class, args);
		PersonRepository bean = allbeans.getBean(PersonRepository.class);
		bean.insert(new Person("Shalini",22,"Developer",20000));
		bean.insert(new Person("Afreen",22,"tester",20000));
		bean.insert(new Person("Bhanu",23,"Dev",25000));
		bean.update(new Person(2,"Afreen",22,"tester",30000));
		bean.delete(2);
	}

}
