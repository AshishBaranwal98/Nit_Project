package com.ash.entity.skillsdetails;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TechnicalSkills
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int technicalSkillsId;

    private String skills;
    private String course;
    private String instituteName;
    private String yearOfProfessionalExperience;
    private String usedTools;
    private String proficiency;
    private String deploymentTools;
    private Date startDate;
    private Date endDate;

}
