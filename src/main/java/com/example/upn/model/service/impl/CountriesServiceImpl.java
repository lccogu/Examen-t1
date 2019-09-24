package com.example.upn.model.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.upn.model.entity.Countries;
import com.example.upn.model.repository.CountriesRepository;
import com.example.upn.model.service.CountriesService;

public class CountriesServiceImpl implements CountriesService{
	@Autowired
	private CountriesRepository countriesRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Countries> findAll() throws Exception {
		// TODO Auto-generated method stub
		return countriesRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<Countries> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return countriesRepository.findById(id);
	}
	@Transactional
	@Override
	public Countries save(Countries entity) throws Exception {
		// TODO Auto-generated method stub
		return countriesRepository.save(entity);
	}
	@Transactional
	@Override
	public Countries update(Countries entity) throws Exception {
		// TODO Auto-generated method stub
		return countriesRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		countriesRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		countriesRepository.deleteAll();
	}

}
