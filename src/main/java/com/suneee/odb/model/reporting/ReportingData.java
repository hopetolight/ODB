package com.suneee.odb.model.reporting;

import lombok.Data;

import java.util.List;

/**
 * 写入数据实体类
 * @ClassName: ReportingData
 * @Author: ChenBo
 * @DateTime: 2018/12/20:14:46
 */
@Data
public class ReportingData extends MessageObject {

    /** 写入数据消息体 */
   private List<ReportingDataBody> body;





}
