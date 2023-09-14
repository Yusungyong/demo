package com.example.demo.sample.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleMapper {
	public int insertSampleTable(String str);
}
