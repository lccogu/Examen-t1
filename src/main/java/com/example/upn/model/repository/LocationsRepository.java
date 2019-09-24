package com.example.upn.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.upn.model.entity.Locations;

@Repository
public interface LocationsRepository extends JpaRepository<Locations,Integer>{

}
