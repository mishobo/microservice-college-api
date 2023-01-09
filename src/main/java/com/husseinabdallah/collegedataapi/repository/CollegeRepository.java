package com.husseinabdallah.collegedataapi.repository;

import com.husseinabdallah.collegedataapi.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College, Integer> {
}
