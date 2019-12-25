package com.example.apicall.util;



import org.apache.directory.api.util.Hex;


import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.security.MessageDigest;


public class SecretUtil {
        public static String sha256Hex(String stringToSign, String signingKey) {
            try {
                Mac mac = Mac.getInstance("HmacSHA256");
                mac.init(new SecretKeySpec(signingKey.getBytes(Charset.forName("UTF-8")), "HmacSHA256"));
                return new String(Hex.encodeHex(mac.doFinal(stringToSign.getBytes(Charset.forName("UTF-8")))));
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }

        public static String md5(String str)  throws Exception {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update((str).getBytes("UTF-8"));
            byte b[] = md5.digest();

            int i;
            StringBuffer buf = new StringBuffer("");

            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));

            }
            return buf.toString();
        }

    public static void main(String[] args) {
        //推流token计算
        //合法推流地址：
        //rtmp://<push.your-domain.com>/<your-app>/<your-stream>?token=计算出来的token值&expire=2017-08-15T01:00:00Z
        System.out.println(sha256Hex("rtmp://livebdpush.chinaylzl.com/business/15560_1;2037-08-15T01:00:00Z","xhdrohzds1vawaq4ekl2jcgnntxiwnrt"));
        //播放认证secret计算
        //播放地址：
        //http://{playdomain}/{app}/{stream}.flv?timestamp=149055612&secret=3b927f3f31dd31613a537fad7a640a76
        //        try {
//            System.out.println(md5("xhdrohzds1vawaq4ekl2jcgnntxiwnrt/livebdplay.chinaylzl.com/business/15560_12130046711"));
//        }catch(Exception e){
//
//        }
    }
}
