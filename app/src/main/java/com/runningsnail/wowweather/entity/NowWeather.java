package com.runningsnail.wowweather.entity;

import java.util.List;

/**
 * @author yongjie created on 2019/3/31.
 * 实况天气实体类
 */
public class NowWeather {


	/**
	 * status : ok
	 * lang : zh_CN
	 * unit : metric
	 * server_time : 1553997633
	 * location : [25.1552,121.6544]
	 * api_status : active
	 * tzshift : 28800
	 * api_version : v2.2
	 * result : {"status":"ok","o3":164.78,"co":0.5,"temperature":19,"pm10":110,"skycon":"CLOUDY","cloudrate":0.95,"aqi":80,"dswrf":73.3,"visibility":22.55,"humidity":0.8,"so2":2.35,"ultraviolet":{"index":2,"desc":"很弱"},"pres":100599.86,"pm25":35,"no2":8.56,"precipitation":{"nearest":{"status":"ok","distance":23.43,"intensity":0.1875},"local":{"status":"ok","intensity":0,"datasource":"radar"}},"comfort":{"index":5,"desc":"舒适"},"wind":{"direction":66.94,"speed":31.59}}
	 */

	private String status;
	private String lang;
	private String unit;
	private int server_time;
	private String api_status;
	private int tzshift;
	private String api_version;
	private ResultBean result;
	private List<Double> location;

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

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
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

	public ResultBean getResult() {
		return result;
	}

	public void setResult(ResultBean result) {
		this.result = result;
	}

	public List<Double> getLocation() {
		return location;
	}

	public void setLocation(List<Double> location) {
		this.location = location;
	}

	public static class ResultBean {
		/**
		 * status : ok
		 * o3 : 164.78
		 * co : 0.5
		 * temperature : 19.0
		 * pm10 : 110.0
		 * skycon : CLOUDY
		 * cloudrate : 0.95
		 * aqi : 80
		 * dswrf : 73.3
		 * visibility : 22.55
		 * humidity : 0.8
		 * so2 : 2.35
		 * ultraviolet : {"index":2,"desc":"很弱"}
		 * pres : 100599.86
		 * pm25 : 35
		 * no2 : 8.56
		 * precipitation : {"nearest":{"status":"ok","distance":23.43,"intensity":0.1875},"local":{"status":"ok","intensity":0,"datasource":"radar"}}
		 * comfort : {"index":5,"desc":"舒适"}
		 * wind : {"direction":66.94,"speed":31.59}
		 */

		private String status;
		private double o3;
		private double co;
		private double temperature;
		private double pm10;
		private String skycon;
		private double cloudrate;
		private int aqi;
		private double dswrf;
		private double visibility;
		private double humidity;
		private double so2;
		private UltravioletBean ultraviolet;
		private double pres;
		private int pm25;
		private double no2;
		private PrecipitationBean precipitation;
		private ComfortBean comfort;
		private WindBean wind;

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public double getO3() {
			return o3;
		}

		public void setO3(double o3) {
			this.o3 = o3;
		}

		public double getCo() {
			return co;
		}

		public void setCo(double co) {
			this.co = co;
		}

		public double getTemperature() {
			return temperature;
		}

		public void setTemperature(double temperature) {
			this.temperature = temperature;
		}

		public double getPm10() {
			return pm10;
		}

		public void setPm10(double pm10) {
			this.pm10 = pm10;
		}

		public String getSkycon() {
			return skycon;
		}

		public void setSkycon(String skycon) {
			this.skycon = skycon;
		}

		public double getCloudrate() {
			return cloudrate;
		}

		public void setCloudrate(double cloudrate) {
			this.cloudrate = cloudrate;
		}

		public int getAqi() {
			return aqi;
		}

		public void setAqi(int aqi) {
			this.aqi = aqi;
		}

		public double getDswrf() {
			return dswrf;
		}

		public void setDswrf(double dswrf) {
			this.dswrf = dswrf;
		}

		public double getVisibility() {
			return visibility;
		}

		public void setVisibility(double visibility) {
			this.visibility = visibility;
		}

		public double getHumidity() {
			return humidity;
		}

		public void setHumidity(double humidity) {
			this.humidity = humidity;
		}

		public double getSo2() {
			return so2;
		}

		public void setSo2(double so2) {
			this.so2 = so2;
		}

		public UltravioletBean getUltraviolet() {
			return ultraviolet;
		}

		public void setUltraviolet(UltravioletBean ultraviolet) {
			this.ultraviolet = ultraviolet;
		}

		public double getPres() {
			return pres;
		}

		public void setPres(double pres) {
			this.pres = pres;
		}

		public int getPm25() {
			return pm25;
		}

		public void setPm25(int pm25) {
			this.pm25 = pm25;
		}

		public double getNo2() {
			return no2;
		}

		public void setNo2(double no2) {
			this.no2 = no2;
		}

		public PrecipitationBean getPrecipitation() {
			return precipitation;
		}

		public void setPrecipitation(PrecipitationBean precipitation) {
			this.precipitation = precipitation;
		}

		public ComfortBean getComfort() {
			return comfort;
		}

		public void setComfort(ComfortBean comfort) {
			this.comfort = comfort;
		}

		public WindBean getWind() {
			return wind;
		}

		public void setWind(WindBean wind) {
			this.wind = wind;
		}

		public static class UltravioletBean {
			/**
			 * index : 2.0
			 * desc : 很弱
			 */

			private double index;
			private String desc;

			public double getIndex() {
				return index;
			}

			public void setIndex(double index) {
				this.index = index;
			}

			public String getDesc() {
				return desc;
			}

			public void setDesc(String desc) {
				this.desc = desc;
			}

			@Override
			public String toString() {
				return "UltravioletBean{" +
						"index=" + index +
						", desc='" + desc + '\'' +
						'}';
			}
		}

		public static class PrecipitationBean {
			/**
			 * nearest : {"status":"ok","distance":23.43,"intensity":0.1875}
			 * local : {"status":"ok","intensity":0,"datasource":"radar"}
			 */

			private NearestBean nearest;
			private LocalBean local;

			public NearestBean getNearest() {
				return nearest;
			}

			public void setNearest(NearestBean nearest) {
				this.nearest = nearest;
			}

			public LocalBean getLocal() {
				return local;
			}

			public void setLocal(LocalBean local) {
				this.local = local;
			}

			public static class NearestBean {
				/**
				 * status : ok
				 * distance : 23.43
				 * intensity : 0.1875
				 */

				private String status;
				private double distance;
				private double intensity;

				public String getStatus() {
					return status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public double getDistance() {
					return distance;
				}

				public void setDistance(double distance) {
					this.distance = distance;
				}

				public double getIntensity() {
					return intensity;
				}

				public void setIntensity(double intensity) {
					this.intensity = intensity;
				}

				@Override
				public String toString() {
					return "NearestBean{" +
							"status='" + status + '\'' +
							", distance=" + distance +
							", intensity=" + intensity +
							'}';
				}
			}

			public static class LocalBean {
				/**
				 * status : ok
				 * intensity : 0.0
				 * datasource : radar
				 */

				private String status;
				private double intensity;
				private String datasource;

				public String getStatus() {
					return status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public double getIntensity() {
					return intensity;
				}

				public void setIntensity(double intensity) {
					this.intensity = intensity;
				}

				public String getDatasource() {
					return datasource;
				}

				public void setDatasource(String datasource) {
					this.datasource = datasource;
				}

				@Override
				public String toString() {
					return "LocalBean{" +
							"status='" + status + '\'' +
							", intensity=" + intensity +
							", datasource='" + datasource + '\'' +
							'}';
				}
			}

			@Override
			public String toString() {
				return "PrecipitationBean{" +
						"nearest=" + nearest +
						", local=" + local +
						'}';
			}
		}

		public static class ComfortBean {
			/**
			 * index : 5
			 * desc : 舒适
			 */

			private int index;
			private String desc;

			public int getIndex() {
				return index;
			}

			public void setIndex(int index) {
				this.index = index;
			}

			public String getDesc() {
				return desc;
			}

			public void setDesc(String desc) {
				this.desc = desc;
			}

			@Override
			public String toString() {
				return "ComfortBean{" +
						"index=" + index +
						", desc='" + desc + '\'' +
						'}';
			}
		}

		public static class WindBean {
			/**
			 * direction : 66.94
			 * speed : 31.59
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

			@Override
			public String toString() {
				return "WindBean{" +
						"direction=" + direction +
						", speed=" + speed +
						'}';
			}
		}
	}

	@Override
	public String toString() {
		return "NowWeather{" +
				"status='" + status + '\'' +
				", lang='" + lang + '\'' +
				", unit='" + unit + '\'' +
				", server_time=" + server_time +
				", api_status='" + api_status + '\'' +
				", tzshift=" + tzshift +
				", api_version='" + api_version + '\'' +
				", result=" + result +
				", location=" + location +
				'}';
	}
}
