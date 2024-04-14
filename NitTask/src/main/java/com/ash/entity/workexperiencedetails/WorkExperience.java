package com.ash.entity.workexperiencedetails;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class WorkExperience
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workexpId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cdID", referencedColumnName = "companyDetailsid")
    CompanyDetails companyDetails;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pdID", referencedColumnName = "projectDetailsId")
    ProjectDetails projectDetails;


    private String totalExperience;
    private String yearsOfRemoteExperience;
    private String professionalOrIndustrialExperience;
    private boolean freelanceExperience;
}
