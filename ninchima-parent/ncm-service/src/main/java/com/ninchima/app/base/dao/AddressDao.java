package com.ninchima.app.base.dao;

import java.util.List;

import com.ninchima.app.base.domain.Address;

/**
 * 地理位置信息
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
public interface AddressDao {

    Address selectOneByObject(Address Address);
	
	List<Address> selectListByObject(Address Address);
		
	Integer insert(Address address);
	
	Integer update(Address address);
}
