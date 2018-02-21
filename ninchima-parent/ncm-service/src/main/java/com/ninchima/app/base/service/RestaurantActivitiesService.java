package com.ninchima.app.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninchima.app.base.dao.RestaurantActivitiesDao;
import com.ninchima.app.base.domain.RestaurantActivities;


/**
 * 餐厅活动信息表
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
@Service("restaurantActivitiesService")
public class RestaurantActivitiesService implements IRestaurantActivitiesService {

	@Autowired
	private RestaurantActivitiesDao restaurantActivitiesDao;

	@Override
	public RestaurantActivities selectOneByObject(RestaurantActivities RestaurantActivities) {
		return restaurantActivitiesDao.selectOneByObject(RestaurantActivities);
	}

	@Override
	public List<RestaurantActivities> selectListByObject(RestaurantActivities RestaurantActivities) {
		return restaurantActivitiesDao.selectListByObject(RestaurantActivities);
	}

	@Override
	public Integer insert(RestaurantActivities restaurantActivities) {
		return restaurantActivitiesDao.insert(restaurantActivities);
	}

	@Override
	public Integer update(RestaurantActivities restaurantActivities) {
		return restaurantActivitiesDao.update(restaurantActivities);
	}
	
	
	
}
