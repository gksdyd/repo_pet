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
	
	public GrouDto selectOne(GrouDto grouDto) {
		return grouDao.selectOne(grouDto);
	}
	
	public int insert(GrouDto grouDto) {
		return grouDao.insert(grouDto);
	}
	
	public int update(GrouDto grouDto) {
		return grouDao.update(grouDto);
	}
	
	public int delete(GrouDto grouDto) {
		return grouDao.delete(grouDto);
	}
	
	public int deleNy(GrouDto grouDto) {
		return grouDao.deleNy(grouDto);
	}
}
