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
	
	public AddrDto selectOne(AddrDto addrDto) {
		return addrDao.selectOne(addrDto);
	}
	
	public int insert(AddrDto addrDto) {
		return addrDao.insert(addrDto);
	}
	
	public int update(AddrDto addrDto) {
		return addrDao.update(addrDto);
	}
	
	public int delete(AddrDto addrDto) {
		return addrDao.delete(addrDto);
	}
	
	public int deleNy(AddrDto addrDto) {
		return addrDao.deleNy(addrDto);
	}
}
