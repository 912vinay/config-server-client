package com.vinay.springconfigclient;

import com.vinay.springconfigclient.config.PropConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableEurekaClient
public class SpringConfigClientApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringConfigClientApplication.class, args);
        PropConfig propConfig = (PropConfig) run.getBean("propConfig");
        System.out.println("msg got successfully "+propConfig.getMsg());
        System.out.println("name got successfully "+propConfig.getName());
        System.out.println("email got successfully "+propConfig.getEmail());
    }

}
