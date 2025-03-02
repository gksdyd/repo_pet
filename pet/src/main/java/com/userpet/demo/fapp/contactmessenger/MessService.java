package com.userpet.demo.fapp.contactmessenger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessService {

	@Autowired
	MessDao messDao;
	
	public List<MessDto> selectList() {
		return messDao.selectList();
	}
}
