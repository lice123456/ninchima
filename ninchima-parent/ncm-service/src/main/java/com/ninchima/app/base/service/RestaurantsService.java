package com.ninchima.app.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninchima.app.base.dao.RestaurantsDao;
import com.ninchima.app.base.domain.Restaurants;


/**
 * 餐厅信息表
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
@Service("restaurantsService")
public class RestaurantsService implements IRestaurantsService {

	@Autowired
	private RestaurantsDao restaurantsDao;

	@Override
	public Restaurants selectOneByObject(Restaurants Restaurants) {
		return restaurantsDao.selectOneByObject(Restaurants);
	}

	@Override
	public List<Restaurants> selectListByObject(Restaurants Restaurants) {
		return restaurantsDao.selectListByObject(Restaurants);
	}

	@Override
	public Integer insert(Restaurants restaurants) {
		return restaurantsDao.insert(restaurants);
	}

	@Override
	public Integer update(Restaurants restaurants) {
		return restaurantsDao.update(restaurants);
	}
	
	
}
