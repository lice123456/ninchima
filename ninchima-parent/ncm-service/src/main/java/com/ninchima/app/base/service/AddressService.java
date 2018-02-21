package com.ninchima.app.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninchima.app.base.dao.AddressDao;
import com.ninchima.app.base.domain.Address;


/**
 * 地理位置信息
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
@Service("addressService")
public class AddressService implements IAddressService {

	@Autowired
	private AddressDao addressDao;

	@Override
	public Address selectOneByObject(Address Address) {
		return addressDao.selectOneByObject(Address);
	}

	@Override
	public List<Address> selectListByObject(Address Address) {
		return addressDao.selectListByObject(Address);
	}

	@Override
	public Integer insert(Address address) {
		return addressDao.insert(address);
	}

	@Override
	public Integer update(Address address) {
		return addressDao.update(address);
	}
}
