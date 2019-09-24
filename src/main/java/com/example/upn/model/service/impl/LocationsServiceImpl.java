package com.example.upn.model.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.upn.model.entity.Locations;
import com.example.upn.model.repository.LocationsRepository;
import com.example.upn.model.service.LocationsService;

public class LocationsServiceImpl implements LocationsService {
	@Autowired
	private LocationsRepository locationsRepository;
	@Transactional(readOnly = true)
	@Override
	public List<Locations> findAll() throws Exception {
		// TODO Auto-generated method stub
		return locationsRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Locations> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return locationsRepository.findById(id);
	}
	@Transactional
	@Override
	public Locations save(Locations entity) throws Exception {
		// TODO Auto-generated method stub
		return locationsRepository.save(entity);
	}
	@Transactional
	@Override
	public Locations update(Locations entity) throws Exception {
		// TODO Auto-generated method stub
		return locationsRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		locationsRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		locationsRepository.deleteAll();
	}

}
