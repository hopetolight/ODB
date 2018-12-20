package com.suneee.odb.model.rocketmq;


import java.io.Serializable;
import java.util.Map;

/**
 * 采集数据明细对象
 *
 * @author zyj
 */
public class GatherRecordData2 implements Serializable, Cloneable {
	public static final String CODE = "code";
	public static final String NAME = "name";
	private String id;
	private String dtu_no;// 终端编号
	private int ecu_id;// ecu版本id
	private String gather_id;// 采集记录id
	private int config_id;// 采集配置id
	private String gather_time;// 采集时间
	private long gather_time_us;//采集时间的微妙数
	private String record_time;// 系统记录时间
	private String data;// 数据（根据采集变量顺序，把相应的值使用|连接）对于需要用于统计的变量，另外添加字段
	private float ecu_speed;// 车速
	private float ecu_gear;// 档位
	private float ecu_rpm;// 发动机转速
	private float ecu_accp;// 油门开度
	private float ecu_injctl;// 循环喷油量
	private float ecu_effective_torque;// 有效扭矩
	private float ecu_act_torque_percent;// 发动机实际扭矩百分比
	private float ecu_intercooler_press;// 中冷后压力
	private float ecu_intercooler_temp;// 中冷后温度
	private float ecu_nox_ppm;// Nox传感器ppm值
	private float ecu_injqua;// 瞬时泵喷射量
	private float gps_speed;// GPS车速
	private float gps_high;// 海拔高度
	private float reserve1;// 保留字段1
	private float reserve2;// 保留字段2
	private float reserve3;// 保留字段3
	private float reserve4;// 保留字段4
	private float reserve5;// 保留字段5
	private String row_key;
	private String ship_id;
	//private transient Map<String,Object> codeDataMap;
	//private transient Map<String,Object> nameDataMap;
	private transient Map<String,Map<String,Object>> detailVals;
	public GatherRecordData2() {
	}

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

	public int getEcu_id() {
		return ecu_id;
	}

	public void setEcu_id(int ecu_id) {
		this.ecu_id = ecu_id;
	}

	public String getGather_id() {
		return gather_id;
	}

	public void setGather_id(String gather_id) {
		this.gather_id = gather_id;
	}

	public int getConfig_id() {
		return config_id;
	}

	public void setConfig_id(int config_id) {
		this.config_id = config_id;
	}

	public String getGather_time() {
		return gather_time;
	}

	public void setGather_time(String gather_time) {
		this.gather_time = gather_time;
	}

	public long getGather_time_us() {
		return gather_time_us;
	}

	public void setGather_time_us(long gather_time_us) {
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

	public float getEcu_speed() {
		return ecu_speed;
	}

	public void setEcu_speed(float ecu_speed) {
		this.ecu_speed = ecu_speed;
	}

	public float getEcu_gear() {
		return ecu_gear;
	}

	public void setEcu_gear(float ecu_gear) {
		this.ecu_gear = ecu_gear;
	}

	public float getEcu_rpm() {
		return ecu_rpm;
	}

	public void setEcu_rpm(float ecu_rpm) {
		this.ecu_rpm = ecu_rpm;
	}

	public float getEcu_accp() {
		return ecu_accp;
	}

	public void setEcu_accp(float ecu_accp) {
		this.ecu_accp = ecu_accp;
	}

	public float getEcu_injctl() {
		return ecu_injctl;
	}

	public void setEcu_injctl(float ecu_injctl) {
		this.ecu_injctl = ecu_injctl;
	}

	public float getEcu_effective_torque() {
		return ecu_effective_torque;
	}

	public void setEcu_effective_torque(float ecu_effective_torque) {
		this.ecu_effective_torque = ecu_effective_torque;
	}

	public float getEcu_act_torque_percent() {
		return ecu_act_torque_percent;
	}

	public void setEcu_act_torque_percent(float ecu_act_torque_percent) {
		this.ecu_act_torque_percent = ecu_act_torque_percent;
	}

	public float getEcu_intercooler_press() {
		return ecu_intercooler_press;
	}

	public void setEcu_intercooler_press(float ecu_intercooler_press) {
		this.ecu_intercooler_press = ecu_intercooler_press;
	}

	public float getEcu_intercooler_temp() {
		return ecu_intercooler_temp;
	}

	public void setEcu_intercooler_temp(float ecu_intercooler_temp) {
		this.ecu_intercooler_temp = ecu_intercooler_temp;
	}

	public float getEcu_nox_ppm() {
		return ecu_nox_ppm;
	}

	public void setEcu_nox_ppm(float ecu_nox_ppm) {
		this.ecu_nox_ppm = ecu_nox_ppm;
	}

	public float getEcu_injqua() {
		return ecu_injqua;
	}

	public void setEcu_injqua(float ecu_injqua) {
		this.ecu_injqua = ecu_injqua;
	}

	public float getGps_speed() {
		return gps_speed;
	}

	public void setGps_speed(float gps_speed) {
		this.gps_speed = gps_speed;
	}

	public float getGps_high() {
		return gps_high;
	}

	public void setGps_high(float gps_high) {
		this.gps_high = gps_high;
	}

	public float getReserve1() {
		return reserve1;
	}

	public void setReserve1(float reserve1) {
		this.reserve1 = reserve1;
	}

	public float getReserve2() {
		return reserve2;
	}

	public void setReserve2(float reserve2) {
		this.reserve2 = reserve2;
	}

	public float getReserve3() {
		return reserve3;
	}

	public void setReserve3(float reserve3) {
		this.reserve3 = reserve3;
	}

	public float getReserve4() {
		return reserve4;
	}

	public void setReserve4(float reserve4) {
		this.reserve4 = reserve4;
	}

	public float getReserve5() {
		return reserve5;
	}

	public void setReserve5(float reserve5) {
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

	@Override
	public GatherRecordData2 clone() {
		try {
			return (GatherRecordData2) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Map<String, Map<String, Object>> getDetailVals() {
		return detailVals;
	}

	public void setDetailVals(Map<String, Map<String, Object>> detailVals) {
		this.detailVals = detailVals;
	}

	@Override
	public String toString() {
		return "GatherRecordData2{" +
				"id='" + id + '\'' +
				", dtu_no='" + dtu_no + '\'' +
				", ecu_id=" + ecu_id +
				", gather_id='" + gather_id + '\'' +
				", config_id=" + config_id +
				", gather_time='" + gather_time + '\'' +
				", gather_time_us=" + gather_time_us +
				", record_time='" + record_time + '\'' +
				", data='" + data + '\'' +
				", ecu_speed=" + ecu_speed +
				", ecu_gear=" + ecu_gear +
				", ecu_rpm=" + ecu_rpm +
				", ecu_accp=" + ecu_accp +
				", ecu_injctl=" + ecu_injctl +
				", ecu_effective_torque=" + ecu_effective_torque +
				", ecu_act_torque_percent=" + ecu_act_torque_percent +
				", ecu_intercooler_press=" + ecu_intercooler_press +
				", ecu_intercooler_temp=" + ecu_intercooler_temp +
				", ecu_nox_ppm=" + ecu_nox_ppm +
				", ecu_injqua=" + ecu_injqua +
				", gps_speed=" + gps_speed +
				", gps_high=" + gps_high +
				", reserve1=" + reserve1 +
				", reserve2=" + reserve2 +
				", reserve3=" + reserve3 +
				", reserve4=" + reserve4 +
				", reserve5=" + reserve5 +
				", row_key='" + row_key + '\'' +
				", ship_id='" + ship_id + '\'' +
				", detailVals=" + detailVals +
				'}';
	}
}
