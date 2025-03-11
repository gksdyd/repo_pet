package com.userpet.demo.fapp.contactcompany;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CompDao {

	public List<CompDto> selectList();
	public CompDto selectOne(CompDto compDto);
	public int insert(CompDto compDto);
	public int update(CompDto compDto);
	public int delete(CompDto compDto);
	public int deleNy(CompDto compDto);
}
