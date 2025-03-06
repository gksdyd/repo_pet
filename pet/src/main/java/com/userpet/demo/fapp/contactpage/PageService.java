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
	
	public PageDto selectOne(PageDto pageDto) {
		return pageDao.selectOne(pageDto);
	}
	
	public int insert(PageDto pageDto) {
		return pageDao.insert(pageDto);
	}
	
	public int update(PageDto pageDto) {
		return pageDao.update(pageDto);
	}
}
