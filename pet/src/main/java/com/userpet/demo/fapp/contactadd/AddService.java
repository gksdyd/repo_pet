package com.userpet.demo.fapp.contactadd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddService {

//	로직을 정의하는 부분
	
//	여러건의 데이터를 가지고 온다.
	
	@Autowired
	AddDao addDao;
	
//	public List<AddDto> selectList() {
//		List<AddDto> addDtos = new ArrayList<>();
//		addDtos = addDao.selectList();
//		
//		return addDtos;
//	}
	
	public List<AddDto> selectList() {
		return addDao.selectList();
	}
}
