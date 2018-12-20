package com.suneee.odb.model.rocketmq;


import com.suneee.odb.config.serializer.constant.Constants;

import java.io.Serializable;
import java.util.Date;

//终端主动上报的报警
public class DtuAlarm extends BaseDtuMessage implements  Serializable {
	private static final long serialVersionUID = 1794734275382880098L;
	
	public String toString(){
		return "DtuAlarm(alarmType:"+alarmType
				+",alarmId:"+alarmId
				+",alarmDesc:"+alarmDesc
				+",lat:"+((lat==null)?"null":lat.toString())
				+",lon:"+((lon==null)?"null":lon.toString())
				+",speed:"+((speed==null)?"null":speed.toString())
				+",areaType:"+areaType
				+",areaID:"+areaID
				+",alarmTime:"+((alarmTime==null)?"null":alarmTime.toString())
				+super.toString()+")";
	}
	private String alarmId;   //报警ID(主键，根据该ID更新结束时间)
	private String alarmType; //报警类型
	private String alarmDesc; //报警描述
	private Double lat;       //发生时纬度
	private Double lon;       //发生时经度
	private Double gcj02Lat;  //gcj02纬度(高德纠偏值)	
	private Double gcj02Lng;  //gcj02经度(高德纠偏值)	
	private Float  speed;     //发生时速度
	private String areaType;  //电子围栏类型
	private String areaID;    //电子围栏ID
	
	private Date alarmTime;   //报警时间
	
	public DtuAlarm() {		
	}
	
	public String getMsgTopic() {
		return Constants.MQ_TOPIC_NOTIFY;
	}
	
	public Date getAlarmTime() {
		return alarmTime;
	}

	public void setAlarmTime(Date alarmTime) {
		this.alarmTime = alarmTime;
	}

	public String getAlarmType() {
		return alarmType;
	}

	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
	}

	public String getAlarmDesc() {
		return alarmDesc;
	}

	public void setAlarmDesc(String alarmDesc) {
		this.alarmDesc = alarmDesc;
	}

	public String getAreaID() {
		return areaID;
	}

	public void setAreaID(String areaID) {
		this.areaID = areaID;
	}

	public String getAreaType() {
		return areaType;
	}

	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}
	
	public Float getSpeed() {
		return speed;
	}

	public void setSpeed(Float speed) {
		this.speed = speed;
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
	 * @return the lon
	 */
	public Double getLon() {
		return lon;
	}

	/**
	 * @param lon the lon to set
	 */
	public void setLon(Double lon) {
		this.lon = lon;
	}

	/**
	 * @return the alarmId
	 */
	public String getAlarmId() {
		return alarmId;
	}

	/**
	 * @param alarmId the alarmId to set
	 */
	public void setAlarmId(String alarmId) {
		this.alarmId = alarmId;
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


}
