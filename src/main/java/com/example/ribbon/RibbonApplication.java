package com.example.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class RibbonApplication {

    @LoadBalanced
    public void test() throws InterruptedException {

        Thread.sleep(1000);

        TimeUnit.SECONDS.sleep(1);


        return;
    }

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

}
