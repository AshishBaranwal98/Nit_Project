package com.ash.entity.workexperiencedetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PersonalProject
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personalprojectId;

    private String projectName;
    private String companyNameOrCollegeName;
    private String projectUrl;
    private String projectDescription;
    private String usedSkills;
    private Date projectDurationStartDate;
    private Date projectDurationEndDate;
}
