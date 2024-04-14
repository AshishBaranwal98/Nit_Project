package com.ash.entity.basicdetails;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressid;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "raID", referencedColumnName = "rAddressId")
    ResidentialAddress residentialAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paID", referencedColumnName = "pAddressId")
    PermanentAddress permanentAddress;
}
