package com.userpet.demo.fapp.contactmessenger;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MessDao {

	public List<MessDto> selectList();
	public MessDto selectOne(MessDto messDto);
	public int insert(MessDto messDto);
	public int update(MessDto messDto);
}
