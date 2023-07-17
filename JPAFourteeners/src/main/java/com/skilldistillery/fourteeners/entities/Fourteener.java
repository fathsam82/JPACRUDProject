package com.skilldistillery.fourteeners.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fourteener {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private Boolean hiked;
	@Column(name = "nearest_town")
	private String nearestTown;
	@Column(name = "elevation_gained")
	private String elevationGained;
	@Column(name = "max_elevation")
	private String maxElevation;

	public Fourteener() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getHiked() {
		return hiked;
	}

	public void setHiked(Boolean hiked) {
		this.hiked = hiked;
	}

	public String getNearestTown() {
		return nearestTown;
	}

	public void setNearestTown(String nearestTown) {
		this.nearestTown = nearestTown;
	}

	public String getElevationGained() {
		return elevationGained;
	}

	public void setElevationGained(String elevationGained) {
		this.elevationGained = elevationGained;
	}

	public String getMaxElevation() {
		return maxElevation;
	}

	public void setMaxElevation(String maxElevation) {
		this.maxElevation = maxElevation;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fourteener [id=").append(id).append(", name=").append(name).append(", description=")
				.append(description).append(", hiked=").append(hiked).append(", nearestTown=").append(nearestTown)
				.append(", elevationGained=").append(elevationGained).append(", maxElevation=").append(maxElevation)
				.append("]");
		return builder.toString();
	}

	

}
