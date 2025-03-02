package com.userpet.demo.fapp.contactmail;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MailDao {

	public List<MailDto> selectList();
}
