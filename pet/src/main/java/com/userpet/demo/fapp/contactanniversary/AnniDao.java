package com.userpet.demo.fapp.contactanniversary;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AnniDao {

//	mapper에서 해당하는 쿼리와 연결시켜 주고 쿼리 결과를 가져옴
	
	public List<AnniDto> selectList();
	public AnniDto selectOne(AnniDto anniDto);
	public int insert(AnniDto anniDto);
	public int update(AnniDto anniDto);
	public int delete(AnniDto anniDto);
	public int deleNy(AnniDto anniDto);
}
