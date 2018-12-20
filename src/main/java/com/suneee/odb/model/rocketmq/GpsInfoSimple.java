package com.suneee.odb.model.rocketmq;


import com.suneee.odb.config.serializer.constant.Constants;

import java.io.Serializable;
import java.util.Date;

//终端上报的定位信息
public class GpsInfoSimple extends BaseDtuMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1124221057724328529L;
	
	private Date gpsTime; //定位时间
	private Double lat;   //纬度	
	private Double lng;   //经度	
	private Double gcj02Lat; //gcj02纬度(高德纠偏值)	
	private Double gcj02Lng; //gcj02经度(高德纠偏值)
	// 20180424 yiheng 增加百度经纬度
	private Double baiduLat;
	private Double baiduLng;
	
	private Float speed;     //速度
	private Integer direction; //方向	
	

	public String toString(){
		return "GpsInfo(gpsTime:"+((gpsTime==null)?"null":gpsTime.toString())
				+",lat:"+((lat==null)?"null":lat.toString())
				+",lng:"+((lng==null)?"null":lng.toString())
				+",gcj02Lat:"+((gcj02Lat==null)?"null":gcj02Lat.toString())
				+",gcj02Lng:"+((gcj02Lng==null)?"null":gcj02Lng.toString())
				// 20180424 yiheng 增加百度经纬度
				+",baiduLat:"+((baiduLat==null)?"null":baiduLat.toString())
				+",baiduLng:"+((baiduLng==null)?"null":baiduLng.toString())
				+",speed:"+((speed==null)?"null":speed.toString())
				+",direction:"+((direction==null)?"null":direction.toString())
				+super.toString()+")";
	}
	
	public GpsInfoSimple(){
		
	}
	public GpsInfoSimple(GpsInfo gil){
		this.dtuId=gil.getDtuId();
		this.gpsTime = gil.getGpsTime();
		this.lat = gil.getLat();
		this.lng = gil.getLng();
		this.gcj02Lat = gil.getGcj02Lat();
		this.gcj02Lng = gil.getGcj02Lng();
		this.baiduLat = gil.getBaiduLat();
		this.baiduLng = gil.getBaiduLng();
		this.speed= gil.getSpeed();     //速度
		this.direction= gil.getDirection(); //方向	
	}

	@Override
	public String getMsgTopic() {
		return Constants.MQ_TOPIC_NOTIFY;
	}
	
	public Date getGpsTime() {
		return gpsTime;
	}
	
	public void setGpsTime(Date gpsTime) {
		this.gpsTime = gpsTime;
	}

	/**
	 * @return the lat
	 */
	public Double getLat() {
		return lat;
	}

	/**
	 * @param lat the lat to set
	 */
	public void setLat(Double lat) {
		this.lat = lat;
	}

	/**
	 * @return the lng
	 */
	public Double getLng() {
		return lng;
	}

	/**
	 * @param lng the lng to set
	 */
	public void setLng(Double lng) {
		this.lng = lng;
	}

	/**
	 * @return the gcj02Lat
	 */
	public Double getGcj02Lat() {
		return gcj02Lat;
	}

	/**
	 * @param gcj02Lat the gcj02Lat to set
	 */
	public void setGcj02Lat(Double gcj02Lat) {
		this.gcj02Lat = gcj02Lat;
	}

	/**
	 * @return the gcj02Lng
	 */
	public Double getGcj02Lng() {
		return gcj02Lng;
	}

	/**
	 * @param gcj02Lng the gcj02Lng to set
	 */
	public void setGcj02Lng(Double gcj02Lng) {
		this.gcj02Lng = gcj02Lng;
	}

	/**
	 * 20180424 yiheng 增加百度经纬度
	 * @return the baiduLat
	 */
	public Double getBaiduLat() {
		return baiduLat;
	}

	/**
	 * @param baiduLat the baiduLat to set
	 */
	public void setBaiduLat(Double baiduLat) {
		this.baiduLat = baiduLat;
	}

	/**
	 * @return the baiduLng
	 */
	public Double getBaiduLng() {
		return baiduLng;
	}

	/**
	 * @param baiduLng the baiduLng to set
	 */
	public void setBaiduLng(Double baiduLng) {
		this.baiduLng = baiduLng;
	}

	/**
	 * @return the speed
	 */
	public Float getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(Float speed) {
		this.speed = speed;
	}

	/**
	 * @return the direction
	 */
	public Integer getDirection() {
		return direction;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(Integer direction) {
		this.direction = direction;
	}

}
