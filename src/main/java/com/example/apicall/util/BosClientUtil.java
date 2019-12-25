package com.example.apicall.util;

import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.services.bos.BosClient;
import com.baidubce.services.bos.BosClientConfiguration;

public class BosClientUtil {
    public static BosClient getClient() {
        //String ACCESS_KEY_ID = LoadPropertyUtil.getProperty("baidu.ak");                // 用户的Access Key ID
        //String SECRET_ACCESS_KEY = LoadPropertyUtil.getProperty("baidu.sk");           // 用户的Secret Access Key

        // 初始化一个BosClient
        BosClientConfiguration config = new BosClientConfiguration();
        config.withCredentials(new DefaultBceCredentials("93008bc796094d7c8a016c1e0d1c3827","0190b3d2df9e4598b3dd88fb0df2fb88"));
        BosClient client = new BosClient(config);
        return client;
    }
}
