package com.userpet.demo.fapp.contactphone;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PhonDao {

	public List<PhonDto> selectList();
	public PhonDto selectOne(PhonDto phonDto);
	public int insert(PhonDto phonDto);
	public int update(PhonDto phonDto);
	public int delete(PhonDto phonDto);
	public int deleNy(PhonDto phonDto);
}
