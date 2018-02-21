package com.ninchima.app.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninchima.app.base.dao.RestaurantScoreDao;
import com.ninchima.app.base.domain.RestaurantScore;

/**
 * 餐厅得分评价表
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
@Service("restaurantScoreService")
public class RestaurantScoreService implements IRestaurantScoreService {

	@Autowired
	private RestaurantScoreDao restaurantScoreDao;

	@Override
	public RestaurantScore selectOneByObject(RestaurantScore RestaurantScore) {
		return restaurantScoreDao.selectOneByObject(RestaurantScore);
	}

	@Override
	public List<RestaurantScore> selectListByObject(RestaurantScore RestaurantScore) {
		return restaurantScoreDao.selectListByObject(RestaurantScore);
	}

	@Override
	public Integer insert(RestaurantScore restaurantScore) {
		return restaurantScoreDao.insert(restaurantScore);
	}

	@Override
	public Integer update(RestaurantScore restaurantScore) {
		return restaurantScoreDao.update(restaurantScore);
	}
	
	
	
}
