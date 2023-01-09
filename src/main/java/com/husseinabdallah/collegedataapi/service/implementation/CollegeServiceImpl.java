package com.husseinabdallah.collegedataapi.service.implementation;

import com.husseinabdallah.collegedataapi.model.College;
import com.husseinabdallah.collegedataapi.repository.CollegeRepository;
import com.husseinabdallah.collegedataapi.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private CollegeRepository collegeRepo;

    @Override
    public College addCollege(College college) {
        return collegeRepo.save(college);
    }

    @Override
    public Optional<College> getCollegeById(int collegeId) {
        return collegeRepo.findById(collegeId);
    }
}
