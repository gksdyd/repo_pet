package com.userpet.demo.fapp.contactpage;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PageDao {

	public List<PageDto> selectList();
	public PageDto selectOne(PageDto pageDto);
	public int insert(PageDto pageDto);
	public int update(PageDto pageDto);
}
