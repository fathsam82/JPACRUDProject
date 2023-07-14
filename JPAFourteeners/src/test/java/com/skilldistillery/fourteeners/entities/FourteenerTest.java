package com.skilldistillery.fourteeners.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FourteenerTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Fourteener fourteener;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAFourteeners");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		fourteener = em.find(Fourteener.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		fourteener = null;
	}

	@Test
	void test() {
		assertNotNull(fourteener);
		assertEquals("Longs Peak", fourteener.getName());
	}

}
