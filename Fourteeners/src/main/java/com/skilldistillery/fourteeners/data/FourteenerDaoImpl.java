package com.skilldistillery.fourteeners.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.fourteeners.entities.Fourteener;

@Service
@Transactional
public class FourteenerDaoImpl implements FourteenerDAO {
	// dont need to em.close()
	// never begin()//commit()

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
	    em.persist(fourteener);
	    return fourteener;
	}

	

	@Override
	public Fourteener update(int fourteenerId, Fourteener fourteener) {
		Fourteener updatedFourteener = em.find(Fourteener.class, fourteenerId);

		if (updatedFourteener != null) {
			
			updatedFourteener.setName(fourteener.getName());
			updatedFourteener.setNearestTown(fourteener.getNearestTown());
			updatedFourteener.setDescription(fourteener.getDescription());
			updatedFourteener.setMaxElevation(fourteener.getMaxElevation());
			updatedFourteener.setElevationGained(fourteener.getElevationGained());
			updatedFourteener.setHiked(fourteener.getHiked());
			em.persist(updatedFourteener);
			em.flush();
			
		}
		return updatedFourteener;
	}

	@Override
	public boolean deleteById(int fourteenerId) {
		boolean deleted = false;
		Fourteener managedFourteener = em.find(Fourteener.class, fourteenerId);
		if(managedFourteener != null) {
			
			em.remove(managedFourteener);
			
			deleted = true;
		}
		return deleted;
	}

}