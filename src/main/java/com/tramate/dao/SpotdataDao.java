package com.tramate.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.tramate.dto.SpotdataDto;

@Repository
public class SpotdataDao extends SqlSessionDaoSupport {

	// Dto�� ���� �ϳ��� SpotData�� �����ϴ� �޼ҵ�
	public void insertSpotData(SpotdataDto dto) {

		getSqlSession().insert("insertSpotData", dto);
	}

	// num�� ���� �ϳ��� SpotData�� �д� �޼ҵ�
	public SpotdataDto getSpotData(int num) {

		return getSqlSession().selectOne("selectSpotData", num);
	}

	// Dto�� ���� �ϳ��� SpotData�� ������Ʈ�ϴ� �޼ҵ�
	public void updateSpotData(SpotdataDto dto) {

		getSqlSession().update("updateSpotData", dto);
	}

	// num�� ���� �ϳ��� SpotData�� �����ϴ� �޼ҵ�
	public void deleteSpotData(int num) {

		getSqlSession().delete("deleteSpotData", num);
	}

	// Spotdata�� �� ������ �������� �޼ҵ�
	public int getTotalCount() {

		return getSqlSession().selectOne("spotTotalCount");
	}

	// Spot�� ���õ� �������� �� ���� �������� �޼ҵ�
	public int getTotalCountRelatedSpot(String spot) {

		return getSqlSession().selectOne("spotCountRelatedSpot", spot);
	}
	
	//Spot�� ���õ� �������� �������� �������� �޼ҵ�
	public List<SpotdataDto> spotRandomList(Map<String, String> map){
		
		return getSqlSession().selectList("spotRandomList", map);
	}
}
