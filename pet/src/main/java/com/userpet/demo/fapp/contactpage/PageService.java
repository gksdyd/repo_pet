package com.userpet.demo.fapp.contactpage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PageService {

	@Autowired
	PageDao pageDao;
	
	public List<PageDto> selectList() {
		return pageDao.selectList();
	}
}
