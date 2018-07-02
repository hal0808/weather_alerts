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
}
