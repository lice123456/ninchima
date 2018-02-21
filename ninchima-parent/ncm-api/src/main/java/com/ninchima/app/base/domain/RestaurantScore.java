package com.ninchima.app.base.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 餐厅得分评价表
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
public class RestaurantScore implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//餐厅信息表主键
	private Integer restaurantId;
	//来源
	private String source;
	//高于周边商家
	private String compareRating;
	//菜品评价
	private String foodScore;
	//服务态度
	private String serviceScore;
	//综合评价
	private String starLevel;
	//操作时间
	private String optTime;

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
	 * 设置：高于周边商家
	 */
	public void setCompareRating(String compareRating) {
		this.compareRating = compareRating;
	}
	/**
	 * 获取：高于周边商家
	 */
	public String getCompareRating() {
		return compareRating;
	}
	/**
	 * 设置：菜品评价
	 */
	public void setFoodScore(String foodScore) {
		this.foodScore = foodScore;
	}
	/**
	 * 获取：菜品评价
	 */
	public String getFoodScore() {
		return foodScore;
	}
	/**
	 * 设置：服务态度
	 */
	public void setServiceScore(String serviceScore) {
		this.serviceScore = serviceScore;
	}
	/**
	 * 获取：服务态度
	 */
	public String getServiceScore() {
		return serviceScore;
	}
	/**
	 * 设置：综合评价
	 */
	public void setStarLevel(String starLevel) {
		this.starLevel = starLevel;
	}
	/**
	 * 获取：综合评价
	 */
	public String getStarLevel() {
		return starLevel;
	}
	/**
	 * 设置：操作时间
	 */
	public void setOptTime(String optTime) {
		this.optTime = optTime;
	}
	/**
	 * 获取：操作时间
	 */
	public String getOptTime() {
		return optTime;
	}
}
