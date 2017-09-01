package com.ggk.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * The Main Spring Boot Application class which does the following
 * 
 * Act as a Eureka client; this behavior is provided by the
 * EnableEurekaClient annotation. The Eureka server URL is provided by
 * the external configuration provided by the config server.
 * Act as Zuul reverse proxy; this behavior is provided by the
 * EnableZuulProxy annotation. Annotating the application with
 * EnableZuulProxy forwards local calls to the appropriate service. By
 * convention, a service with the Eureka ID "path", will receive requests from
 * the proxy located at /path (with the prefix stripped).
 * 
 * @author
 */


@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@EnableSwagger2
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
}
