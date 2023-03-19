package com.per;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class srikanthMain 
{
public static void main(String[] args) throws IOException 
{
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Srikanth srikanth=new Srikanth();
	srikanth.setName("Kanth");
	srikanth.setReason("Is BirhDay");
	srikanth.setBirthDayDate(new Date());
	
	FileInputStream fis=new FileInputStream("src/main/java/sri.jpg");
	byte[] data=new byte[fis.available()];
	fis.read(data);
	srikanth.setImage(data);
	
	entityTransaction.begin();
	entityManager.persist(srikanth);
	entityTransaction.commit();
	
}
}
