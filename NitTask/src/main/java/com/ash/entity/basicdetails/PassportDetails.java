package com.ash.entity.basicdetails;

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
public class PassportDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int passportId;
    private int passportNo;
    private String visaType;
    private int visaNo;
    private Date renewalDate;
    private boolean applicationAllowedOverseas;
}
