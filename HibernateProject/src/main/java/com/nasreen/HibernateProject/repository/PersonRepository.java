package com.nasreen.HibernateProject.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nasreen.HibernateProject.entity.Person;


import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonRepository {
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	public Person insert(Person per) {
		return em.merge(per);
	}
	public Person findById(Long id)
	{
		 return em.find(Person.class, id);
	}
	public Person update(Person person) {
		return em.merge(person);
		
	}
	public void delete(int id) {
		Person person = em.find(Person.class, id);
		em.remove(person);
		
	}

}
