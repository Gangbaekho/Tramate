package com.tramate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tramate.dao.TravelerchoiceDao;
import com.tramate.dto.TravelerchoiceDto;

@Service
public class TravelerchoiceService {

	@Autowired
	private TravelerchoiceDao dao;

	// Dto�� ���� �ϳ��� TravelerChoice�� �����ϴ� �޼ҵ�
	public void insertTravelerChoice(TravelerchoiceDto dto) {

		dao.insertTravelerChoice(dto);
	}

	// num�� ���� �ϳ��� TravelerChoice�� �д� �޼ҵ�
	public TravelerchoiceDto getTravelerChoice(int num) {

		return dao.getTravelerChoice(num);
	}

	// Dto�� ���� �ϳ��� TravelerChoice�� ������Ʈ�ϴ� �޼ҵ�
	public void updateTravelerChoice(TravelerchoiceDto dto) {

		dao.updateTravelerChoice(dto);
	}

	// num�� ���� �ϳ��� TravelerChoice�� �����ϴ� �޼ҵ�
	public void deleteTravelerChoice(int num) {

		dao.deleteTravelerChoice(num);
	}

	// �� ������ �������� �޼ҵ�
	public int getTotalCount() {

		return dao.getTotalCount();
	}
}
