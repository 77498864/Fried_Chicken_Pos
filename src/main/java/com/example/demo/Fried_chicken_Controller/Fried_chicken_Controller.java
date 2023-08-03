package com.example.demo.Fried_chicken_Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.fired_chicken_Model.Fired_chicken_Model;
import com.example.demo.fired_chicken_Model.fired_chicken_item;
import com.example.demo.Fried_chicken_Dao.Fried_chicken_Dao;
import com.example.demo.Fried_chicken_Dao.Fried_chicken_item_Dao;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/")
public class Fried_chicken_Controller {
	@Autowired
	Fried_chicken_Dao dao;
	@Autowired
	Fried_chicken_item_Dao itemDao;
	
	
	@GetMapping("/")
	public List<fired_chicken_item> ItemList(){
		
		return itemDao.findAll();
	}
	@PostMapping("/")
	public int addOrder(@RequestBody Map<String, Object> request) {
		Fired_chicken_Model od = new Fired_chicken_Model();
		od.setPhoneNum((String)request.get("phone"));
		od.setOrderList((String)request.get("orderList"));
		dao.save(od);
		return 1;
	}
	
	@GetMapping("/list")
	public List<Fired_chicken_Model> OrderList() {
		
		return dao.findAll();
	}
}
