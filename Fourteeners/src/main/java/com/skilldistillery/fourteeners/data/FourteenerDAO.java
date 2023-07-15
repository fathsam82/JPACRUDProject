package com.skilldistillery.fourteeners.data;

import java.util.List;

import com.skilldistillery.fourteeners.entities.Fourteener;

public interface FourteenerDAO {
	Fourteener findById(int id);
	List<Fourteener> findAll();
	Fourteener create(Fourteener fourteener);
	Fourteener update(int fourteenerId, Fourteener fourteener);
	boolean deleteById(int fourteenerId);
}
