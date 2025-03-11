package com.userpet.demo.fapp.groupname;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface GrouDao {

	public List<GrouDto> selectList();
	public GrouDto selectOne(GrouDto grouDto);
	public int insert(GrouDto grouDto);
	public int update(GrouDto grouDto);
	public int delete(GrouDto grouDto);
	public int deleNy(GrouDto grouDto);
}
