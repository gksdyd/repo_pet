package com.userpet.demo.fapp.contactmail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	@Autowired
	MailDao mailDao;
	
	public List<MailDto> selectList() {
		return mailDao.selectList();
	}
	
	public MailDto selectOne(MailDto mailDto) {
		return mailDao.selectOne(mailDto);
	}
	
	public int insert(MailDto mailDto) {
		return mailDao.insert(mailDto);
	}
	
	public int update(MailDto mailDto) {
		return mailDao.update(mailDto);
	}
	
	public int delete(MailDto mailDto) {
		return mailDao.delete(mailDto);
	}
	
	public int deleNy(MailDto mailDto) {
		return mailDao.deleNy(mailDto);
	}
}
