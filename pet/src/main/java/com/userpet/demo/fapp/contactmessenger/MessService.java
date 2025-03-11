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
	
	public MessDto selectOne(MessDto messDto) {
		return messDao.selectOne(messDto);
	}
	
	public int insert(MessDto messDto) {
		return messDao.insert(messDto);
	}
	
	public int update(MessDto messDto) {
		return messDao.update(messDto);
	}
	
	public int delete(MessDto messDto) {
		return messDao.delete(messDto);
	}
	
	public int deleNy(MessDto messDto) {
		return messDao.deleNy(messDto);
	}
}
