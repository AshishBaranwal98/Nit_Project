package com.ash.entity.educationdetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class GraduationDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int graduationId;

    private String collegeName;
    private String collegeAddress;
    private double percentage;
    private String instituteId;
    private String universityName;
    private String degreeName;
    private String stream;
    private Date startDate;
    private Date endDate;
}
