package com.ash.entity.educationdetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TwelfthSchoolDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int twelfthId;
    private String schoolName;
    private String schoolBoard;
    private String schoolAddress;
    private List<String> subjectsStudied;
    private double twelfththPercentage;
}
