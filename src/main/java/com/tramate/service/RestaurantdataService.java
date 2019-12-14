package com.tramate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tramate.dao.RestaurantdataDao;
import com.tramate.dto.RestaurantdataDto;

@Service
public class RestaurantdataService {

	@Autowired
	private RestaurantdataDao dao;

	// Dto�� ���� Restaurantdata�� �����ϴ� �޼ҵ�
	public void insertRestaurantData(RestaurantdataDto dto) {

		dao.insertRestaurantData(dto);
	}

	// num�� ���� Restaurantdata�� ��� �޼ҵ�
	public RestaurantdataDto getRestaurantData(int num) {

		return dao.getRestaurantData(num);
	}

	// Dto�� ���� Restaurantdata�� ������Ʈ�ϴ� �޼ҵ�
	public void updateRestaurantData(RestaurantdataDto dto) {

		dao.updateRestaurantData(dto);
	}

	// num�� ���� Restaurantdata�� �����ϴ� �޼ҵ�
	public void deleteRestaurantData(int num) {

		dao.deleteRestaurantData(num);
	}

	// �� ������ �������� �޼ҵ�
	public int getTotalCount() {

		return dao.getTotalCount();
	}
}
