package com.userpet.demo.fapp.contactphone;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PhonDao {

	public List<PhonDto> selectList();
}
