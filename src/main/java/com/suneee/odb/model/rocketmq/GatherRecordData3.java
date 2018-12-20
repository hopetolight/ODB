package com.suneee.odb.model.rocketmq;


import java.io.Serializable;
import java.util.Map;

/**
 * 采集数据明细对象
 *
 * @author zyj
 */
public class GatherRecordData3 implements Serializable, Cloneable {
	public static final String CODE = "code";
	public static final String NAME = "name";
	public static final String FLAG = "flag";
	private String id="0";
	private String dtu_no="0";// 终端编号
	private String ecu_id="0";// ecu版本id
	private String gather_id="0";// 采集记录id
	private String config_id="0";// 采集配置id
	private String gather_time="0";// 采集时间
	private transient String calAcceptTime;
	private String gather_time_us="0";//采集时间的微妙数
	private String record_time="0";// 系统记录时间
	private String data="0";// 数据（根据采集变量顺序，把相应的值使用|连接）对于需要用于统计的变量，另外添加字段
	private String ecu_speed="0";// 车速
	private String ecu_gear="0";// 档位
	private String ecu_rpm="0";// 发动机转速
	private String ecu_accp="0";// 油门开度
	private String ecu_injctl="0";// 循环喷油量
	private String ecu_effective_torque="0";// 有效扭矩
	private String ecu_act_torque_percent="0";// 发动机实际扭矩百分比
	private String ecu_intercooler_press="0";// 中冷后压力
	private String ecu_intercooler_temp="0";// 中冷后温度
	private String ecu_nox_ppm="0";// Nox传感器ppm值
	private String ecu_injqua="0";// 瞬时泵喷射量
	private String gps_speed="0";// GPS车速
	private String gps_high="0";// 海拔高度
	private String reserve1="0";// 保留字段1
	private String reserve2="0";// 保留字段2
	private String reserve3="0";// 保留字段3
	private String reserve4="0";// 保留字段4
	private String reserve5="0";// 保留字段5
	private String row_key;
	private String ship_id="";
	private transient Map<String,Map<String,Object>> detailVals;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDtu_no() {
		return dtu_no;
	}

	public void setDtu_no(String dtu_no) {
		this.dtu_no = dtu_no;
	}

	public String getEcu_id() {
		return ecu_id;
	}

	public void setEcu_id(String ecu_id) {
		this.ecu_id = ecu_id;
	}

	public String getGather_id() {
		return gather_id;
	}

	public void setGather_id(String gather_id) {
		this.gather_id = gather_id;
	}

	public String getConfig_id() {
		return config_id;
	}

	public void setConfig_id(String config_id) {
		this.config_id = config_id;
	}

	public String getGather_time() {
		return gather_time;
	}

	public void setGather_time(String gather_time) {
		this.gather_time = gather_time;
	}

	public String getGather_time_us() {
		return gather_time_us;
	}

	public void setGather_time_us(String gather_time_us) {
		this.gather_time_us = gather_time_us;
	}

	public String getRecord_time() {
		return record_time;
	}

	public void setRecord_time(String record_time) {
		this.record_time = record_time;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEcu_speed() {
		return ecu_speed;
	}

	public void setEcu_speed(String ecu_speed) {
		this.ecu_speed = ecu_speed;
	}

	public String getEcu_gear() {
		return ecu_gear;
	}

	public void setEcu_gear(String ecu_gear) {
		this.ecu_gear = ecu_gear;
	}

	public String getEcu_rpm() {
		return ecu_rpm;
	}

	public void setEcu_rpm(String ecu_rpm) {
		this.ecu_rpm = ecu_rpm;
	}

	public String getEcu_accp() {
		return ecu_accp;
	}

	public void setEcu_accp(String ecu_accp) {
		this.ecu_accp = ecu_accp;
	}

	public String getEcu_injctl() {
		return ecu_injctl;
	}

	public void setEcu_injctl(String ecu_injctl) {
		this.ecu_injctl = ecu_injctl;
	}

	public String getEcu_effective_torque() {
		return ecu_effective_torque;
	}

	public void setEcu_effective_torque(String ecu_effective_torque) {
		this.ecu_effective_torque = ecu_effective_torque;
	}

	public String getEcu_act_torque_percent() {
		return ecu_act_torque_percent;
	}

	public void setEcu_act_torque_percent(String ecu_act_torque_percent) {
		this.ecu_act_torque_percent = ecu_act_torque_percent;
	}

	public String getEcu_intercooler_press() {
		return ecu_intercooler_press;
	}

	public void setEcu_intercooler_press(String ecu_intercooler_press) {
		this.ecu_intercooler_press = ecu_intercooler_press;
	}

	public String getEcu_intercooler_temp() {
		return ecu_intercooler_temp;
	}

	public void setEcu_intercooler_temp(String ecu_intercooler_temp) {
		this.ecu_intercooler_temp = ecu_intercooler_temp;
	}

	public String getEcu_nox_ppm() {
		return ecu_nox_ppm;
	}

	public void setEcu_nox_ppm(String ecu_nox_ppm) {
		this.ecu_nox_ppm = ecu_nox_ppm;
	}

	public String getEcu_injqua() {
		return ecu_injqua;
	}

	public void setEcu_injqua(String ecu_injqua) {
		this.ecu_injqua = ecu_injqua;
	}

	public String getGps_speed() {
		return gps_speed;
	}

	public void setGps_speed(String gps_speed) {
		this.gps_speed = gps_speed;
	}

	public String getGps_high() {
		return gps_high;
	}

	public void setGps_high(String gps_high) {
		this.gps_high = gps_high;
	}

	public String getReserve1() {
		return reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	public String getReserve2() {
		return reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

	public String getReserve3() {
		return reserve3;
	}

	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}

	public String getReserve4() {
		return reserve4;
	}

	public void setReserve4(String reserve4) {
		this.reserve4 = reserve4;
	}

	public String getReserve5() {
		return reserve5;
	}

	public void setReserve5(String reserve5) {
		this.reserve5 = reserve5;
	}

	public String getRow_key() {
		return row_key;
	}

	public void setRow_key(String row_key) {
		this.row_key = row_key;
	}

	public String getShip_id() {
		return ship_id;
	}

	public void setShip_id(String ship_id) {
		this.ship_id = ship_id;
	}

	public Map<String, Map<String, Object>> getDetailVals() {
		return detailVals;
	}

	public void setDetailVals(Map<String, Map<String, Object>> detailVals) {
		this.detailVals = detailVals;
	}


	public String getCalAcceptTime() {
		return calAcceptTime;
	}

	public void setCalAcceptTime(String calAcceptTime) {
		this.calAcceptTime = calAcceptTime;
	}
}
