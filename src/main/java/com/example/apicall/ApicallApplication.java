package com.example.apicall;

import com.example.apicall.bos.object.BosObjectApi;
import com.example.apicall.util.BosClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApicallApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApicallApplication.class, args);
	}

}
