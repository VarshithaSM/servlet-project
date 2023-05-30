package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Student;

public class Std_dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager  entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void insert(Student d1) {
		entityTransaction.begin();
		entityManager.persist(d1);
		entityTransaction.commit();
	}

	public List<Student> fetchbyid(long reg) {
		Student d=entityManager.find(Student.class, reg);
		Query q1 = entityManager.createQuery("select data from Student data");
		List <Student> l=q1.getResultList();
		return l;
	}

	public List<Student> fetchAll() {
		Query q = entityManager.createQuery("select data from Student data");
		List<Student> f = q.getResultList();
		return f;
	}

	public void update(Student st) {
		entityTransaction.begin();
		entityManager.merge(st);
		entityTransaction.commit();	
		
	}





}
