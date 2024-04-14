package com.ash.entity.whereyougotthejob;

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
public class WhereGotJob
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int whereGotJobid;

    private boolean receivedEmail;
    private boolean fromGoogle;
    private boolean facebookAds;
    private boolean youTubeAds;
    private boolean linkedLn;
    private boolean quora;
    private boolean jobPortal;
    private String applicationAllowedFeatured;

}
