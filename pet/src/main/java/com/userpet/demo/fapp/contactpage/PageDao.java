package com.userpet.demo.fapp.contactpage;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface PageDao {

	public List<PageDto> selectList();
}
