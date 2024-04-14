package com.ash.entity.preferencedetails;

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
public class JobPost
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jobPostId;

    private String normalJobPost;
    private boolean featuredJobPost;
    private boolean overseasJobPost;
}
