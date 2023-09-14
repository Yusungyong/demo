package com.example.demo.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.sample.mapper.SampleMapper;
import com.example.demo.sample.service.SampleService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SampleServiceImpl implements SampleService{
	
	@Autowired
	private SampleMapper sampleMapper;

	@Override
	public int insertSampleSvc() {
		int success = sampleMapper.insertSampleTable("str1");
		
		return success;
	}

}
