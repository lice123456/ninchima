package com.ninchima.app.base.domain;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 餐厅信息表
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
public class Restaurants implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键（自增，餐厅其他信息使用）
	private Integer restaurantId;
	//地址信息表的主键
	private Integer addressId;
	//餐厅名称
	private String name;
	//餐厅地址
	private String address;
	//经度
	private BigDecimal longitude;
	//纬度
	private BigDecimal latitude;
	//开业时间
	private String openingHours;
	//餐厅电话
	private String phone;
	//餐厅图片地址
	private String imagePath;
	//平均送餐时间
	private String orderLeadTime;
	//餐厅来源
	private String source;
	//饿了么平台id
	private String elePlatformId;
	//饿了么平台最近订单数
	private Integer eleRecentOrderNum;
	//
	private String createTime;
	//
	private String optTime;
	//
	private String remark;

	/**
	 * 设置：主键（自增，餐厅其他信息使用）
	 */
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	/**
	 * 获取：主键（自增，餐厅其他信息使用）
	 */
	public Integer getRestaurantId() {
		return restaurantId;
	}
	/**
	 * 设置：地址信息表的主键
	 */
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	/**
	 * 获取：地址信息表的主键
	 */
	public Integer getAddressId() {
		return addressId;
	}
	/**
	 * 设置：餐厅名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：餐厅名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：餐厅地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：餐厅地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：经度
	 */
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	/**
	 * 获取：经度
	 */
	public BigDecimal getLongitude() {
		return longitude;
	}
	/**
	 * 设置：纬度
	 */
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	/**
	 * 获取：纬度
	 */
	public BigDecimal getLatitude() {
		return latitude;
	}
	/**
	 * 设置：开业时间
	 */
	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}
	/**
	 * 获取：开业时间
	 */
	public String getOpeningHours() {
		return openingHours;
	}
	/**
	 * 设置：餐厅电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：餐厅电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：餐厅图片地址
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	/**
	 * 获取：餐厅图片地址
	 */
	public String getImagePath() {
		return imagePath;
	}
	/**
	 * 设置：平均送餐时间
	 */
	public void setOrderLeadTime(String orderLeadTime) {
		this.orderLeadTime = orderLeadTime;
	}
	/**
	 * 获取：平均送餐时间
	 */
	public String getOrderLeadTime() {
		return orderLeadTime;
	}
	/**
	 * 设置：餐厅来源
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * 获取：餐厅来源
	 */
	public String getSource() {
		return source;
	}
	/**
	 * 设置：饿了么平台id
	 */
	public void setElePlatformId(String elePlatformId) {
		this.elePlatformId = elePlatformId;
	}
	/**
	 * 获取：饿了么平台id
	 */
	public String getElePlatformId() {
		return elePlatformId;
	}
	/**
	 * 设置：饿了么平台最近订单数
	 */
	public void setEleRecentOrderNum(Integer eleRecentOrderNum) {
		this.eleRecentOrderNum = eleRecentOrderNum;
	}
	/**
	 * 获取：饿了么平台最近订单数
	 */
	public Integer getEleRecentOrderNum() {
		return eleRecentOrderNum;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public String getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setOptTime(String optTime) {
		this.optTime = optTime;
	}
	/**
	 * 获取：
	 */
	public String getOptTime() {
		return optTime;
	}
	/**
	 * 设置：
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：
	 */
	public String getRemark() {
		return remark;
	}
}
