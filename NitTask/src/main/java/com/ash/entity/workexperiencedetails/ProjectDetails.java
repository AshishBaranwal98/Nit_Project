package com.ash.entity.workexperiencedetails;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProjectDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectDetailsId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "apID", referencedColumnName = "activeprojectId")
    ActiveProject activeProject;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cpID", referencedColumnName = "closedprojectId")
    ClosedProject closedProject;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ppID", referencedColumnName = "personalprojectId")
    PersonalProject personalProject ;
}
