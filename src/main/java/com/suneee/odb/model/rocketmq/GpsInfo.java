package com.suneee.odb.model.rocketmq;


import com.suneee.odb.config.serializer.constant.Constants;

import java.io.Serializable;
import java.util.Date;

//终端上报的定位信息
public class GpsInfo extends BaseDtuMessage implements Serializable{

	private static final long serialVersionUID = 7215103673464513095L;

	private Date gpsTime; //定位时间
	private String gpsStatus; //定位状态
	private String accStatus; //ACC状态
	private Double lat;   //纬度
	private Double lng;   //经度
	private Double gcj02Lat; //gcj02纬度(高德纠偏值)
	private Double gcj02Lng; //gcj02经度(高德纠偏值)

	private Float speed;     //速度
	private Integer altitude;  //高程
	private Integer direction; //方向

	private String latFlag;   //纬度半球
	private String lngFlag;   //经度半球

	private Float recorderSpeed;  //记录仪速度
	private Float totalMileage;  //累计里程数
	private Float totalOil;  //总油量

	private String alarmInfo; //报警信息（格式：报警1$报警2$报警3）
	private String statusInfo;//状态信息
	private String otherInfo; //附加信息

	// 20180424 yiheng 增加百度经纬度
	private transient Double baiduLat;
	private transient Double baiduLng;

	public String toString(){
		//return JSONUtils.toJSONString(this);
		return "GpsInfo(gpsStatus:"+gpsStatus
				+",accStatus:"+accStatus
				+",gpsTime:"+((gpsTime==null)?"null":gpsTime.toString())
				+",lat:"+((lat==null)?"null":lat.toString())
				+",lng:"+((lng==null)?"null":lng.toString())
				+",gcj02Lat:"+((gcj02Lat==null)?"null":gcj02Lat.toString())
				+",gcj02Lng:"+((gcj02Lng==null)?"null":gcj02Lng.toString())
				+",speed:"+((speed==null)?"null":speed.toString())
				+",altitude:"+((altitude==null)?"null":altitude.toString())
				+",direction:"+((direction==null)?"null":direction.toString())
				+",latFlag:"+latFlag
				+",lngFlag:"+lngFlag
				+",recorderSpeed:"+((recorderSpeed==null)?"null":recorderSpeed.toString())
				+",totalMileage:"+((totalMileage==null)?"null":totalMileage.toString())
				+",totalOil:"+((totalOil==null)?"null":totalOil.toString())
				+",alarmInfo:"+alarmInfo
				+",statusInfo:"+statusInfo
				+",otherInfo:"+otherInfo
				+super.toString()+")";
	}

	public GpsInfo(){

	}

	@Override
	public String getMsgTopic() {
		return Constants.MQ_TOPIC_GPS;
	}

	public Date getGpsTime() {
		return gpsTime;
	}

	public void setGpsTime(Date gpsTime) {
		this.gpsTime = gpsTime;
	}

	public String getGpsStatus() {
		return gpsStatus;
	}

	/**
	 * @return the accStatus
	 */
	public String getAccStatus() {
		return accStatus;
	}

	/**
	 * @param accStatus the accStatus to set
	 */
	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
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
	 * @return the altitude
	 */
	public Integer getAltitude() {
		return altitude;
	}

	/**
	 * @param altitude the altitude to set
	 */
	public void setAltitude(Integer altitude) {
		this.altitude = altitude;
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

	/**
	 * @return the latFlag
	 */
	public String getLatFlag() {
		return latFlag;
	}

	/**
	 * @param latFlag the latFlag to set
	 */
	public void setLatFlag(String latFlag) {
		this.latFlag = latFlag;
	}

	/**
	 * @return the lngFlag
	 */
	public String getLngFlag() {
		return lngFlag;
	}

	/**
	 * @param lngFlag the lngFlag to set
	 */
	public void setLngFlag(String lngFlag) {
		this.lngFlag = lngFlag;
	}

	/**
	 * @return the totalOil
	 */
	public Float getTotalOil() {
		return totalOil;
	}

	/**
	 * @param totalOil the totalOil to set
	 */
	public void setTotalOil(Float totalOil) {
		this.totalOil = totalOil;
	}

	/**
	 * @return the recorderSpeed
	 */
	public Float getRecorderSpeed() {
		return recorderSpeed;
	}

	/**
	 * @param recorderSpeed the recorderSpeed to set
	 */
	public void setRecorderSpeed(Float recorderSpeed) {
		this.recorderSpeed = recorderSpeed;
	}

	/**
	 * @return the totalMileage
	 */
	public Float getTotalMileage() {
		return totalMileage;
	}

	/**
	 * @param totalMileage the totalMileage to set
	 */
	public void setTotalMileage(Float totalMileage) {
		this.totalMileage = totalMileage;
	}

	/**
	 * @return the alarmInfo
	 */
	public String getAlarmInfo() {
		return alarmInfo;
	}

	/**
	 * @param alarmInfo the alarmInfo to set
	 */
	public void setAlarmInfo(String alarmInfo) {
		this.alarmInfo = alarmInfo;
	}

	/**
	 * @return the statusInfo
	 */
	public String getStatusInfo() {
		return statusInfo;
	}

	/**
	 * @param statusInfo the statusInfo to set
	 */
	public void setStatusInfo(String statusInfo) {
		this.statusInfo = statusInfo;
	}

	/**
	 * @return the otherInfo
	 */
	public String getOtherInfo() {
		return otherInfo;
	}

	/**
	 * @param otherInfo the otherInfo to set
	 */
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

	/**
	 * @param gpsStatus the gpsStatus to set
	 */
	public void setGpsStatus(String gpsStatus) {
		this.gpsStatus = gpsStatus;
	}

	public Double getBaiduLat() {
		return baiduLat;
	}

	public void setBaiduLat(Double baiduLat) {
		this.baiduLat = baiduLat;
	}

	public Double getBaiduLng() {
		return baiduLng;
	}

	public void setBaiduLng(Double baiduLng) {
		this.baiduLng = baiduLng;
	}
}
