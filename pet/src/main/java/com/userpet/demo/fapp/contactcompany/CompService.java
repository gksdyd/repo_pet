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
	
	public CompDto selectOne(CompDto compDto) {
		return compDao.selectOne(compDto);
	}
	
	public int insert(CompDto compDto) {
		return compDao.insert(compDto);
	}
	
	public int update(CompDto compDto) {
		return compDao.update(compDto);
	}
	
	public int delete(CompDto compDto) {
		return compDao.delete(compDto);
	}
	
	public int deleNy(CompDto compDto) {
		return compDao.deleNy(compDto);
	}
}
