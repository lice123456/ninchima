package com.ninchima.app.base.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 餐厅活动信息表
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
public class RestaurantActivities implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Integer id;
	//餐厅信息表主键
	private Integer restaurantId;
	//来源
	private String source;
	//活动名称
	private String name;
	//活动描述
	private String description;
	//活动图标名称
	private String iconName;
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
	 * 设置：活动名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：活动名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：活动描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：活动描述
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：活动图标名称
	 */
	public void setIconName(String iconName) {
		this.iconName = iconName;
	}
	/**
	 * 获取：活动图标名称
	 */
	public String getIconName() {
		return iconName;
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
