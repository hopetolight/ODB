package com.suneee.odb;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @
 * @ClassName: Test
 * @Author: ChenBo
 * @DateTime: 2018/12/21:15:19
 */
public class Test {


    public static void main (String[] args) {
        String yyyyMMddHH24mmss = new SimpleDateFormat ("ddHHmmss").format (new Date ());
        System.out.println (yyyyMMddHH24mmss);
    }
}
