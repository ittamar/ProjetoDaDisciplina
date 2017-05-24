package br.com.util;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil implements Serializable {
	/*
	 * @PersistenceContext private EntityManager manager;
	 */

	/*
	 * private static EntityManagerFactory emf =
	 * Persistence.createEntityManagerFactory("conexao"); Entidade entidade =
	 * new Entidade();
	 * 
	 * public EntityManager getEntityManager() { return
	 * emf.createEntityManager(); }
	 */
	/*
	 * public void criarTabela() { manager.getTransaction().begin();
	 * manager.persist(entidade); manager.getTransaction().commit();
	 * manager.close(); }
	 */
	public static void main(String[] args) {
		/*
		 * JPAUtil jpa = new JPAUtil(); jpa.criarTabela();
		 */

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexao");

		EntityManager manager = entityManagerFactory.createEntityManager();

		/*
		 * Paciente p = new Paciente(); p.setNome("oi");
		 * 
		 * manager.persist(p);
		 * 
		 * manager.close(); entityManagerFactory.close();
		 */

	}

}
