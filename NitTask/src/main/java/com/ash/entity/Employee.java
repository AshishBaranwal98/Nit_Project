package com.ash.entity;

import com.ash.entity.basicdetails.BasicDetails;
import com.ash.entity.educationdetails.EducationDetails;
import com.ash.entity.languagedetails.Languages;
import com.ash.entity.preferencedetails.Preference;
import com.ash.entity.salarydetails.Salary;
import com.ash.entity.skillsdetails.Skills;
import com.ash.entity.socialprofilelinksdetails.SocialProfilesLinks;
import com.ash.entity.whereyougotthejob.WhereGotJob;
import com.ash.entity.workexperiencedetails.WorkExperience;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int empId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "basicID", referencedColumnName = "bdId")
    public BasicDetails basicDetails;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "eduID", referencedColumnName = "educationDetailsid")
    public EducationDetails educationDetails;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "preID", referencedColumnName = "preferenceId")
    public Preference preference;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "salID", referencedColumnName = "salaryId")
    public Salary salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "weID", referencedColumnName = "workexpId")
    public WorkExperience workExperience;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wgjID", referencedColumnName = "whereGotJobid")
    public WhereGotJob whereGotJob;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sID", referencedColumnName = "skillsId")
    public Skills skills;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "lanID")
    public List<Languages> languages=new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "splID", referencedColumnName = "socialProfileId")
    public SocialProfilesLinks socialProfilesLinks;
    //jdjd

}