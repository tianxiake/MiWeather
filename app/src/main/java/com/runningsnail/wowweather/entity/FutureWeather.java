package com.runningsnail.wowweather.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yongjie created on 2019/3/31.
 * 未来天气预报
 */
public class FutureWeather {


	/**
	 * status : ok
	 * lang : zh_CN
	 * result : {"primary":0,"daily":{"status":"ok","comfort":[{"index":"4","desc":"温暖","datetime":"2019-03-31"},{"index":"6","desc":"凉爽","datetime":"2019-04-01"},{"index":"4","desc":"温暖","datetime":"2019-04-02"},{"index":"4","desc":"温暖","datetime":"2019-04-03"},{"index":"4","desc":"温暖","datetime":"2019-04-04"}],"skycon_20h_32h":[{"date":"2019-03-31","value":"RAIN"},{"date":"2019-04-01","value":"RAIN"},{"date":"2019-04-02","value":"RAIN"},{"date":"2019-04-03","value":"RAIN"},{"date":"2019-04-04","value":"PARTLY_CLOUDY_NIGHT"}],"temperature":[{"date":"2019-03-31","max":19,"avg":18,"min":16},{"date":"2019-04-01","max":19,"avg":16.8,"min":15.96},{"date":"2019-04-02","max":22,"avg":19.48,"min":17.37},{"date":"2019-04-03","max":22,"avg":18.8,"min":17.92},{"date":"2019-04-04","max":23,"avg":20.04,"min":18}],"dswrf":[{"date":"2019-03-31","max":364.4,"avg":135.1,"min":0},{"date":"2019-04-01","max":102.5,"avg":32,"min":0},{"date":"2019-04-02","max":504.2,"avg":144.5,"min":0},{"date":"2019-04-03","max":75.4,"avg":19.1,"min":0},{"date":"2019-04-04","max":224.8,"avg":74.5,"min":0}],"cloudrate":[{"date":"2019-03-31","max":1,"avg":0.93,"min":0.85},{"date":"2019-04-01","max":0.98,"avg":0.94,"min":0.72},{"date":"2019-04-02","max":0.91,"avg":0.78,"min":0.4},{"date":"2019-04-03","max":0.99,"avg":0.93,"min":0.8},{"date":"2019-04-04","max":0.94,"avg":0.87,"min":0.73}],"aqi":[{"date":"2019-03-31","max":80,"avg":35.64,"min":29},{"date":"2019-04-01","max":29,"avg":27.29,"min":24},{"date":"2019-04-02","max":23,"avg":14.21,"min":10},{"date":"2019-04-03","max":19,"avg":9.25,"min":4},{"date":"2019-04-04","max":19,"avg":13.25,"min":10}],"skycon":[{"date":"2019-03-31","value":"CLOUDY"},{"date":"2019-04-01","value":"RAIN"},{"date":"2019-04-02","value":"RAIN"},{"date":"2019-04-03","value":"RAIN"},{"date":"2019-04-04","value":"RAIN"}],"visibility":[{"date":"2019-03-31","max":31.17,"avg":25.78,"min":18.71},{"date":"2019-04-01","max":24.18,"avg":21.68,"min":19.03},{"date":"2019-04-02","max":27.84,"avg":21.52,"min":18.38},{"date":"2019-04-03","max":20.7,"avg":17.79,"min":14.45},{"date":"2019-04-04","max":19.95,"avg":17.6,"min":15.21}],"humidity":[{"date":"2019-03-31","max":0.82,"avg":0.78,"min":0.75},{"date":"2019-04-01","max":0.84,"avg":0.81,"min":0.79},{"date":"2019-04-02","max":0.85,"avg":0.82,"min":0.76},{"date":"2019-04-03","max":0.92,"avg":0.86,"min":0.82},{"date":"2019-04-04","max":0.9,"avg":0.86,"min":0.83}],"astro":[{"date":"2019-03-31","sunset":{"time":"18:09"},"sunrise":{"time":"05:46"}},{"date":"2019-04-01","sunset":{"time":"18:09"},"sunrise":{"time":"05:45"}},{"date":"2019-04-02","sunset":{"time":"18:09"},"sunrise":{"time":"05:44"}},{"date":"2019-04-03","sunset":{"time":"18:10"},"sunrise":{"time":"05:43"}},{"date":"2019-04-04","sunset":{"time":"18:10"},"sunrise":{"time":"05:42"}}],"coldRisk":[{"index":"3","desc":"易发","datetime":"2019-03-31"},{"index":"3","desc":"易发","datetime":"2019-04-01"},{"index":"3","desc":"易发","datetime":"2019-04-02"},{"index":"3","desc":"易发","datetime":"2019-04-03"},{"index":"3","desc":"易发","datetime":"2019-04-04"}],"ultraviolet":[{"index":"1","desc":"最弱","datetime":"2019-03-31"},{"index":"1","desc":"最弱","datetime":"2019-04-01"},{"index":"1","desc":"最弱","datetime":"2019-04-02"},{"index":"1","desc":"最弱","datetime":"2019-04-03"},{"index":"1","desc":"最弱","datetime":"2019-04-04"}],"pres":[{"date":"2019-03-31","max":100821.13,"avg":100641.13,"min":100298.86},{"date":"2019-04-01","max":100901.13,"avg":100759.15,"min":100599.86},{"date":"2019-04-02","max":100679.86,"avg":100416.68,"min":100138.6},{"date":"2019-04-03","max":100630.46,"avg":100433.61,"min":100230.46},{"date":"2019-04-04","max":100458.6,"avg":100177.71,"min":99929.19}],"pm25":[{"date":"2019-03-31","max":35,"avg":24.93,"min":15},{"date":"2019-04-01","max":20,"avg":19.04,"min":17},{"date":"2019-04-02","max":16,"avg":10.04,"min":7},{"date":"2019-04-03","max":13,"avg":6.5,"min":3},{"date":"2019-04-04","max":13,"avg":9.33,"min":7}],"dressing":[{"index":"5","desc":"凉爽","datetime":"2019-03-31"},{"index":"5","desc":"凉爽","datetime":"2019-04-01"},{"index":"5","desc":"凉爽","datetime":"2019-04-02"},{"index":"5","desc":"凉爽","datetime":"2019-04-03"},{"index":"5","desc":"凉爽","datetime":"2019-04-04"}],"carWashing":[{"index":"3","desc":"较不适宜","datetime":"2019-03-31"},{"index":"3","desc":"较不适宜","datetime":"2019-04-01"},{"index":"3","desc":"较不适宜","datetime":"2019-04-02"},{"index":"3","desc":"较不适宜","datetime":"2019-04-03"},{"index":"3","desc":"较不适宜","datetime":"2019-04-04"}],"precipitation":[{"date":"2019-03-31","max":0.1764,"avg":0.0306,"min":0},{"date":"2019-04-01","max":0.4519,"avg":0.1953,"min":0},{"date":"2019-04-02","max":0.3253,"avg":0.0835,"min":0},{"date":"2019-04-03","max":1.3471,"avg":0.4194,"min":0},{"date":"2019-04-04","max":0.4198,"avg":0.1364,"min":0}],"wind":[{"date":"2019-03-31","max":{"direction":64.91,"speed":31.89},"avg":{"direction":66.51,"speed":28.42},"min":{"direction":70.93,"speed":22.63}},{"date":"2019-04-01","max":{"direction":70.52,"speed":26.86},"avg":{"direction":71.8,"speed":24.96},"min":{"direction":89.36,"speed":22.6}},{"date":"2019-04-02","max":{"direction":111.81,"speed":24.42},"avg":{"direction":107.13,"speed":21.39},"min":{"direction":125.35,"speed":15.36}},{"date":"2019-04-03","max":{"direction":97.15,"speed":33.27},"avg":{"direction":86.27,"speed":25.38},"min":{"direction":110.64,"speed":13.29}},{"date":"2019-04-04","max":{"direction":105.84,"speed":24.58},"avg":{"direction":118.38,"speed":16.49},"min":{"direction":148.34,"speed":7.68}}],"skycon_08h_20h":[{"date":"2019-03-31","value":"CLOUDY"},{"date":"2019-04-01","value":"RAIN"},{"date":"2019-04-02","value":"RAIN"},{"date":"2019-04-03","value":"RAIN"},{"date":"2019-04-04","value":"RAIN"}]}}
	 * server_time : 1553997812
	 * api_status : active
	 * tzshift : 28800
	 * api_version : v2.2
	 * unit : metric
	 * location : [25.1552,121.6544]
	 */

	private String status;
	private String lang;
	private ResultBean result;
	private int server_time;
	private String api_status;
	private int tzshift;
	private String api_version;
	private String unit;
	private List<Double> location = new ArrayList<>();

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public ResultBean getResult() {
		return result;
	}

	public void setResult(ResultBean result) {
		this.result = result;
	}

	public int getServer_time() {
		return server_time;
	}

	public void setServer_time(int server_time) {
		this.server_time = server_time;
	}

	public String getApi_status() {
		return api_status;
	}

	public void setApi_status(String api_status) {
		this.api_status = api_status;
	}

	public int getTzshift() {
		return tzshift;
	}

	public void setTzshift(int tzshift) {
		this.tzshift = tzshift;
	}

	public String getApi_version() {
		return api_version;
	}

	public void setApi_version(String api_version) {
		this.api_version = api_version;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public List<Double> getLocation() {
		return location;
	}

	public void setLocation(List<Double> location) {
		this.location = location;
	}

	public static class ResultBean {
		/**
		 * primary : 0
		 * daily : {"status":"ok","comfort":[{"index":"4","desc":"温暖","datetime":"2019-03-31"},{"index":"6","desc":"凉爽","datetime":"2019-04-01"},{"index":"4","desc":"温暖","datetime":"2019-04-02"},{"index":"4","desc":"温暖","datetime":"2019-04-03"},{"index":"4","desc":"温暖","datetime":"2019-04-04"}],"skycon_20h_32h":[{"date":"2019-03-31","value":"RAIN"},{"date":"2019-04-01","value":"RAIN"},{"date":"2019-04-02","value":"RAIN"},{"date":"2019-04-03","value":"RAIN"},{"date":"2019-04-04","value":"PARTLY_CLOUDY_NIGHT"}],"temperature":[{"date":"2019-03-31","max":19,"avg":18,"min":16},{"date":"2019-04-01","max":19,"avg":16.8,"min":15.96},{"date":"2019-04-02","max":22,"avg":19.48,"min":17.37},{"date":"2019-04-03","max":22,"avg":18.8,"min":17.92},{"date":"2019-04-04","max":23,"avg":20.04,"min":18}],"dswrf":[{"date":"2019-03-31","max":364.4,"avg":135.1,"min":0},{"date":"2019-04-01","max":102.5,"avg":32,"min":0},{"date":"2019-04-02","max":504.2,"avg":144.5,"min":0},{"date":"2019-04-03","max":75.4,"avg":19.1,"min":0},{"date":"2019-04-04","max":224.8,"avg":74.5,"min":0}],"cloudrate":[{"date":"2019-03-31","max":1,"avg":0.93,"min":0.85},{"date":"2019-04-01","max":0.98,"avg":0.94,"min":0.72},{"date":"2019-04-02","max":0.91,"avg":0.78,"min":0.4},{"date":"2019-04-03","max":0.99,"avg":0.93,"min":0.8},{"date":"2019-04-04","max":0.94,"avg":0.87,"min":0.73}],"aqi":[{"date":"2019-03-31","max":80,"avg":35.64,"min":29},{"date":"2019-04-01","max":29,"avg":27.29,"min":24},{"date":"2019-04-02","max":23,"avg":14.21,"min":10},{"date":"2019-04-03","max":19,"avg":9.25,"min":4},{"date":"2019-04-04","max":19,"avg":13.25,"min":10}],"skycon":[{"date":"2019-03-31","value":"CLOUDY"},{"date":"2019-04-01","value":"RAIN"},{"date":"2019-04-02","value":"RAIN"},{"date":"2019-04-03","value":"RAIN"},{"date":"2019-04-04","value":"RAIN"}],"visibility":[{"date":"2019-03-31","max":31.17,"avg":25.78,"min":18.71},{"date":"2019-04-01","max":24.18,"avg":21.68,"min":19.03},{"date":"2019-04-02","max":27.84,"avg":21.52,"min":18.38},{"date":"2019-04-03","max":20.7,"avg":17.79,"min":14.45},{"date":"2019-04-04","max":19.95,"avg":17.6,"min":15.21}],"humidity":[{"date":"2019-03-31","max":0.82,"avg":0.78,"min":0.75},{"date":"2019-04-01","max":0.84,"avg":0.81,"min":0.79},{"date":"2019-04-02","max":0.85,"avg":0.82,"min":0.76},{"date":"2019-04-03","max":0.92,"avg":0.86,"min":0.82},{"date":"2019-04-04","max":0.9,"avg":0.86,"min":0.83}],"astro":[{"date":"2019-03-31","sunset":{"time":"18:09"},"sunrise":{"time":"05:46"}},{"date":"2019-04-01","sunset":{"time":"18:09"},"sunrise":{"time":"05:45"}},{"date":"2019-04-02","sunset":{"time":"18:09"},"sunrise":{"time":"05:44"}},{"date":"2019-04-03","sunset":{"time":"18:10"},"sunrise":{"time":"05:43"}},{"date":"2019-04-04","sunset":{"time":"18:10"},"sunrise":{"time":"05:42"}}],"coldRisk":[{"index":"3","desc":"易发","datetime":"2019-03-31"},{"index":"3","desc":"易发","datetime":"2019-04-01"},{"index":"3","desc":"易发","datetime":"2019-04-02"},{"index":"3","desc":"易发","datetime":"2019-04-03"},{"index":"3","desc":"易发","datetime":"2019-04-04"}],"ultraviolet":[{"index":"1","desc":"最弱","datetime":"2019-03-31"},{"index":"1","desc":"最弱","datetime":"2019-04-01"},{"index":"1","desc":"最弱","datetime":"2019-04-02"},{"index":"1","desc":"最弱","datetime":"2019-04-03"},{"index":"1","desc":"最弱","datetime":"2019-04-04"}],"pres":[{"date":"2019-03-31","max":100821.13,"avg":100641.13,"min":100298.86},{"date":"2019-04-01","max":100901.13,"avg":100759.15,"min":100599.86},{"date":"2019-04-02","max":100679.86,"avg":100416.68,"min":100138.6},{"date":"2019-04-03","max":100630.46,"avg":100433.61,"min":100230.46},{"date":"2019-04-04","max":100458.6,"avg":100177.71,"min":99929.19}],"pm25":[{"date":"2019-03-31","max":35,"avg":24.93,"min":15},{"date":"2019-04-01","max":20,"avg":19.04,"min":17},{"date":"2019-04-02","max":16,"avg":10.04,"min":7},{"date":"2019-04-03","max":13,"avg":6.5,"min":3},{"date":"2019-04-04","max":13,"avg":9.33,"min":7}],"dressing":[{"index":"5","desc":"凉爽","datetime":"2019-03-31"},{"index":"5","desc":"凉爽","datetime":"2019-04-01"},{"index":"5","desc":"凉爽","datetime":"2019-04-02"},{"index":"5","desc":"凉爽","datetime":"2019-04-03"},{"index":"5","desc":"凉爽","datetime":"2019-04-04"}],"carWashing":[{"index":"3","desc":"较不适宜","datetime":"2019-03-31"},{"index":"3","desc":"较不适宜","datetime":"2019-04-01"},{"index":"3","desc":"较不适宜","datetime":"2019-04-02"},{"index":"3","desc":"较不适宜","datetime":"2019-04-03"},{"index":"3","desc":"较不适宜","datetime":"2019-04-04"}],"precipitation":[{"date":"2019-03-31","max":0.1764,"avg":0.0306,"min":0},{"date":"2019-04-01","max":0.4519,"avg":0.1953,"min":0},{"date":"2019-04-02","max":0.3253,"avg":0.0835,"min":0},{"date":"2019-04-03","max":1.3471,"avg":0.4194,"min":0},{"date":"2019-04-04","max":0.4198,"avg":0.1364,"min":0}],"wind":[{"date":"2019-03-31","max":{"direction":64.91,"speed":31.89},"avg":{"direction":66.51,"speed":28.42},"min":{"direction":70.93,"speed":22.63}},{"date":"2019-04-01","max":{"direction":70.52,"speed":26.86},"avg":{"direction":71.8,"speed":24.96},"min":{"direction":89.36,"speed":22.6}},{"date":"2019-04-02","max":{"direction":111.81,"speed":24.42},"avg":{"direction":107.13,"speed":21.39},"min":{"direction":125.35,"speed":15.36}},{"date":"2019-04-03","max":{"direction":97.15,"speed":33.27},"avg":{"direction":86.27,"speed":25.38},"min":{"direction":110.64,"speed":13.29}},{"date":"2019-04-04","max":{"direction":105.84,"speed":24.58},"avg":{"direction":118.38,"speed":16.49},"min":{"direction":148.34,"speed":7.68}}],"skycon_08h_20h":[{"date":"2019-03-31","value":"CLOUDY"},{"date":"2019-04-01","value":"RAIN"},{"date":"2019-04-02","value":"RAIN"},{"date":"2019-04-03","value":"RAIN"},{"date":"2019-04-04","value":"RAIN"}]}
		 */

		private int primary;
		private DailyBean daily;

		public int getPrimary() {
			return primary;
		}

		public void setPrimary(int primary) {
			this.primary = primary;
		}

		public DailyBean getDaily() {
			return daily;
		}

		public void setDaily(DailyBean daily) {
			this.daily = daily;
		}

		public static class DailyBean {
			/**
			 * status : ok
			 * comfort : [{"index":"4","desc":"温暖","datetime":"2019-03-31"},{"index":"6","desc":"凉爽","datetime":"2019-04-01"},{"index":"4","desc":"温暖","datetime":"2019-04-02"},{"index":"4","desc":"温暖","datetime":"2019-04-03"},{"index":"4","desc":"温暖","datetime":"2019-04-04"}]
			 * skycon_20h_32h : [{"date":"2019-03-31","value":"RAIN"},{"date":"2019-04-01","value":"RAIN"},{"date":"2019-04-02","value":"RAIN"},{"date":"2019-04-03","value":"RAIN"},{"date":"2019-04-04","value":"PARTLY_CLOUDY_NIGHT"}]
			 * temperature : [{"date":"2019-03-31","max":19,"avg":18,"min":16},{"date":"2019-04-01","max":19,"avg":16.8,"min":15.96},{"date":"2019-04-02","max":22,"avg":19.48,"min":17.37},{"date":"2019-04-03","max":22,"avg":18.8,"min":17.92},{"date":"2019-04-04","max":23,"avg":20.04,"min":18}]
			 * dswrf : [{"date":"2019-03-31","max":364.4,"avg":135.1,"min":0},{"date":"2019-04-01","max":102.5,"avg":32,"min":0},{"date":"2019-04-02","max":504.2,"avg":144.5,"min":0},{"date":"2019-04-03","max":75.4,"avg":19.1,"min":0},{"date":"2019-04-04","max":224.8,"avg":74.5,"min":0}]
			 * cloudrate : [{"date":"2019-03-31","max":1,"avg":0.93,"min":0.85},{"date":"2019-04-01","max":0.98,"avg":0.94,"min":0.72},{"date":"2019-04-02","max":0.91,"avg":0.78,"min":0.4},{"date":"2019-04-03","max":0.99,"avg":0.93,"min":0.8},{"date":"2019-04-04","max":0.94,"avg":0.87,"min":0.73}]
			 * aqi : [{"date":"2019-03-31","max":80,"avg":35.64,"min":29},{"date":"2019-04-01","max":29,"avg":27.29,"min":24},{"date":"2019-04-02","max":23,"avg":14.21,"min":10},{"date":"2019-04-03","max":19,"avg":9.25,"min":4},{"date":"2019-04-04","max":19,"avg":13.25,"min":10}]
			 * skycon : [{"date":"2019-03-31","value":"CLOUDY"},{"date":"2019-04-01","value":"RAIN"},{"date":"2019-04-02","value":"RAIN"},{"date":"2019-04-03","value":"RAIN"},{"date":"2019-04-04","value":"RAIN"}]
			 * visibility : [{"date":"2019-03-31","max":31.17,"avg":25.78,"min":18.71},{"date":"2019-04-01","max":24.18,"avg":21.68,"min":19.03},{"date":"2019-04-02","max":27.84,"avg":21.52,"min":18.38},{"date":"2019-04-03","max":20.7,"avg":17.79,"min":14.45},{"date":"2019-04-04","max":19.95,"avg":17.6,"min":15.21}]
			 * humidity : [{"date":"2019-03-31","max":0.82,"avg":0.78,"min":0.75},{"date":"2019-04-01","max":0.84,"avg":0.81,"min":0.79},{"date":"2019-04-02","max":0.85,"avg":0.82,"min":0.76},{"date":"2019-04-03","max":0.92,"avg":0.86,"min":0.82},{"date":"2019-04-04","max":0.9,"avg":0.86,"min":0.83}]
			 * astro : [{"date":"2019-03-31","sunset":{"time":"18:09"},"sunrise":{"time":"05:46"}},{"date":"2019-04-01","sunset":{"time":"18:09"},"sunrise":{"time":"05:45"}},{"date":"2019-04-02","sunset":{"time":"18:09"},"sunrise":{"time":"05:44"}},{"date":"2019-04-03","sunset":{"time":"18:10"},"sunrise":{"time":"05:43"}},{"date":"2019-04-04","sunset":{"time":"18:10"},"sunrise":{"time":"05:42"}}]
			 * coldRisk : [{"index":"3","desc":"易发","datetime":"2019-03-31"},{"index":"3","desc":"易发","datetime":"2019-04-01"},{"index":"3","desc":"易发","datetime":"2019-04-02"},{"index":"3","desc":"易发","datetime":"2019-04-03"},{"index":"3","desc":"易发","datetime":"2019-04-04"}]
			 * ultraviolet : [{"index":"1","desc":"最弱","datetime":"2019-03-31"},{"index":"1","desc":"最弱","datetime":"2019-04-01"},{"index":"1","desc":"最弱","datetime":"2019-04-02"},{"index":"1","desc":"最弱","datetime":"2019-04-03"},{"index":"1","desc":"最弱","datetime":"2019-04-04"}]
			 * pres : [{"date":"2019-03-31","max":100821.13,"avg":100641.13,"min":100298.86},{"date":"2019-04-01","max":100901.13,"avg":100759.15,"min":100599.86},{"date":"2019-04-02","max":100679.86,"avg":100416.68,"min":100138.6},{"date":"2019-04-03","max":100630.46,"avg":100433.61,"min":100230.46},{"date":"2019-04-04","max":100458.6,"avg":100177.71,"min":99929.19}]
			 * pm25 : [{"date":"2019-03-31","max":35,"avg":24.93,"min":15},{"date":"2019-04-01","max":20,"avg":19.04,"min":17},{"date":"2019-04-02","max":16,"avg":10.04,"min":7},{"date":"2019-04-03","max":13,"avg":6.5,"min":3},{"date":"2019-04-04","max":13,"avg":9.33,"min":7}]
			 * dressing : [{"index":"5","desc":"凉爽","datetime":"2019-03-31"},{"index":"5","desc":"凉爽","datetime":"2019-04-01"},{"index":"5","desc":"凉爽","datetime":"2019-04-02"},{"index":"5","desc":"凉爽","datetime":"2019-04-03"},{"index":"5","desc":"凉爽","datetime":"2019-04-04"}]
			 * carWashing : [{"index":"3","desc":"较不适宜","datetime":"2019-03-31"},{"index":"3","desc":"较不适宜","datetime":"2019-04-01"},{"index":"3","desc":"较不适宜","datetime":"2019-04-02"},{"index":"3","desc":"较不适宜","datetime":"2019-04-03"},{"index":"3","desc":"较不适宜","datetime":"2019-04-04"}]
			 * precipitation : [{"date":"2019-03-31","max":0.1764,"avg":0.0306,"min":0},{"date":"2019-04-01","max":0.4519,"avg":0.1953,"min":0},{"date":"2019-04-02","max":0.3253,"avg":0.0835,"min":0},{"date":"2019-04-03","max":1.3471,"avg":0.4194,"min":0},{"date":"2019-04-04","max":0.4198,"avg":0.1364,"min":0}]
			 * wind : [{"date":"2019-03-31","max":{"direction":64.91,"speed":31.89},"avg":{"direction":66.51,"speed":28.42},"min":{"direction":70.93,"speed":22.63}},{"date":"2019-04-01","max":{"direction":70.52,"speed":26.86},"avg":{"direction":71.8,"speed":24.96},"min":{"direction":89.36,"speed":22.6}},{"date":"2019-04-02","max":{"direction":111.81,"speed":24.42},"avg":{"direction":107.13,"speed":21.39},"min":{"direction":125.35,"speed":15.36}},{"date":"2019-04-03","max":{"direction":97.15,"speed":33.27},"avg":{"direction":86.27,"speed":25.38},"min":{"direction":110.64,"speed":13.29}},{"date":"2019-04-04","max":{"direction":105.84,"speed":24.58},"avg":{"direction":118.38,"speed":16.49},"min":{"direction":148.34,"speed":7.68}}]
			 * skycon_08h_20h : [{"date":"2019-03-31","value":"CLOUDY"},{"date":"2019-04-01","value":"RAIN"},{"date":"2019-04-02","value":"RAIN"},{"date":"2019-04-03","value":"RAIN"},{"date":"2019-04-04","value":"RAIN"}]
			 */

			private String status;
			private List<ComfortBean> comfort;
			private List<Skycon20h32hBean> skycon_20h_32h;
			private List<TemperatureBean> temperature;
			private List<DswrfBean> dswrf;
			private List<CloudrateBean> cloudrate;
			private List<AqiBean> aqi;
			private List<SkyconBean> skycon;
			private List<VisibilityBean> visibility;
			private List<HumidityBean> humidity;
			private List<AstroBean> astro;
			private List<ColdRiskBean> coldRisk;
			private List<UltravioletBean> ultraviolet;
			private List<PresBean> pres;
			private List<Pm25Bean> pm25;
			private List<DressingBean> dressing;
			private List<CarWashingBean> carWashing;
			private List<PrecipitationBean> precipitation;
			private List<WindBean> wind;
			private List<Skycon08h20hBean> skycon_08h_20h;

			public String getStatus() {
				return status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public List<ComfortBean> getComfort() {
				return comfort;
			}

			public void setComfort(List<ComfortBean> comfort) {
				this.comfort = comfort;
			}

			public List<Skycon20h32hBean> getSkycon_20h_32h() {
				return skycon_20h_32h;
			}

			public void setSkycon_20h_32h(List<Skycon20h32hBean> skycon_20h_32h) {
				this.skycon_20h_32h = skycon_20h_32h;
			}

			public List<TemperatureBean> getTemperature() {
				return temperature;
			}

			public void setTemperature(List<TemperatureBean> temperature) {
				this.temperature = temperature;
			}

			public List<DswrfBean> getDswrf() {
				return dswrf;
			}

			public void setDswrf(List<DswrfBean> dswrf) {
				this.dswrf = dswrf;
			}

			public List<CloudrateBean> getCloudrate() {
				return cloudrate;
			}

			public void setCloudrate(List<CloudrateBean> cloudrate) {
				this.cloudrate = cloudrate;
			}

			public List<AqiBean> getAqi() {
				return aqi;
			}

			public void setAqi(List<AqiBean> aqi) {
				this.aqi = aqi;
			}

			public List<SkyconBean> getSkycon() {
				return skycon;
			}

			public void setSkycon(List<SkyconBean> skycon) {
				this.skycon = skycon;
			}

			public List<VisibilityBean> getVisibility() {
				return visibility;
			}

			public void setVisibility(List<VisibilityBean> visibility) {
				this.visibility = visibility;
			}

			public List<HumidityBean> getHumidity() {
				return humidity;
			}

			public void setHumidity(List<HumidityBean> humidity) {
				this.humidity = humidity;
			}

			public List<AstroBean> getAstro() {
				return astro;
			}

			public void setAstro(List<AstroBean> astro) {
				this.astro = astro;
			}

			public List<ColdRiskBean> getColdRisk() {
				return coldRisk;
			}

			public void setColdRisk(List<ColdRiskBean> coldRisk) {
				this.coldRisk = coldRisk;
			}

			public List<UltravioletBean> getUltraviolet() {
				return ultraviolet;
			}

			public void setUltraviolet(List<UltravioletBean> ultraviolet) {
				this.ultraviolet = ultraviolet;
			}

			public List<PresBean> getPres() {
				return pres;
			}

			public void setPres(List<PresBean> pres) {
				this.pres = pres;
			}

			public List<Pm25Bean> getPm25() {
				return pm25;
			}

			public void setPm25(List<Pm25Bean> pm25) {
				this.pm25 = pm25;
			}

			public List<DressingBean> getDressing() {
				return dressing;
			}

			public void setDressing(List<DressingBean> dressing) {
				this.dressing = dressing;
			}

			public List<CarWashingBean> getCarWashing() {
				return carWashing;
			}

			public void setCarWashing(List<CarWashingBean> carWashing) {
				this.carWashing = carWashing;
			}

			public List<PrecipitationBean> getPrecipitation() {
				return precipitation;
			}

			public void setPrecipitation(List<PrecipitationBean> precipitation) {
				this.precipitation = precipitation;
			}

			public List<WindBean> getWind() {
				return wind;
			}

			public void setWind(List<WindBean> wind) {
				this.wind = wind;
			}

			public List<Skycon08h20hBean> getSkycon_08h_20h() {
				return skycon_08h_20h;
			}

			public void setSkycon_08h_20h(List<Skycon08h20hBean> skycon_08h_20h) {
				this.skycon_08h_20h = skycon_08h_20h;
			}

			public static class ComfortBean {
				/**
				 * index : 4
				 * desc : 温暖
				 * datetime : 2019-03-31
				 */

				private String index;
				private String desc;
				private String datetime;

				public String getIndex() {
					return index;
				}

				public void setIndex(String index) {
					this.index = index;
				}

				public String getDesc() {
					return desc;
				}

				public void setDesc(String desc) {
					this.desc = desc;
				}

				public String getDatetime() {
					return datetime;
				}

				public void setDatetime(String datetime) {
					this.datetime = datetime;
				}
			}


			public static class TemperatureBean {
				/**
				 * date : 2019-03-31
				 * max : 19.0
				 * avg : 18.0
				 * min : 16.0
				 */

				private String date;
				private double max;
				private double avg;
				private double min;

				public String getDate() {
					return date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public double getMax() {
					return max;
				}

				public void setMax(double max) {
					this.max = max;
				}

				public double getAvg() {
					return avg;
				}

				public void setAvg(double avg) {
					this.avg = avg;
				}

				public double getMin() {
					return min;
				}

				public void setMin(double min) {
					this.min = min;
				}
			}

			public static class DswrfBean {
				/**
				 * date : 2019-03-31
				 * max : 364.4
				 * avg : 135.1
				 * min : 0.0
				 */

				private String date;
				private double max;
				private double avg;
				private double min;

				public String getDate() {
					return date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public double getMax() {
					return max;
				}

				public void setMax(double max) {
					this.max = max;
				}

				public double getAvg() {
					return avg;
				}

				public void setAvg(double avg) {
					this.avg = avg;
				}

				public double getMin() {
					return min;
				}

				public void setMin(double min) {
					this.min = min;
				}
			}

			public static class CloudrateBean {
				/**
				 * date : 2019-03-31
				 * max : 1.0
				 * avg : 0.93
				 * min : 0.85
				 */

				private String date;
				private double max;
				private double avg;
				private double min;

				public String getDate() {
					return date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public double getMax() {
					return max;
				}

				public void setMax(double max) {
					this.max = max;
				}

				public double getAvg() {
					return avg;
				}

				public void setAvg(double avg) {
					this.avg = avg;
				}

				public double getMin() {
					return min;
				}

				public void setMin(double min) {
					this.min = min;
				}
			}

			public static class AqiBean {
				/**
				 * date : 2019-03-31
				 * max : 80
				 * avg : 35.64
				 * min : 29
				 */

				private String date;
				private int max;
				private double avg;
				private int min;

				public String getDate() {
					return date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public int getMax() {
					return max;
				}

				public void setMax(int max) {
					this.max = max;
				}

				public double getAvg() {
					return avg;
				}

				public void setAvg(double avg) {
					this.avg = avg;
				}

				public int getMin() {
					return min;
				}

				public void setMin(int min) {
					this.min = min;
				}
			}

			public static class SkyconBean {
				/**
				 * date : 2019-03-31
				 * value : CLOUDY
				 */

				private String date;
				private String value;

				public String getDate() {
					return date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public String getValue() {
					return value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class VisibilityBean {
				/**
				 * date : 2019-03-31
				 * max : 31.17
				 * avg : 25.78
				 * min : 18.71
				 */

				private String date;
				private double max;
				private double avg;
				private double min;

				public String getDate() {
					return date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public double getMax() {
					return max;
				}

				public void setMax(double max) {
					this.max = max;
				}

				public double getAvg() {
					return avg;
				}

				public void setAvg(double avg) {
					this.avg = avg;
				}

				public double getMin() {
					return min;
				}

				public void setMin(double min) {
					this.min = min;
				}
			}

			public static class HumidityBean {
				/**
				 * date : 2019-03-31
				 * max : 0.82
				 * avg : 0.78
				 * min : 0.75
				 */

				private String date;
				private double max;
				private double avg;
				private double min;

				public String getDate() {
					return date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public double getMax() {
					return max;
				}

				public void setMax(double max) {
					this.max = max;
				}

				public double getAvg() {
					return avg;
				}

				public void setAvg(double avg) {
					this.avg = avg;
				}

				public double getMin() {
					return min;
				}

				public void setMin(double min) {
					this.min = min;
				}
			}

			public static class AstroBean {
				/**
				 * date : 2019-03-31
				 * sunset : {"time":"18:09"}
				 * sunrise : {"time":"05:46"}
				 */

				private String date;
				private SunsetBean sunset;
				private SunriseBean sunrise;

				public String getDate() {
					return date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public SunsetBean getSunset() {
					return sunset;
				}

				public void setSunset(SunsetBean sunset) {
					this.sunset = sunset;
				}

				public SunriseBean getSunrise() {
					return sunrise;
				}

				public void setSunrise(SunriseBean sunrise) {
					this.sunrise = sunrise;
				}

				public static class SunsetBean {
					/**
					 * time : 18:09
					 */

					private String time;

					public String getTime() {
						return time;
					}

					public void setTime(String time) {
						this.time = time;
					}
				}

				public static class SunriseBean {
					/**
					 * time : 05:46
					 */

					private String time;

					public String getTime() {
						return time;
					}

					public void setTime(String time) {
						this.time = time;
					}
				}
			}

			public static class ColdRiskBean {
				/**
				 * index : 3
				 * desc : 易发
				 * datetime : 2019-03-31
				 */

				private String index;
				private String desc;
				private String datetime;

				public String getIndex() {
					return index;
				}

				public void setIndex(String index) {
					this.index = index;
				}

				public String getDesc() {
					return desc;
				}

				public void setDesc(String desc) {
					this.desc = desc;
				}

				public String getDatetime() {
					return datetime;
				}

				public void setDatetime(String datetime) {
					this.datetime = datetime;
				}
			}

			public static class UltravioletBean {
				/**
				 * index : 1
				 * desc : 最弱
				 * datetime : 2019-03-31
				 */

				private String index;
				private String desc;
				private String datetime;

				public String getIndex() {
					return index;
				}

				public void setIndex(String index) {
					this.index = index;
				}

				public String getDesc() {
					return desc;
				}

				public void setDesc(String desc) {
					this.desc = desc;
				}

				public String getDatetime() {
					return datetime;
				}

				public void setDatetime(String datetime) {
					this.datetime = datetime;
				}
			}

			public static class PresBean {
				/**
				 * date : 2019-03-31
				 * max : 100821.13
				 * avg : 100641.13
				 * min : 100298.86
				 */

				private String date;
				private double max;
				private double avg;
				private double min;

				public String getDate() {
					return date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public double getMax() {
					return max;
				}

				public void setMax(double max) {
					this.max = max;
				}

				public double getAvg() {
					return avg;
				}

				public void setAvg(double avg) {
					this.avg = avg;
				}

				public double getMin() {
					return min;
				}

				public void setMin(double min) {
					this.min = min;
				}
			}

			public static class Pm25Bean {
				/**
				 * date : 2019-03-31
				 * max : 35
				 * avg : 24.93
				 * min : 15
				 */

				private String date;
				private int max;
				private double avg;
				private int min;

				public String getDate() {
					return date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public int getMax() {
					return max;
				}

				public void setMax(int max) {
					this.max = max;
				}

				public double getAvg() {
					return avg;
				}

				public void setAvg(double avg) {
					this.avg = avg;
				}

				public int getMin() {
					return min;
				}

				public void setMin(int min) {
					this.min = min;
				}
			}

			public static class DressingBean {
				/**
				 * index : 5
				 * desc : 凉爽
				 * datetime : 2019-03-31
				 */

				private String index;
				private String desc;
				private String datetime;

				public String getIndex() {
					return index;
				}

				public void setIndex(String index) {
					this.index = index;
				}

				public String getDesc() {
					return desc;
				}

				public void setDesc(String desc) {
					this.desc = desc;
				}

				public String getDatetime() {
					return datetime;
				}

				public void setDatetime(String datetime) {
					this.datetime = datetime;
				}
			}

			public static class CarWashingBean {
				/**
				 * index : 3
				 * desc : 较不适宜
				 * datetime : 2019-03-31
				 */

				private String index;
				private String desc;
				private String datetime;

				public String getIndex() {
					return index;
				}

				public void setIndex(String index) {
					this.index = index;
				}

				public String getDesc() {
					return desc;
				}

				public void setDesc(String desc) {
					this.desc = desc;
				}

				public String getDatetime() {
					return datetime;
				}

				public void setDatetime(String datetime) {
					this.datetime = datetime;
				}
			}

			public static class PrecipitationBean {
				/**
				 * date : 2019-03-31
				 * max : 0.1764
				 * avg : 0.0306
				 * min : 0.0
				 */

				private String date;
				private double max;
				private double avg;
				private double min;

				public String getDate() {
					return date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public double getMax() {
					return max;
				}

				public void setMax(double max) {
					this.max = max;
				}

				public double getAvg() {
					return avg;
				}

				public void setAvg(double avg) {
					this.avg = avg;
				}

				public double getMin() {
					return min;
				}

				public void setMin(double min) {
					this.min = min;
				}
			}

			public static class WindBean {
				/**
				 * date : 2019-03-31
				 * max : {"direction":64.91,"speed":31.89}
				 * avg : {"direction":66.51,"speed":28.42}
				 * min : {"direction":70.93,"speed":22.63}
				 */

				private String date;
				private MaxBean max;
				private AvgBean avg;
				private MinBean min;

				public String getDate() {
					return date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public MaxBean getMax() {
					return max;
				}

				public void setMax(MaxBean max) {
					this.max = max;
				}

				public AvgBean getAvg() {
					return avg;
				}

				public void setAvg(AvgBean avg) {
					this.avg = avg;
				}

				public MinBean getMin() {
					return min;
				}

				public void setMin(MinBean min) {
					this.min = min;
				}

				public static class MaxBean {
					/**
					 * direction : 64.91
					 * speed : 31.89
					 */

					private double direction;
					private double speed;

					public double getDirection() {
						return direction;
					}

					public void setDirection(double direction) {
						this.direction = direction;
					}

					public double getSpeed() {
						return speed;
					}

					public void setSpeed(double speed) {
						this.speed = speed;
					}
				}

				public static class AvgBean {
					/**
					 * direction : 66.51
					 * speed : 28.42
					 */

					private double direction;
					private double speed;

					public double getDirection() {
						return direction;
					}

					public void setDirection(double direction) {
						this.direction = direction;
					}

					public double getSpeed() {
						return speed;
					}

					public void setSpeed(double speed) {
						this.speed = speed;
					}
				}

				public static class MinBean {
					/**
					 * direction : 70.93
					 * speed : 22.63
					 */

					private double direction;
					private double speed;

					public double getDirection() {
						return direction;
					}

					public void setDirection(double direction) {
						this.direction = direction;
					}

					public double getSpeed() {
						return speed;
					}

					public void setSpeed(double speed) {
						this.speed = speed;
					}
				}
			}

			public static class Skycon08h20hBean {
				/**
				 * date : 2019-03-31
				 * value : CLOUDY
				 */

				private String date;
				private String value;

				public String getDate() {
					return date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public String getValue() {
					return value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}

			public static class Skycon20h32hBean {
				/**
				 * date : 2019-03-31
				 * value : RAIN
				 */

				private String date;
				private String value;

				public String getDate() {
					return date;
				}

				public void setDate(String date) {
					this.date = date;
				}

				public String getValue() {
					return value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}
}
