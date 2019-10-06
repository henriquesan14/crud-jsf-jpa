package br.com.appfilme.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Filmes");
	
	public static EntityManager createEntityManager() {
		return emf.createEntityManager();
	}
		
}
