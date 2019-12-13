package com.tramate.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.tramate.dto.TravelerDto;

@Repository
public class TravelerDao extends SqlSessionDaoSupport {

	//Dto�� ���� �ϳ��� Traveler�� �����ϴ� �޼ҵ�
	public void insertTraveler(TravelerDto dto) {
		
		getSqlSession().insert("insertTraveler",dto);
	}
	
	//num�� ���� �ϳ��� Traveler�� �д� �޼ҵ�
	public TravelerDto getTraveler(int num) {
		
		return getSqlSession().selectOne("selectTraveler",num);
	}
	
	//Dto�� ���� �ϳ��� Traveler�� ������Ʈ�ϴ� �޼ҵ�
	public void updateTraveler(TravelerDto dto) {
		
		getSqlSession().update("updateTraveler", dto);
	}
	
	//num�� ���� �ϳ��� Traveler�� �����ϴ� �޼ҵ�
	public void deleteTraveler(int num) {
		
		getSqlSession().delete("deleteTraveler", num);
	}
}
