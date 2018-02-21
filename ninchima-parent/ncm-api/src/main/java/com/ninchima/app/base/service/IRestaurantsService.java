package com.ninchima.app.base.service;

import java.util.List;

import com.ninchima.app.base.domain.Restaurants;

/**
 * 餐厅信息表
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
public interface IRestaurantsService {
	
	Restaurants selectOneByObject(Restaurants Restaurants);
	
	List<Restaurants> selectListByObject(Restaurants Restaurants);
		
	Integer insert(Restaurants restaurants);
	
	Integer update(Restaurants restaurants);
	
}
