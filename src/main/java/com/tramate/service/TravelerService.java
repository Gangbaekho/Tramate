package com.tramate.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tramate.dao.TravelerDao;
import com.tramate.dto.TravelerDto;

@Service
public class TravelerService {

	@Autowired
	private TravelerDao dao;

	// Traveler table에 정보 insert
	public void insertTraveler(TravelerDto dto) {

		dao.insertTraveler(dto);
	}

	// num에 해당하는 Traveler 정보 가져오기
	public TravelerDto getTraveler(int num) {

		return dao.getTraveler(num);
	}

	// Traveler정보 update
	public void updateTraveler(TravelerDto dto) {

		dao.updateTraveler(dto);
	}

	// num에 해당하는 Traveler 정보 삭제
	public void deleteTraveler(int num) {

		dao.deleteTraveler(num);
	}

	// Traveler 전체 명수 count
	public int getTotalCount() {

		return dao.getTotalCount();
	}

	// 아이디와 비밀전호에 맞는 여행객이 존재하는지 찾는 메소드
	public int travelerLogin(Map<String, String> map) {

		return dao.travelerLogin(map);
	}

	// 아이디에 해당하는 Traveler pk가져오는 메소드
	public int getTravelerNumById(String id) {

		return dao.getTravelerNumById(id);
	}

}
