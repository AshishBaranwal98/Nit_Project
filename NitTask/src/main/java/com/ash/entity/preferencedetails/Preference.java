package com.ash.entity.preferencedetails;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Preference
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int preferenceId;

    private String preferredCountry;
    private String preferredCity;
    private String preferredCity2;

    private List<String> preferredWorkModule;

    private List<String> preferredShiftTiming;

    private List<String> employmentType;

    private String desiredPayRate;
    private String contractPeriod;
    private String noticePeriod;
    private Date desiredStartDate;
    private String hoursPerWeek;
    private double payPerHour;
    private double minimumPay;
    private double billingRate;

    private List<String> jobShift;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "jprefID", referencedColumnName = "jpdId")
    JobPreferenceDetails jobPreferenceDetails;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "jpID", referencedColumnName = "jobPostId")
    JobPost jobPost;
}
