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
public class PermanentAddress
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pAddressId;
    private String houseNumber;
    private String city;
    private String country;
    private String pinCode;
}
