package com.tramate.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tramate.dto.RestaurantdataDto;
import com.tramate.service.RestaurantdataService;

@RestController
public class RestaurantdataController {

	@Autowired
	private RestaurantdataService service;

	// Spot�� ���õ� Restaurant�� �� ������ �������� �޼ҵ�
	@GetMapping("/restaurantTotalCountRelatedSpot")
	public int guideTotalCountRelatedSpot() {

		return service.getTotalCountRelatedSpot("�ٳ�");

	}

	// Spot�� ���õ� Restaurant�� �������� �������� �޼ҵ�
	//���� spot, start ,end�� ���� �����ؾ� �Ѵ�.
	@GetMapping("/restaurantRandom")
	public List<RestaurantdataDto> RestaurantRandomList() {

		java.util.Map<String, String> map = new HashMap<String, String>();
		map.put("spot", "�ٳ�");
		map.put("start", "0");
		map.put("end", "5");
		
		return service.RestaurantRandomList(map);
	}
}
