package com.ninchima.app.base.domain;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 地理位置信息
 * 
 * @author wugz
 * @email 1019036248@qq.com
 * @date 2018-02-21 20:32:36
 */
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer addressId;
	//地址位置
	private String addressName;
	//经度
	private BigDecimal addressLongitude;
	//纬度
	private BigDecimal addressLatitude;
	//是否生效（A:生效；I：失效）
	private String addressActv;
	//是否克隆（Y：克隆；N:非克隆）
	private String addressClone;
	//创建时间
	private String createTime;
	//操作时间
	private String optTime;
	//
	private String remark;

	/**
	 * 设置：
	 */
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	/**
	 * 获取：
	 */
	public Integer getAddressId() {
		return addressId;
	}
	/**
	 * 设置：地址位置
	 */
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	/**
	 * 获取：地址位置
	 */
	public String getAddressName() {
		return addressName;
	}
	/**
	 * 设置：经度
	 */
	public void setAddressLongitude(BigDecimal addressLongitude) {
		this.addressLongitude = addressLongitude;
	}
	/**
	 * 获取：经度
	 */
	public BigDecimal getAddressLongitude() {
		return addressLongitude;
	}
	/**
	 * 设置：纬度
	 */
	public void setAddressLatitude(BigDecimal addressLatitude) {
		this.addressLatitude = addressLatitude;
	}
	/**
	 * 获取：纬度
	 */
	public BigDecimal getAddressLatitude() {
		return addressLatitude;
	}
	/**
	 * 设置：是否生效（A:生效；I：失效）
	 */
	public void setAddressActv(String addressActv) {
		this.addressActv = addressActv;
	}
	/**
	 * 获取：是否生效（A:生效；I：失效）
	 */
	public String getAddressActv() {
		return addressActv;
	}
	/**
	 * 设置：是否克隆（Y：克隆；N:非克隆）
	 */
	public void setAddressClone(String addressClone) {
		this.addressClone = addressClone;
	}
	/**
	 * 获取：是否克隆（Y：克隆；N:非克隆）
	 */
	public String getAddressClone() {
		return addressClone;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public String getCreateTime() {
		return createTime;
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
