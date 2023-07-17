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

	@PersistenceContext
	private EntityManager em;

	@Override
	public Fourteener findById(int id) {

		return em.find(Fourteener.class, id);
	}

	@Override
	public List<Fourteener> findAll() {
		String jpql = "SELECT fourteener FROM Fourteener fourteener";
		return em.createQuery(jpql, Fourteener.class).getResultList();
	}

	@Override
	public Fourteener create(Fourteener fourteener) {
		em.persist(fourteener);
		return fourteener;
	}

	@Override
	public Fourteener update(int fourteenerId, Fourteener fourteener) {
		Fourteener updatedFourteener = em.find(Fourteener.class, fourteenerId);

		updatedFourteener.setName(fourteener.getName());
		updatedFourteener.setNearestTown(fourteener.getNearestTown());
		updatedFourteener.setDescription(fourteener.getDescription());
		updatedFourteener.setMaxElevation(fourteener.getMaxElevation());
		updatedFourteener.setElevationGained(fourteener.getElevationGained());
		updatedFourteener.setHiked(fourteener.getHiked());

		return updatedFourteener;
	}

	@Override
	public boolean deleteById(int fourteenerId) {
		boolean deleted = false;
		Fourteener managedFourteener = em.find(Fourteener.class, fourteenerId);
		if (managedFourteener != null) {

			em.remove(managedFourteener);

			deleted = true;
		}
		return deleted;
	}
}