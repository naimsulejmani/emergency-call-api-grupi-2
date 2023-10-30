package com.example.emergencycallapi;

import com.example.emergencycallapi.controllers.ReportCaseController;
import com.example.emergencycallapi.services.ReportCaseService;
import com.example.emergencycallapi.services.impls.ReportCaseServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmergencyCallApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmergencyCallApiApplication.class, args);

    }

}
