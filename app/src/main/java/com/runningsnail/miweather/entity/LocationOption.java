package com.runningsnail.miweather.entity;

/**
 * @author yongjie created on 2019-11-16.
 */
public class LocationOption {


	public enum CoorType {
		/**
		 * 国测局坐标
		 */
		GCJ02("GCJ02"),
		/**
		 * 百度经纬度坐标
		 */
		BD09ll("BD09ll"),
		/**
		 * 百度墨卡托坐标
		 */
		BD09("BD09"),

		/**
		 * 海外地区定位，无需设置坐标类型，统一返回WGS84类型坐标
		 */
		WGS84("WGS84");

		public String coorType;

		CoorType(String coorType) {
			this.coorType = coorType;
		}
	}

	/**
	 * 定位是否需要位置信息
	 */
	private boolean needAddress = true;

	/**
	 * 定位是否需要海拔高度信息 默认不需要
	 */
	private boolean needAltitude = false;

	/**
	 * 经纬度坐标的标准默认是国测局坐标
	 */
	private CoorType coorType = CoorType.GCJ02;

	public boolean isNeedAddress() {
		return needAddress;
	}

	public void setNeedAddress(boolean needAddress) {
		this.needAddress = needAddress;
	}

	public CoorType getCoorType() {
		return coorType;
	}

	public void setCoorType(CoorType coorType) {
		this.coorType = coorType;
	}

	public boolean isNeedAltitude() {
		return needAltitude;
	}

	public void setNeedAltitude(boolean needAltitude) {
		this.needAltitude = needAltitude;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("LocationOption{");
		sb.append("needAddress=").append(needAddress);
		sb.append(", needAltitude=").append(needAltitude);
		sb.append(", coorType=").append(coorType);
		sb.append('}');
		return sb.toString();
	}
}
