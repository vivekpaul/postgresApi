package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface birthdatesRepository extends CrudRepository<DobData, Long> {

	List<DobData> findAll();
}
