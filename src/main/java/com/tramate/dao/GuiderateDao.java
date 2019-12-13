package com.tramate.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.tramate.dto.GuiderateDto;

@Repository
public class GuiderateDao extends SqlSessionDaoSupport{

	//num�� �̿��Ͽ� �ϳ��� Guiderate�� �������� �޼ҵ�
	public GuiderateDto getGuideRate(int num) {
		
		return getSqlSession().selectOne("selectGuideRate", num);
	}
	
	//Dto�� �̿��Ͽ� Guiderate�� �߰��ϴ� �޼ҵ�
	public void insertGuideRate(GuiderateDto dto) {
		
		getSqlSession().insert("insertGuideRate", dto);
	}
	
	//Dto�� �̿��Ͽ� Guiderate�� �����ϴ� �޼ҵ�
	public void updateGuideRate(GuiderateDto dto) {
		
		getSqlSession().update("updateGuideRate", dto);
	}
	
	//num�� �̿��Ͽ� GuideRate�� ����� �޼ҵ�
	public void deleteGuideRate(int num) {
		
		getSqlSession().delete("deleteGuideRate", num);
	}
	
	//��� Guiderate�� �������� �޼ҵ�
	public List<GuiderateDto> getGuideRateList(){
		
		return getSqlSession().selectList("selectGuideRateList");
	}
}
