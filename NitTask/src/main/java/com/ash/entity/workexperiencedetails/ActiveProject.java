package com.ash.entity.workexperiencedetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ActiveProject
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int activeprojectId;

    private boolean inHouse;
    private boolean client;
    private String designation ;
    private String skillsUsed;
    private String projectDescription;
    private String projectDurationStartDate;
    private String projectDurationEndDate;
    private String assignmentStatus;
    private String assignedCustomer;
    private String customerFeedback;
}
