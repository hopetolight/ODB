package com.suneee.odb.model.rocketmq;

import java.io.Serializable;

public class KafkaGpsMessage implements Serializable {
    private String row_key;
    private String msgid;
    private String dtu_id;
    private String ship_id;
    private String gps_time;
    private String gps_status;
    private String acc_status;
    private String lat;
    private String lng;
    private String lat_baidu;
    private String lng_baidu;
    private String lat_gaode;
    private String lng_gaode;
    private String speed;
    private String altitude;
    private String direction;
    private String latFlag;
    private String lngFlag;
    private String recorder_speed;
    private String total_mileage;
    private String total_oil;
    private String alarm_info;
    private String status_info;
    private String other_info;
    private String record_time;

    public String getRow_key() {
        return row_key;
    }

    public void setRow_key(String row_key) {
        this.row_key = row_key;
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public String getDtu_id() {
        return dtu_id;
    }

    public void setDtu_id(String dtu_id) {
        this.dtu_id = dtu_id;
    }

    public String getShip_id() {
        return ship_id;
    }

    public void setShip_id(String ship_id) {
        this.ship_id = ship_id;
    }

    public String getGps_time() {
        return gps_time;
    }

    public void setGps_time(String gps_time) {
        this.gps_time = gps_time;
    }

    public String getGps_status() {
        return gps_status;
    }

    public void setGps_status(String gps_status) {
        this.gps_status = gps_status;
    }

    public String getAcc_status() {
        return acc_status;
    }

    public void setAcc_status(String acc_status) {
        this.acc_status = acc_status;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat_baidu() {
        return lat_baidu;
    }

    public void setLat_baidu(String lat_baidu) {
        this.lat_baidu = lat_baidu;
    }

    public String getLng_baidu() {
        return lng_baidu;
    }

    public void setLng_baidu(String lng_baidu) {
        this.lng_baidu = lng_baidu;
    }

    public String getLat_gaode() {
        return lat_gaode;
    }

    public void setLat_gaode(String lat_gaode) {
        this.lat_gaode = lat_gaode;
    }

    public String getLng_gaode() {
        return lng_gaode;
    }

    public void setLng_gaode(String lng_gaode) {
        this.lng_gaode = lng_gaode;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLatFlag() {
        return latFlag;
    }

    public void setLatFlag(String latFlag) {
        this.latFlag = latFlag;
    }

    public String getLngFlag() {
        return lngFlag;
    }

    public void setLngFlag(String lngFlag) {
        this.lngFlag = lngFlag;
    }

    public String getRecorder_speed() {
        return recorder_speed;
    }

    public void setRecorder_speed(String recorder_speed) {
        this.recorder_speed = recorder_speed;
    }

    public String getTotal_mileage() {
        return total_mileage;
    }

    public void setTotal_mileage(String total_mileage) {
        this.total_mileage = total_mileage;
    }

    public String getTotal_oil() {
        return total_oil;
    }

    public void setTotal_oil(String total_oil) {
        this.total_oil = total_oil;
    }

    public String getAlarm_info() {
        return alarm_info;
    }

    public void setAlarm_info(String alarm_info) {
        this.alarm_info = alarm_info;
    }

    public String getStatus_info() {
        return status_info;
    }

    public void setStatus_info(String status_info) {
        this.status_info = status_info;
    }

    public String getOther_info() {
        return other_info;
    }

    public void setOther_info(String other_info) {
        this.other_info = other_info;
    }

    public String getRecord_time() {
        return record_time;
    }

    public void setRecord_time(String record_time) {
        this.record_time = record_time;
    }
}
