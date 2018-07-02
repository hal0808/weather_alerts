package bean;

public class City {
	private int code;	//コードID
	private String name;	//都市名
	private double lat;		//緯度
	private double lon;		//経度



	public City(int code, String name, double lat, double lon) {
		this.code = code;
		this.name = name;
		this.lat = lat;
		this.lon = lon;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}


}


