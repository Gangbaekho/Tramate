package com.tramate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tramate.dao.TravelerDao;
import com.tramate.dto.TravelerDto;

@Service
public class TravelerService {

	@Autowired
	private TravelerDao dao;
	
	//Dto�� ���� �ϳ��� Traveler�� �����ϴ� �޼ҵ�
		public void insertTraveler(TravelerDto dto) {

			dao.insertTraveler(dto);
		}
		
		//num�� ���� �ϳ��� Traveler�� �д� �޼ҵ�
		public TravelerDto getTraveler(int num) {

			return dao.getTraveler(num);
		}
		
		//Dto�� ���� �ϳ��� Traveler�� ������Ʈ�ϴ� �޼ҵ�
		public void updateTraveler(TravelerDto dto) {

			dao.updateTraveler(dto);
		}
		
		//num�� ���� �ϳ��� Traveler�� �����ϴ� �޼ҵ�
		public void deleteTraveler(int num) {

			dao.deleteTraveler(num);
		}
	
}
