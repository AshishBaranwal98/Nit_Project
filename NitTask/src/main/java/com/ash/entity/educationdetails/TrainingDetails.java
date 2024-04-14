package com.ash.entity.educationdetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TrainingDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trainingId;
    private String trainingActivities;
    private Date startDate;
    private Date endDate;
    private List<String> skills;
    private String mentorship;
}
