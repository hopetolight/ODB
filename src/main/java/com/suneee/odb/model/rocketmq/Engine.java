package com.suneee.odb.model.rocketmq;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Engine implements Serializable {

    private String id;
    /**
     * 船舶ID
     */
    private String carId;
    /**
     * 船舶编号
     */
    private String carCode;
    /**
     * 终端编号
     */
    private String dtuNo;
    /**
     * 发动机编号
     */
    private String engineNo;
    /**
     * 发动机生产厂
     */
    private String engineFactory;
    /**
     * 发动机类型
     */
    private String engineType;
    /**
     * 发动机系列
     */
    private String engineSeries;
    /**
     * 发动机型号
     */
    private String engineVersion;
    /**
     * 发动机排放
     */
    private String engineEmission;
    /**
     * 发动机功率
     */
    private String enginePower;
    /**
     * 发动机出场时间
     */
    private Date engineDate;
    /**
     * 发动机用途
     */
    private String engineUse;
    /**
     * 发动机安装位置
     */
    private String engineLocation;

    /**
     * 创建者
     */
    private String creator;
    /**
     * 更改这
     */
    private String updator;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;

    private String delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public String getDtuNo() {
        return dtuNo;
    }

    public void setDtuNo(String dtuNo) {
        this.dtuNo = dtuNo;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getEngineFactory() {
        return engineFactory;
    }

    public void setEngineFactory(String engineFactory) {
        this.engineFactory = engineFactory;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineSeries() {
        return engineSeries;
    }

    public void setEngineSeries(String engineSeries) {
        this.engineSeries = engineSeries;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public String getEngineEmission() {
        return engineEmission;
    }

    public void setEngineEmission(String engineEmission) {
        this.engineEmission = engineEmission;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public Date getEngineDate() {
        return engineDate;
    }

    public void setEngineDate(Date engineDate) {
        this.engineDate = engineDate;
    }

    public String getEngineUse() {
        return engineUse;
    }

    public void setEngineUse(String engineUse) {
        this.engineUse = engineUse;
    }

    public String getEngineLocation() {
        return engineLocation;
    }

    public void setEngineLocation(String engineLocation) {
        this.engineLocation = engineLocation;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(carId, engine.carId) &&
                Objects.equals(carCode, engine.carCode) &&
                Objects.equals(dtuNo, engine.dtuNo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(carId, carCode, dtuNo);
    }
}
