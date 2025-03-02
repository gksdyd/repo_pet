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
}
