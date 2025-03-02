package com.userpet.demo.fapp.groupname;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface GrouDao {

	public List<GrouDto> selectList();
}
