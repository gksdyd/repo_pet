package com.userpet.demo.fapp.contactphone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhonService {

	@Autowired
	PhonDao phonDao;
	
	public List<PhonDto> selectList() {
		return phonDao.selectList();
	}
}
