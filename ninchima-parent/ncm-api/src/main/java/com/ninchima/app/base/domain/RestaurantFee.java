package com.ninchima.app.base.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 餐厅配送信息费用表
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
public class RestaurantFee implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Integer id;
	//餐厅信息表主键
	private Integer restaurantId;
	//
	private String source;
	//起送价格
	private String price;
	//配送费
	private String fee;
	//操作时间
	private String optTime;

	/**
	 * 设置：主键
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：主键
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
	 * 设置：
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * 获取：
	 */
	public String getSource() {
		return source;
	}
	/**
	 * 设置：起送价格
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * 获取：起送价格
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * 设置：配送费
	 */
	public void setFee(String fee) {
		this.fee = fee;
	}
	/**
	 * 获取：配送费
	 */
	public String getFee() {
		return fee;
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
