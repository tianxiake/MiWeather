package com.runningsnail.miweather.entity;

/**
 * @author yongjie created on 2019-11-16.
 */
public class MiLocation {
	/**
	 * 精度值
	 */
	private double altitude;
	/**
	 * 纬度值
	 */
	private double latitude;

	/**
	 * 获取国家
	 */
	private String country;
	/**
	 * 获取省份
	 */
	private String province;

	/**
	 * 获取城市
	 */
	private String city;

	/**
	 * 获取街道信息 比如: 鞍山西道
	 */
	private String street;

	/**
	 * 获取街道号信息
	 */
	private String streetNumer;

	/**
	 * 获取区县 比如 闵行区、崇明岛等
	 */
	private String district;

	/**
	 * 获取详细地址信息 比如：中国上海市闵行区顾大镇菊菜路68弄-69号
	 */
	private String addrStr;


	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNumer() {
		return streetNumer;
	}

	public void setStreetNumer(String streetNumer) {
		this.streetNumer = streetNumer;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAddrStr() {
		return addrStr;
	}

	public void setAddrStr(String addrStr) {
		this.addrStr = addrStr;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("MiLocation{");
		sb.append("altitude=").append(altitude);
		sb.append(", latitude=").append(latitude);
		sb.append(", country='").append(country).append('\'');
		sb.append(", province='").append(province).append('\'');
		sb.append(", city='").append(city).append('\'');
		sb.append(", street='").append(street).append('\'');
		sb.append(", streetNumer='").append(streetNumer).append('\'');
		sb.append(", district='").append(district).append('\'');
		sb.append(", addrStr='").append(addrStr).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
