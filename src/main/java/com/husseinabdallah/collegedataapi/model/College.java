package com.husseinabdallah.collegedataapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "college")
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int collegeId;

    @Column(name = "college_name")
    private String collegeName;
    private String address;

}
