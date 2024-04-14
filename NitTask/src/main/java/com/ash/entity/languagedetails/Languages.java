package com.ash.entity.languagedetails;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Languages
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int languageId;


    private String spokenLanguage;
    private String spokenLanguageProficiency;

}
