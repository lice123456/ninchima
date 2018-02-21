package com.ninchima.app.base.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 餐厅推荐表
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
public class RestaurantRecommendReasons implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//餐厅信息表主键
	private Integer restaurantId;
	//来源
	private String source;
	//推荐原因
	private String reason;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：餐厅信息表主键
	 */
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	/**
	 * 获取：餐厅信息表主键
	 */
	public Integer getRestaurantId() {
		return restaurantId;
	}
	/**
	 * 设置：来源
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * 获取：来源
	 */
	public String getSource() {
		return source;
	}
	/**
	 * 设置：推荐原因
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * 获取：推荐原因
	 */
	public String getReason() {
		return reason;
	}
}
