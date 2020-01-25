package com.eatza.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

//import com.eatza.order.config.JwtFilter;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class OrderingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderingserviceApplication.class, args);
		System.out.println("OrderingserviceApplication started");
	}
	
	  /*@Bean public FilterRegistrationBean jwtFilterBean() { final
	  FilterRegistrationBean registrationBean = new FilterRegistrationBean();
	  registrationBean.setFilter(new JwtFilter());
	  registrationBean.addUrlPatterns("/order/*");
	  
	  return registrationBean; }*/
	 

}
