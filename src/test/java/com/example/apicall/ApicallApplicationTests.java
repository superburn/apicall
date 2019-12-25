package com.example.apicall;

import com.example.apicall.bos.object.BosObjectApi;
import com.example.apicall.util.BosClientUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApicallApplicationTests {

    @Autowired
	private BosObjectApi bosObjectApi;

	@Test
	public void contextLoads() {

	}

	@Test
	public void testBosObject(){
		bosObjectApi.listObjects(BosClientUtil.getClient(), "shibo-test");
//		bosObjectApi.fetchObject(BosClientUtil.getClient(),"shibo-test","m.mp4",
//					"http://vplay.douguo.net/XMTUwNjkzMDgwMA==__1286x720.mp4","async");
		}

}
