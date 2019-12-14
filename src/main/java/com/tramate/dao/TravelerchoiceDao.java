package com.tramate.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.tramate.dto.TravelerchoiceDto;

@Repository
public class TravelerchoiceDao extends SqlSessionDaoSupport {

	// Dto�� ���� �ϳ��� TravelerChoice�� �����ϴ� �޼ҵ�
	public void insertTravelerChoice(TravelerchoiceDto dto) {

		getSqlSession().insert("insertTravelerChoice", dto);
	}

	// num�� ���� �ϳ��� TravelerChoice�� �д� �޼ҵ�
	public TravelerchoiceDto getTravelerChoice(int num) {

		return getSqlSession().selectOne("selectTravelerChoice", num);
	}

	// Dto�� ���� �ϳ��� TravelerChoice�� ������Ʈ�ϴ� �޼ҵ�
	public void updateTravelerChoice(TravelerchoiceDto dto) {

		getSqlSession().update("updateTravelerChoice", dto);
	}

	// num�� ���� �ϳ��� TravelerChoice�� �����ϴ� �޼ҵ�
	public void deleteTravelerChoice(int num) {

		getSqlSession().delete("deleteTravelerChoice", num);
	}

	// TravelerChoice�� �� ������ �������� �޼ҵ�
	public int getTotalCount() {

		return getSqlSession().selectOne("travelerChoiceTotalCount");
	}
}
