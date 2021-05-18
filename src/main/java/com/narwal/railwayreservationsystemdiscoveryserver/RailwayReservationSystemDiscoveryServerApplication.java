package com.narwal.railwayreservationsystemdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RailwayReservationSystemDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RailwayReservationSystemDiscoveryServerApplication.class, args);
    }

}

