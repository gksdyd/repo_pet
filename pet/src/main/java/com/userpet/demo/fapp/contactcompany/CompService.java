package com.userpet.demo.fapp.contactcompany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompService {

	@Autowired
	CompDao compDao;
	
	public List<CompDto> selectList() {
		return compDao.selectList();
	}
}
