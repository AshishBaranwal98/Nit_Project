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
public class JobLocation
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int joblocationId;

    private String companyAddress;
    private String companyZipCode;
    private String workModule;
}
