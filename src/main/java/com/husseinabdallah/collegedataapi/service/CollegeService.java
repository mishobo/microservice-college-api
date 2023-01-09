package com.husseinabdallah.collegedataapi.service;

import com.husseinabdallah.collegedataapi.model.College;

import java.util.Optional;

public interface CollegeService {

    public College addCollege(College college);
    public Optional<College> getCollegeById(int collegeId);
}
