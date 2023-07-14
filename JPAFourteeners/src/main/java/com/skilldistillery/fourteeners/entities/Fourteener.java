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
	@Column(name = "image_url")
	private String imageUrl;
	@Column (name = "elevation_gained")
	private String elevationGained;
	@Column (name = "max_elevation")
	private String Maxelevation;
	
	
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


	public String getElevationGained() {
		return elevationGained;
	}


	public void setElevationGained(String elevationGained) {
		this.elevationGained = elevationGained;
	}


	public String getMaxelevation() {
		return Maxelevation;
	}


	public void setMaxelevation(String maxelevation) {
		Maxelevation = maxelevation;
	}


	public Boolean getHiked() {
		return hiked;
	}


	public void setHiked(Boolean hiked) {
		this.hiked = hiked;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fourteener [id=").append(id).append(", name=").append(name).append(", description=")
				.append(description).append(", elevationGained=").append(elevationGained).append(", Maxelevation=")
				.append(Maxelevation).append(", hiked=").append(hiked).append(", imageUrl=").append(imageUrl)
				.append("]");
		return builder.toString();
	}


	
	

	
	

}
