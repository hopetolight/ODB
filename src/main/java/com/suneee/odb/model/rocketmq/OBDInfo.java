package com.suneee.odb.model.rocketmq;

import com.suneee.odb.config.serializer.constant.Constants;

import java.io.Serializable;

/**
 * OBD 信息上报：add by yunzhi :20180727
 */
public class OBDInfo extends BaseDtuMessage implements Serializable {
    /**
     * OBD诊断协议 可能的值如下：IOS15765，IOS27145，SAEJ1939，字符串空代表无效
     */
    private String diagnoseProtocol;

    /**
     * MIL状态
     * 0未点亮
     * 1点亮
     * -1000无效
     */
    private String milState;
    /**
     * 诊断支持状态	相见国六文档
     */
    private Integer supportState;
    /**
     * 诊断就绪状态	相见国六文档
     */
    private Integer readyState;

    /**
     * 车辆识别码	由17位字码构成，字码应符合GB16735中4.5的规定
     */
    private String carVin;
    /**
     * 软件标定识别号	由18位字码构成，软件标定识别号由生产企业自定义，字母或数字组成，不足后面补字符“0”。
     */
    private String corpSoftwareid;
    /**
     * 标定验证码	由18位字码构成，标定验证码由生产企业自定义，字母或数字组成，不足后面补字符“0”。
     */
    private String corpCvn	;
    /**
     * IUPR值	定义参考SAEJ1979-DA表G11。
     */
    private String IuprValue;


    public String getDiagnoseProtocol() {
        return diagnoseProtocol;
    }

    public void setDiagnoseProtocol(String diagnoseProtocol) {
        this.diagnoseProtocol = diagnoseProtocol;
    }

    public String getMilState() {
        return milState;
    }

    public void setMilState(String milState) {
        this.milState = milState;
    }

    public Integer getSupportState() {
        return supportState;
    }

    public void setSupportState(Integer supportState) {
        this.supportState = supportState;
    }

    public Integer getReadyState() {
        return readyState;
    }

    public void setReadyState(Integer readyState) {
        this.readyState = readyState;
    }

    public String getCarVin() {
        return carVin;
    }

    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    public String getCorpSoftwareid() {
        return corpSoftwareid;
    }

    public void setCorpSoftwareid(String corpSoftwareid) {
        this.corpSoftwareid = corpSoftwareid;
    }

    public String getCorpCvn() {
        return corpCvn;
    }

    public void setCorpCvn(String corpCvn) {
        this.corpCvn = corpCvn;
    }

    public String getIuprValue() {
        return IuprValue;
    }

    public void setIuprValue(String iuprValue) {
        IuprValue = iuprValue;
    }


    @Override
    public String toString() {
        return "OBDInfo{" +
                "diagnoseProtocol='" + diagnoseProtocol + '\'' +
                ", milState='" + milState + '\'' +
                ", supportState=" + supportState +
                ", readyState=" + readyState +
                ", carVin='" + carVin + '\'' +
                ", corpSoftwareid='" + corpSoftwareid + '\'' +
                ", corpCvn='" + corpCvn + '\'' +
                ", IuprValue='" + IuprValue + '\'' +
                '}';
    }

    @Override
    public String getMsgTopic() {
        return Constants.MQ_TOPIC_NOTIFY;
    }
}
