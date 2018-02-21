package com.ninchima.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninchima.app.base.domain.Address;
import com.ninchima.app.base.service.IAddressService;
import com.ninchima.app.data.utils.cookie.CookieHelper;

@RestController
public class HelloController {
	
	@Autowired
	private IAddressService addressService;
	
	@Autowired
	private CookieHelper cookie;
	
	@RequestMapping("/hello")
	public Object sayHello() {
		Address add = new Address();
		add.setAddressName("和丽苑");
		addressService.insert(add);
		
		List<Address> list = addressService.selectListByObject(new Address());
		return list;
	}
}
