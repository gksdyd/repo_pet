package com.userpet.demo.fapp.contactaddress;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddrService {

	@Autowired
	AddrDao addrDao;
	
	public List<AddrDto> selectList() {
		return addrDao.selectList();
	}
}
