package com.skilldistillery.fourteeners.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.fourteeners.entities.Fourteener;
@Service
@Transactional
public class FourteenerDaoImpl implements FourteenerDAO {
	//dont need to em.close()
	//never begin()//commit()

	@PersistenceContext
	private EntityManager em;
	@Override
	public Fourteener findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Fourteener.class, id);
	}

	@Override
	public List<Fourteener> findAll() {
		String jpql = "SELECT fourteener FROM Fourteener fourteener";
		return em.createQuery(jpql, Fourteener.class).getResultList();
		// TODO Auto-generated method stub
		
	}

	@Override
	public Fourteener create(Fourteener fourteener) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fourteener update(int fourteenerId, Fourteener fourteener) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int fourteenerId) {
		// TODO Auto-generated method stub
		return false;
	}

}
