package com.ninchima.app.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninchima.app.base.dao.RestaurantRecommendReasonsDao;
import com.ninchima.app.base.domain.RestaurantRecommendReasons;

/**
 * 餐厅推荐表
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
@Service("restaurantRecommendReasonsService")
public class RestaurantRecommendReasonsService implements IRestaurantRecommendReasonsService {

	@Autowired
	private RestaurantRecommendReasonsDao restaurantRecommendReasonsDao;

	@Override
	public RestaurantRecommendReasons selectOneByObject(RestaurantRecommendReasons RestaurantRecommendReasons) {
		return restaurantRecommendReasonsDao.selectOneByObject(RestaurantRecommendReasons);
	}

	@Override
	public List<RestaurantRecommendReasons> selectListByObject(RestaurantRecommendReasons RestaurantRecommendReasons) {
		return restaurantRecommendReasonsDao.selectListByObject(RestaurantRecommendReasons);
	}

	@Override
	public Integer insert(RestaurantRecommendReasons restaurantRecommendReasons) {
		return restaurantRecommendReasonsDao.insert(restaurantRecommendReasons);
	}

	@Override
	public Integer update(RestaurantRecommendReasons restaurantRecommendReasons) {
		return restaurantRecommendReasonsDao.update(restaurantRecommendReasons);
	}
	
}
