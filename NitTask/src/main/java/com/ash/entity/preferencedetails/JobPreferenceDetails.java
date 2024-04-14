package com.ash.entity.preferencedetails;

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
public class JobPreferenceDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jpdId;

    private String jobTitle;
    private Date applicationDate;
    private boolean coverLetter;
    private boolean applicationStatus;
}
