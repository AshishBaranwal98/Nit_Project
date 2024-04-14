package com.ash.entity.basicdetails;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BasicDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bdId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String profileImageUrl;
    private String email;
    private long mobile;
    private long alternateMobile;
    private long whatsappNo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addID", referencedColumnName = "addressid")
    Address address;

    private String citizenship;
    private String countryOfResidence;
    private String countryOfCitizenship;
    private String dateOfBirth;
    private String placeOfBirth;
    private String gender;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pdID", referencedColumnName = "passportId")
    PassportDetails passportDetails;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gipID", referencedColumnName = "govtIdProofid")
    GovernmentIdProof governmentIDProof;
}
