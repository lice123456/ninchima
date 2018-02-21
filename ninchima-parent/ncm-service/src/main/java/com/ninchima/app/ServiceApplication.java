package com.ninchima.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ninchima.app")
public class ServiceApplication {
	public static void main(String[] args) {  
        SpringApplication.run(ServiceApplication.class, args);  
        try {  
            System.in.read();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}
