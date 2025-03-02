package com.userpet.demo.fapp.groupname;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrouService {

	@Autowired
	GrouDao grouDao;
	
	public List<GrouDto> selectList() {
		return grouDao.selectList();
	}
}
