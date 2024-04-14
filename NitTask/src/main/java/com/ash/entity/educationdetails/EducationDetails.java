package com.ash.entity.educationdetails;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EducationDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int educationDetailsid;

    private String highestEducationLevel;
    private String educationStream;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tenthsdID", referencedColumnName = "tenthId")
    private TenthSchoolDetails tenthSchoolDetails;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "twelfthsdID", referencedColumnName = "twelfthId")
    private TwelfthSchoolDetails twelfthSchoolDetails;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gdID", referencedColumnName = "graduationId")
    private GraduationDetails graduationDetails;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ccID", referencedColumnName = "courseId")
    private CourseCertification courseCertification;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tdID", referencedColumnName = "trainingId")
    private TrainingDetails  trainingDetails;
}
