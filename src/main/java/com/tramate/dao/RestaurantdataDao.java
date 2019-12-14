package com.tramate.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.tramate.dto.ActivitydataDto;
import com.tramate.dto.RestaurantdataDto;

@Repository
public class RestaurantdataDao extends SqlSessionDaoSupport {

	// Dto�� ���� Restaurantdata�� �����ϴ� �޼ҵ�
	public void insertRestaurantData(RestaurantdataDto dto) {

		getSqlSession().insert("insertRestaurantData", dto);
	}

	// num�� ���� Restaurantdata�� ��� �޼ҵ�
	public RestaurantdataDto getRestaurantData(int num) {

		return getSqlSession().selectOne("selectRestaurantData", num);
	}

	// Dto�� ���� Restaurantdata�� ������Ʈ�ϴ� �޼ҵ�
	public void updateRestaurantData(RestaurantdataDto dto) {

		getSqlSession().update("updateRestaurantData", dto);
	}

	// num�� ���� Restaurantdata�� �����ϴ� �޼ҵ�
	public void deleteRestaurantData(int num) {

		getSqlSession().delete("deleteRestaurantData", num);
	}

	// RestaurantData�� �� ������ �������� �޼ҵ�
	public int getTotalCount() {

		return getSqlSession().selectOne("restaurantTotalCount");
	}

	// Spot�� ���õ� Restaurant�� �� ���� �������� �޼ҵ�
	public int getTotalCountRelatedSpot(String spot) {

		return getSqlSession().selectOne("restaurantCountRelatedSpot", spot);
	}

	// Spot�� ���õ� Restaurant�� �������� �������� �޼ҵ�
	public List<RestaurantdataDto> RestaurantRandomList(java.util.Map<String, String> map) {

		return getSqlSession().selectList("restaurantRandomList", map);
	}
	
	
}
