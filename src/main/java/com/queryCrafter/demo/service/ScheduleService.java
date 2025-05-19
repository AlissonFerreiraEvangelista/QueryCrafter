package com.queryCrafter.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.queryCrafter.demo.model.ScheduleEntity;
import com.queryCrafter.demo.repository.RepositoryHCM;

@Service
public class ServiceHCM {

    @Autowired
    RepositoryHCM eRepositoryHCM;

    public List<ScheduleEntity> getCustomerId(Long customerId) {
        
        List<ScheduleEntity> list =  eRepositoryHCM.findSchedulesByCustomer(customerId);
        if (list.isEmpty()) {
          throw new UnsupportedOperationException("Unimplemented method 'getCustomerId'");  
        }
        return list;
        
    }

    
}
