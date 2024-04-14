package com.ash.entity.salarydetails;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Salary
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salaryId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cctcbID", referencedColumnName = "ccbId")
    CurrentCTCBreakdown currentCTCBreakdown;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ectcbID", referencedColumnName = "expectedctcid")
    ExpectedCTCBreakdown expectedCTCBreakdown;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hourrateID", referencedColumnName = "hrId")
    HourlyRate hourlyRate;

}
