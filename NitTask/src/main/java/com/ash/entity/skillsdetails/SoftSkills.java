package com.ash.entity.skillsdetails;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SoftSkills
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int softSkillsId;

    private String skills;
    private String proficiency;
}
