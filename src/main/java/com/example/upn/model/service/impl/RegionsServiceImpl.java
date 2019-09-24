package com.example.upn.model.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.example.upn.model.entity.Regions;
import com.example.upn.model.repository.RegionsRepository;
import com.example.upn.model.service.RegionsService;


public class RegionsServiceImpl implements RegionsService {

	private RegionsRepository regionsRepository;
	@Transactional(readOnly = true)
	@Override
	public List<Regions> findAll() throws Exception {
		// TODO Auto-generated method stub
		return regionsRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Regions> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return regionsRepository.findById(id);
	}
	@Transactional
	@Override
	public Regions save(Regions entity) throws Exception {
		// TODO Auto-generated method stub
		return regionsRepository.save(entity);
	}
	@Transactional
	@Override
	public Regions update(Regions entity) throws Exception {
		// TODO Auto-generated method stub
		return regionsRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		regionsRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		regionsRepository.deleteAll();
	}


}
