package com.hz.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hz.ssm.pojo.Linkman;

@RestController
public class LinkManConsumerController {
	//定义一个常量
	public static final String LINK_URL = "http://localhost:8001/linkman/api/v_1.0/";
	
	//restful风格的调用,采用rest的一个模板类调用生产者
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/findLinkanById/{id}")
	public Linkman  findLinkanById(@PathVariable("id") Long linkmanId){
		System.out.println("================================");
		
		Linkman linkman = restTemplate.getForObject(LINK_URL+"getLinkMan/"+linkmanId, Linkman.class);
		
		return linkman;
	}

	
	
	
	
}
