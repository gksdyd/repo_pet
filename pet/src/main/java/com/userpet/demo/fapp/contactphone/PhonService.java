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
	
	public PhonDto selectOne(PhonDto phonDto) {
		return phonDao.selectOne(phonDto);
	}
	
	public int insert(PhonDto phonDto) {
		return phonDao.insert(phonDto);
	}
	
	public int update(PhonDto phonDto) {
		return phonDao.update(phonDto);
	}
	
	public int delete(PhonDto phonDto) {
		return phonDao.delete(phonDto);
	}
	
	public int deleNy(PhonDto phonDto) {
		return phonDao.deleNy(phonDto);
	}
}
