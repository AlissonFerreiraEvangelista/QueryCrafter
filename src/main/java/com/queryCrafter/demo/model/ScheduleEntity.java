package com.queryCrafter.demo.model;

import org.hibernate.annotations.Immutable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Immutable
@Data
@Table(name = "schedule")
public class ScheduleEntity {

    @Id
    Long id;

    Long customerId;

    Long scheduleTypeId;
    String externalId;
    boolean active;
    String name;
    boolean ignoreInterval;
    boolean ignoreHolidays;
    boolean premarkedInterval;
    boolean ignoreValidation;
    Long scheduleGroupId;
    Long scheduleTurnId;
    Long holidayShiftId;
    String fullDescription;
    Integer monthlyWorkload;
    Integer weeklyWorkload;
    Integer dailyWorkload;
    boolean deductWeeklyDayoffPerDay;
    Integer breakPaid;
    boolean holidayTimeTracking;
    boolean accountWorkloadDay;
    boolean workedBreakOnDoubleJourney;
    Integer workedBreakOnDoubleJourneyStartingMinutes;
    boolean differentiateToleranceMarkings;
    Integer checkinTolerance;
    Integer checkoutTolerance;
    boolean ignorePremarkedInterval;
}
