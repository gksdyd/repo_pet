package com.userpet.demo.fapp.contactcompany;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CompDao {

	public List<CompDto> selectList();
}
