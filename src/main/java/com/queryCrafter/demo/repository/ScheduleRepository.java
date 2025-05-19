package com.queryCrafter.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.queryCrafter.demo.model.ScheduleEntity;

public interface RepositoryHCM extends JpaRepository <ScheduleEntity, Long> {

    @Query("SELECT s FROM schedule s WHERE active = 1 and customer_id = :customerId")
    List<ScheduleEntity> findSchedulesByCustomer(@Param("customer_id") Long customerId);
    
} 
