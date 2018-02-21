package com.ninchima.app.base.dao;

import java.util.List;

import com.ninchima.app.base.domain.RestaurantFee;

/**
 * 餐厅配送信息费用表
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
public interface RestaurantFeeDao {

    RestaurantFee selectOneByObject(RestaurantFee RestaurantFee);
	
	List<RestaurantFee> selectListByObject(RestaurantFee RestaurantFee);
		
	Integer insert(RestaurantFee restaurantFee);
	
	Integer update(RestaurantFee restaurantFee);
}
