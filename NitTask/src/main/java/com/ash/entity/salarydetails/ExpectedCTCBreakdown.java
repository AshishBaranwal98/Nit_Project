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
public class ExpectedCTCBreakdown
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int expectedctcid;

    private double inHandFixed;
}
