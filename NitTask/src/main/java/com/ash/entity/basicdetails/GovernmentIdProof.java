package com.ash.entity.basicdetails;

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
public class GovernmentIdProof
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int govtIdProofid;
    private String idProofType;
    private String governmentIdentityImageUrl;
    private String identityNo;
}
