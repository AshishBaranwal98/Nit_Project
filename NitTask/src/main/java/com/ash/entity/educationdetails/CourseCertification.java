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
public class CourseCertification
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    private String certificationCourse;
    private Date issueDate;
    private String certificateUrl;
}
