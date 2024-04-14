package com.ash.entity.salarydetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CurrentCTCBreakdown
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ccbId;

    private double inHandFixed;
    private double bonus;
}
