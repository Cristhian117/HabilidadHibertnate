package com.personas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.entidad.Persona;
import com.entidad.Raking;
import com.entidad.Habilidad;


public class Main {

	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() 
			.build();
	static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();

  public static void main(String[] args) {
	   Persona persona1 = new Persona("jose");
	   ingresarPesona(persona1);
	   Persona persona2 = new Persona("Carlos");
	   ingresarPesona(persona2);
	  
	   Raking raking = new Raking(1);
	   ingresarRaking(raking);
	   Raking raking2 = new Raking(2);
	  ingresarRaking(raking2);
	  
	  Habilidad habilidad = new Habilidad("programacion orientado a objeto");
	  ingresarHabilidad(habilidad);
	  
	  Habilidad habilidad2 = new Habilidad("base de datos post");
	  ingresarHabilidad(habilidad2);
	  
  }
  

	static void ingresarPesona(Persona persona) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(persona);
		session.getTransaction().commit();
		session.close();
	}

	
	static void ingresarRaking(Raking raking) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(raking);
		session.getTransaction().commit();
		session.close();
	}
	
	static void ingresarHabilidad(Habilidad habilidad) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(habilidad);
		session.getTransaction().commit();
		session.close();
	}
}



