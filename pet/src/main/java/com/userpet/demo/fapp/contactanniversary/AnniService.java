package com.userpet.demo.fapp.contactanniversary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnniService {

//	로직을 정의하는 부분
	
//	여러건의 데이터를 가지고 온다.
	
	@Autowired
	AnniDao anniDao;
	
//	public List<AnniDto> selectList() {
//		List<AnniDto> anniDtos = new ArrayList<>();
//		anniDtos = anniDao.selectList();
//		
//		return anniDtos;
//	}
	
	public List<AnniDto> selectList() {
		return anniDao.selectList();
	}
	
	public AnniDto selectOne(AnniDto anniDto) {
		return anniDao.selectOne(anniDto);
	}
	
	public int insert(AnniDto anniDto) {
		return anniDao.insert(anniDto);
	}
	
	public int update(AnniDto anniDto) {
		return anniDao.update(anniDto);
	}
}
