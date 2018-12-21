package com.suneee.odb.model.reporting;

import lombok.Data;

import java.util.List;

/**
 * 鉴权请求数据
 * @ClassName: AuthObjectData
 * @Author: ChenBo
 * @DateTime: 2018/12/19:16:16
 */
@Data
public class AuthObjectData extends MessageObject {

    /** 数据体 */
    private List<AuthObjectBody> body;



}
