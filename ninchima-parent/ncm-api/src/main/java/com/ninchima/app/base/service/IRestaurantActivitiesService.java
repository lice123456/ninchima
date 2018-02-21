package com.ninchima.app.base.service;

import java.util.List;

import com.ninchima.app.base.domain.RestaurantActivities;

/**
 * 餐厅活动信息表
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
public interface IRestaurantActivitiesService {
	
	RestaurantActivities selectOneByObject(RestaurantActivities RestaurantActivities);
	
	List<RestaurantActivities> selectListByObject(RestaurantActivities RestaurantActivities);
		
	Integer insert(RestaurantActivities restaurantActivities);
	
	Integer update(RestaurantActivities restaurantActivities);
	
}
