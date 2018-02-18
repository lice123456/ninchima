package com.ninchima.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninchima.app.test.domain.sUsr;
import com.ninchima.app.test.service.IsUsrService;

@RestController
public class HelloController {
	
	@Autowired
	private IsUsrService sUsrService;
	
	@RequestMapping("/hello")
	public Object sayHello() {
		return sUsrService.selectAll(new sUsr());
	}
}
