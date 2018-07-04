package bean;

import java.util.Date;

public class Weather {
	private int id;			//天気ID(テスト)
	private Date update;	//更新日時
	private int code;		//都市コード
	private Date datetime;	//取得日時
	private double temp_min;	//最低気温
	private double temp_max;	//最高気温
	private String icon;		//画像名
	private String weather;		//天気




	public Weather(int id, Date update, int code, Date datetime, double temp_min, double temp_max, String icon,
			String weather) {
		this.id = id;
		this.update = update;
		this.code = code;
		this.datetime = datetime;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.icon = icon;
		this.weather = weather;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getUpdate() {
		return update;
	}

	public void setUpdate(Date update) {
		this.update = update;
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}

	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public double getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}

	public double getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}

	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}


}
