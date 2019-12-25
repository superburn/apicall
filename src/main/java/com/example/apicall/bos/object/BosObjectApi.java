package com.example.apicall.bos.object;

import com.baidubce.services.bos.BosClient;
import com.baidubce.services.bos.model.BosObjectSummary;
import com.baidubce.services.bos.model.FetchObjectResponse;
import com.baidubce.services.bos.model.ListObjectsResponse;
import com.example.apicall.util.BosClientUtil;
import org.springframework.stereotype.Component;

@Component
public class BosObjectApi {
    public static void listObjects(BosClient client, String bucketName) {

        // 获取指定Bucket下的所有Object信息
        ListObjectsResponse listing = client.listObjects(bucketName);

        // 遍历所有Object
        for (BosObjectSummary objectSummary : listing.getContents()) {
            System.out.println("ObjectKey: " + objectSummary.getKey());
        }

    }

    public static void fetchObject(BosClient client, String bucketName, String objectKey, String sourceUrl, String mode){
        FetchObjectResponse fetching = client.fetchObject(bucketName,objectKey,sourceUrl,mode);
        System.out.print("code:"+fetching.getCode()+"  jobId:"+fetching.getJobId());
    }

}
