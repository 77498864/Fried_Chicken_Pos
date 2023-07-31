package com.example.demo.Fried_chicken_Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.fired_chicken_Model.Fired_chicken_Model;
import org.springframework.data.jpa.repository.Query;

public interface Fried_chicken_Dao extends JpaRepository<Fired_chicken_Model, Long>{
	
}
