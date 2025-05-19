package com.queryCrafter.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.queryCrafter.demo.model.ScheduleEntity;
import com.queryCrafter.demo.service.ServiceHCM;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/hcm")
public class ControllerHCM {

    @Autowired
    ServiceHCM serviceHCM;


    @GetMapping("/schudule/{customerId}")
    public ResponseEntity<List<ScheduleEntity>> getSchEntity(@PathVariable(value = "customerId") Long customerId) {

        var schedule = serviceHCM.getCustomerId(customerId);
        if (schedule.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
        }
        
        return ResponseEntity.status(HttpStatus.OK).body(schedule);
 
    }
    

    
}
