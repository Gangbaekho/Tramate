package com.tramate.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.javafx.collections.MappingChange.Map;
import com.tramate.dto.ActivitydataDto;
import com.tramate.service.ActivitydataService;

@RestController
public class ActivitydataController {

	@Autowired
	private ActivitydataService service;

	//Spot�� ���õ� Activity�� �� ������ �������� �޼ҵ�
	
	@GetMapping("/activityTotalCountRelatedSpot")
	public int guideTotalCountRelatedSpot() {

		return service.getTotalCountRelatedSpot("�ٳ�");

	}

	// Spot�� ���õ� Activity�� �������� 6�� �������� �޼ҵ�
	//���� spot, start ,end�� ���� �����ؾ� �Ѵ�.
	
	@GetMapping("/activityRandom")
	public List<ActivitydataDto> activityRandomList() {
		
		java.util.Map<String, String> map = new HashMap<String, String>();
		map.put("spot", "�ٳ�");
		map.put("start","0");
		map.put("end","5");
		
		return service.activityRandomList(map);
	}
}
