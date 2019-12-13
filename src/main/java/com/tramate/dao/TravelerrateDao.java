package com.tramate.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.tramate.dto.TravelerrateDto;

@Repository
public class TravelerrateDao extends SqlSessionDaoSupport{

	//Dto�� ���� �ϳ��� TravelerRate�� �����ϴ� �޼ҵ�
	public void insertTravelerRate(TravelerrateDto dto) {
		
		getSqlSession().insert("insertTravelerRate", dto);
	}
	
	//num�� ���� �ϳ��� TravelerRate�� �д� �޼ҵ�
	public TravelerrateDto getTravelerRate(int num) {
		
		return getSqlSession().selectOne("selectTravelerRate", num);
	}
	
	//Dto�� ���� �ϳ��� TravelerRate�� ������Ʈ�ϴ� �޼ҵ�
	public void updateTravelerRate(TravelerrateDto dto) {
		
		getSqlSession().update("updateTravelerRate", dto);
	}
	
	//num�� ���ؼ� �ϳ��� TravelerRate�� �����ϴ� �޼ҵ�
	public void deleteTravelerRate(int num) {
		
		getSqlSession().delete("deleteTravelerRate", num);
	}
}
