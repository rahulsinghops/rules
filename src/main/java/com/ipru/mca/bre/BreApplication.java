package com.ipru.mca.bre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import com.ipru.mca.bre.services.DataPopulateRepoImpl;
import com.ipru.mca.bre.services.RestService;

@SpringBootApplication
@EnableEurekaClient
public class BreApplication implements CommandLineRunner {

	@Autowired
	DataPopulateRepoImpl repoImpl;
	
	//Rest template test
	@Autowired
	RestService service;

	//@Value("${bre.externalflag:true}")
	@Value("${author:pritha}")
	private String flag;
	public static void main(String[] args) {
		SpringApplication.run(BreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("name from prop:"+flag);
		//System.out.println("rest output "+service.getservice());
		repoImpl.populate(null);
	}

}
