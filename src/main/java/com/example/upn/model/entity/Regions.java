package com.example.upn.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "regions")
public class Regions {
	@Id
	@Column(name = "region_id")
	private Integer region_id;
	
	@OneToMany(mappedBy = "countries", fetch = FetchType.LAZY)
	private List<Countries> countries;
	
	@Column(name = "region_name", length = 25)
	private String region_name;

	public Integer getRegion_id() {
		return region_id;
	}

	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}

	public List<Countries> getCountries() {
		return countries;
	}

	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	}

	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	
	
	
	
}
