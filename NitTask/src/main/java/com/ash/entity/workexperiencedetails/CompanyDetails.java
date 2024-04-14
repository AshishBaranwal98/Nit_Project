package com.ash.entity.workexperiencedetails;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CompanyDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int companyDetailsid;

    private String companyName;
    private String companyNumber;
    private String companyEmail;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "jlID", referencedColumnName = "joblocationId")
    JobLocation jobLocation;

    private String designation;
    private Date joiningDate;
    private Date releasedDate;
}
