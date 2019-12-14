package com.tramate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tramate.dao.GuideDao;
import com.tramate.dto.GuideDto;

@Service
public class GuideService {

	@Autowired
	private GuideDao dao;

	public int getTotalCount() {

		return dao.getTotalCount();
	}

	// Dto�� ���� �ϳ��� Guide�� �����ϴ� �޼ҵ�
	public void insertGuide(GuideDto dto) {

		dao.insertGuide(dto);
	}

	// num�� ���� �ϳ��� Guide�� �����ϴ� �޼ҵ�
	public GuideDto getGuide(int num) {

		return dao.getGuide(num);
	}

	// Dto�� ���� �ϳ��� Guide�� �����ϴ� �޼ҵ�
	public void updateGuide(GuideDto dto) {

		dao.updateGuide(dto);
	}

	// num�� ���� �ϳ��� Guide�� ����� �޼ҵ�
	public void deleteGuide(int num) {

		dao.deleteGuide(num);
	}

	
}
