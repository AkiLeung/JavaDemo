package com.demo.encryption;

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.Key;

/**
 * @author Joseph.L
 * @date 2019-04-20
 * @description DES对称加密
 */
public class EncryptDes {

    private static String info = "测试加密信息 Test 123 ！@#￥%……&*（）——+";

    public static void main(String[] args) {
        jdkDES();
    }

    public static void jdkDES() {
        try {
            //生成KEY
            KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
            keyGenerator.init(56);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] bytesKey = secretKey.getEncoded();

            //KEY转换
            DESKeySpec deSedeKeySpec = new DESKeySpec(bytesKey);
            SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
            Key convertSecretKey = factory.generateSecret(deSedeKeySpec);

            //加密
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, convertSecretKey);
            byte[] result = cipher.doFinal(info.getBytes());
            System.out.println("jdk des encrypt:" + HexBin.encode(result));

            //解密.
            cipher.init(Cipher.DECRYPT_MODE, convertSecretKey);
            result = cipher.doFinal(result);
            System.out.println("jdk des decrypt:" + new String(result));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
