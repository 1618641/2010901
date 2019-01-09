package org.java.maguo.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    //EEEEEEEEEEEEEEEEEE
    //33333333333333333
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
