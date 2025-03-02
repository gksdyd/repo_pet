package com.userpet.demo.fapp.contactaddress;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AddrDao {

	public List<AddrDto> selectList();
}
