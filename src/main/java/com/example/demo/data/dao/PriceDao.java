package com.example.demo.data.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.IndexHistoryDataDto;
import com.example.demo.vo.PriceVo;
@Mapper
public interface PriceDao {
	List<PriceVo> getPrice(HashMap param);
	void insertPrice(PriceVo vo);
	
	Map<String,Object> selectUsCodeCont (Map<String, Object> paramMap);
	//인덱스 인서트
	int insertIndex(IndexHistoryDataDto indexHistoryDataDto);
	
	int insertUsCoded(Map<String, Object> paramMap);
}
