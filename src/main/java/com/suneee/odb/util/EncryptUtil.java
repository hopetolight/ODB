package com.suneee.odb.util;

import org.apache.commons.lang3.StringUtils;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * 加密算法工具类
 * @ClassName: EncryptUtil
 * @Author: ChenBo
 * @DateTime: 2018/12/21:10:56
 */
public class EncryptUtil {

    /**
     * AES加密算法
     * @Author:ChenBo
     * @DateTime 2018/12/21:10:57
     */
    public static String aesEncrypt (String json, String key) throws Exception {
        if (json == null || key == null) return null;
        Cipher cipher = Cipher.getInstance ("AES/ECB/PKCS5Padding");
        cipher.init (Cipher.ENCRYPT_MODE, new
                SecretKeySpec (key.getBytes ("utf-8"), "AES"));
        byte[] bytes = cipher.doFinal (json.getBytes ("utf-8"));
        return new BASE64Encoder ().encode (bytes);
    }


    /**
     * 冗余校验算法
     * @Author:ChenBo
     * @DateTime 2018/12/21:11:10
     */
    public static String checkCRC (String source) {
        byte[] byteArray = null;
        try {
            byteArray = source.getBytes ("ISO-8859-1");
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return checkCRC (byteArray);
    }


    public static String checkCRC (byte[] source) {
        int crc_reg = 0XFFFF;
        for (int i = 0; i < source.length; i++) {
            crc_reg = crc_reg >> 8 ^ source[i];
            for (int j = 0; j < 8; j++) {
                int check = crc_reg & 0x1;
                crc_reg >>= 1;
                if (check == 1) {
                    crc_reg ^= 0xA001;
                }
            }
        }
        return IntegerToHexString (crc_reg).toUpperCase ();
    }


    private static String IntegerToHexString (int value) {
        if (value > 65535) {
            return "FFFF";
        }
        String asStr = Integer.toHexString ((0xFFFF & value)).toUpperCase ();
        int len = asStr.length ();
        if (len < 4) {
            asStr = StringUtils.leftPad (asStr,4,"0");
        }
        return asStr;
    }
}
