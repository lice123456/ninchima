package com.ninchima.app.base.service;

import java.util.List;

import com.ninchima.app.base.domain.RestaurantScore;

/**
 * 餐厅得分评价表
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
public interface IRestaurantScoreService {
	
	RestaurantScore selectOneByObject(RestaurantScore RestaurantScore);
	
	List<RestaurantScore> selectListByObject(RestaurantScore RestaurantScore);
		
	Integer insert(RestaurantScore restaurantScore);
	
	Integer update(RestaurantScore restaurantScore);
	
}
