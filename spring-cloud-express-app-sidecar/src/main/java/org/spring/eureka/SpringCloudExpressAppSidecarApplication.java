package org.spring.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class SpringCloudExpressAppSidecarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudExpressAppSidecarApplication.class, args);
	}
}
