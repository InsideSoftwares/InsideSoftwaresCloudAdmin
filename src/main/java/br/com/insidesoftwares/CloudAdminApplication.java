package br.com.insidesoftwares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAdminApplication.class, args);
    }


}
