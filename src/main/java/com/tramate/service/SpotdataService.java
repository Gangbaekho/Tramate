package com.tramate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tramate.dao.SpotdataDao;
import com.tramate.dto.SpotdataDto;

@Service
public class SpotdataService {

	@Autowired
	private SpotdataDao dao;
	
	//Dto�� ���� �ϳ��� SpotData�� �����ϴ� �޼ҵ�
		public void insertSpotData(SpotdataDto dto) {

			dao.insertSpotData(dto);
		}
		
		//num�� ���� �ϳ��� SpotData�� �д� �޼ҵ�
		public SpotdataDto getSpotData(int num) {

			return dao.getSpotData(num);
		}
		
		//Dto�� ���� �ϳ��� SpotData�� ������Ʈ�ϴ� �޼ҵ�
		public void updateSpotData(SpotdataDto dto) {

			dao.updateSpotData(dto);
		}
		
		//num�� ���� �ϳ��� SpotData�� �����ϴ� �޼ҵ�
		public void deleteSpotData(int num) {

			dao.deleteSpotData(num);
		}
}
