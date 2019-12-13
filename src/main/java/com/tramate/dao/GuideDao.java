package com.tramate.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.tramate.dto.GuideDto;

@Repository
public class GuideDao extends SqlSessionDaoSupport {

	//Guide�� �� ������ �����ϴ� �޼ҵ�
	public int getTotalCount() {
		
		return getSqlSession().selectOne("GuideTotalCount");
	}
	
	//Dto�� ���� �ϳ��� Guide�� �����ϴ� �޼ҵ�
	public void insertGuide(GuideDto dto) {
		
		getSqlSession().insert("insertGuide", dto);
	}
	
	//num�� ���� �ϳ��� Guide�� �����ϴ� �޼ҵ�
	public GuideDto getGuide(int num) {
		
		return getSqlSession().selectOne("selectGuide", num);
	}
	
	//Dto�� ���� �ϳ��� Guide�� �����ϴ� �޼ҵ�
	public void updateGuide(GuideDto dto) {
		
		getSqlSession().update("updateGuide", dto);
	}
	
	//num�� ���� �ϳ��� Guide�� ����� �޼ҵ�
	public void deleteGuide(int num) {
		
		getSqlSession().delete("deleteGuide", num);
	}

}
