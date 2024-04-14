package com.ash.entity.socialprofilelinksdetails;

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
public class SocialProfilesLinks
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int socialProfileId;

    private String github;
    private String linkedIn;
    private String twitter;
    private String facebook;

}
