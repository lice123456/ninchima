package com.ninchima.app.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninchima.app.base.dao.RestaurantFeeDao;
import com.ninchima.app.base.domain.RestaurantFee;


/**
 * 餐厅配送信息费用表
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
@Service("restaurantFeeService")
public class RestaurantFeeService implements IRestaurantFeeService {

	@Autowired
	private RestaurantFeeDao restaurantFeeDao;

	@Override
	public RestaurantFee selectOneByObject(RestaurantFee RestaurantFee) {
		return restaurantFeeDao.selectOneByObject(RestaurantFee);
	}

	@Override
	public List<RestaurantFee> selectListByObject(RestaurantFee RestaurantFee) {
		return restaurantFeeDao.selectListByObject(RestaurantFee);
	}

	@Override
	public Integer insert(RestaurantFee restaurantFee) {
		return restaurantFeeDao.insert(restaurantFee);
	}

	@Override
	public Integer update(RestaurantFee restaurantFee) {
		return restaurantFeeDao.update(restaurantFee);
	}
	

}
