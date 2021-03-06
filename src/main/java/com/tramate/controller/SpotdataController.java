package com.tramate.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tramate.dto.SpotdataDto;
import com.tramate.service.SpotdataService;
import com.tramate.upload.SpringFileWriter;

@RestController
@CrossOrigin
public class SpotdataController {

	@Autowired
	private SpotdataService service;

	// Spot�� ���õ� ��������� �� ������ �������� �޼ҵ�
	@GetMapping("/spotTotalCountRelatedSpot")
	public int guideTotalCountRelatedSpot(String spot) {

		return service.getTotalCountRelatedSpot(spot);

	}

	// 지역과 관련된 관광명소 5개를 랜덤으로 뽑는 메소드
	@PostMapping("/spotRandomRelatedSpot")
	public List<SpotdataDto> spotRandomList(@RequestParam String spot) {

		java.util.Map<String, String> map = new HashMap<String, String>();
		int guideTotalCount = service.getTotalCountRelatedSpot(spot);
		System.out.println(spot + "의 총 Spot갯수 : " + guideTotalCount);
		Random rd = new Random();
		int startNum = rd.nextInt(guideTotalCount) + 1;
		if (startNum >= guideTotalCount - 4 && guideTotalCount >= 4)
			startNum = guideTotalCount - 4;
		System.out.println("startNum :" + startNum);
		map.put("spot", spot);
		map.put("start", "" + startNum);
		map.put("end", "" + (startNum + 4));

		return service.spotRandomList(map);

	}

	// Continent와 관련된 관광명소 5개를 랜덤으로 뽑는 메소드
	@PostMapping("/attraction/randomlist/continent")
	public List<SpotdataDto> spotRandomListRelatedContinent(@RequestParam String continent) {

		java.util.Map<String, String> map = new HashMap<String, String>();
		int spotTotalCount = service.SpotCountRelatedContinent(continent);
		System.out.println("SpotTotalCount" + spotTotalCount);

		System.out.println(continent + "의 총 Spot갯수 : " + spotTotalCount);
		Random rd = new Random();
		if (spotTotalCount == 0)
			spotTotalCount = 1;
		int startNum = rd.nextInt(spotTotalCount) + 1;
		if (startNum >= spotTotalCount - 4 && spotTotalCount >= 4)
			startNum = spotTotalCount - 4;
		System.out.println("startNum :" + startNum);
		map.put("continent", continent);
		map.put("start", "" + startNum);
		map.put("end", "" + (startNum + 4));

		return service.spotRandomListRealatedContinent(map);

	}

	// attractionform에 이미지 업로드 시 서버에 이미지 저장
	@RequestMapping(value = "/guide/choice/attraction_img", method = RequestMethod.POST)
	public @ResponseBody void insertTravelerImage(@RequestParam MultipartFile uploadFile, HttpServletRequest request) {

		SpringFileWriter fileWriter = new SpringFileWriter();
		// 저장할 path 구하기
		String path = request.getSession().getServletContext().getRealPath("/save");
		System.out.println("path:" + path);
		fileWriter.writeFile(uploadFile, path);// save 폴더에 저장해주는메서드
	}

	@RequestMapping(value = "/guide/choice/attraction_input", method = RequestMethod.POST)
	public void insertAttractionList(@RequestBody List<SpotdataDto> data) {
		for (SpotdataDto dto : data) {
			// System.out.println(dto);
			service.insertSpotData(dto);
		}
	}
	
	@RequestMapping(value="/spot/distinct")
	public List<String> spotDistinct(){
		
		return service.spotDistinct();
	}
	
	//해당 num의 data 반환
 	@RequestMapping(value="/spot/data", method=RequestMethod.POST)
	public SpotdataDto getSpotData(@RequestParam int num){
		return service.getSpotData(num);
	}

}
