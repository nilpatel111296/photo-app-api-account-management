package com.photoapp.api.account.photoappapiaccountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhotoAppApiAccountManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppApiAccountManagementApplication.class, args);
    }

}
