package com.userpet.demo.fapp.contactadd;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AddDao {

//	mapper에서 해당하는 쿼리와 연결시켜 주고 쿼리 결과를 가져옴
	
	public List<AddDto> selectList();
}
