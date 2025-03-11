package com.userpet.demo.fapp.contactmail;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MailDao {

	public List<MailDto> selectList();
	public MailDto selectOne(MailDto mailDto);
	public int insert(MailDto mailDto);
	public int update(MailDto mailDto);
	public int delete(MailDto mailDto);
	public int deleNy(MailDto mailDto);
}
