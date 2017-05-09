package org.spring.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudService1Application {
    
    @Autowired
    private RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudService1Application.class, args);
	}
    
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    
    @RequestMapping("/hello")
    public String hello() {
        return restTemplate.getForObject("http://EXPRESS-APP/hello", String.class);
    }
    
}
