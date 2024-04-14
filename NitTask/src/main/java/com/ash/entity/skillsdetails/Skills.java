package com.ash.entity.skillsdetails;

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
public class Skills
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int skillsId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "tsID")
    List<TechnicalSkills> TechnicalSkills=new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ssID")
    List<SoftSkills> softSkills=new ArrayList<>();
}
