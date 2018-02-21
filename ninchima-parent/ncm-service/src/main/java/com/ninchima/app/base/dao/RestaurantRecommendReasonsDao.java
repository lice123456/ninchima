package com.ninchima.app.base.dao;

import java.util.List;

import com.ninchima.app.base.domain.RestaurantRecommendReasons;

/**
 * 餐厅推荐表
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
public interface RestaurantRecommendReasonsDao {

    RestaurantRecommendReasons selectOneByObject(RestaurantRecommendReasons RestaurantRecommendReasons);
	
	List<RestaurantRecommendReasons> selectListByObject(RestaurantRecommendReasons RestaurantRecommendReasons);
		
	Integer insert(RestaurantRecommendReasons restaurantRecommendReasons);
	
	Integer update(RestaurantRecommendReasons restaurantRecommendReasons);
}
