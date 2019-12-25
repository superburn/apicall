package com.example.apicall.bos.bucket;

import com.baidubce.services.bos.BosClient;

public class BosBucketApi {
    public static void setBucketAcl(BosClient client){
        String jsonAcl = "";
        client.setBucketAcl("shibo-test",jsonAcl);
    }
}

