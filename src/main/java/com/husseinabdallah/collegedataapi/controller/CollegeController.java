package com.husseinabdallah.collegedataapi.controller;

import com.husseinabdallah.collegedataapi.model.College;
import com.husseinabdallah.collegedataapi.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/college")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @RequestMapping(value = "addCollege", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public College addCollege(@RequestBody College college){
        return collegeService.addCollege(college);
    }

    @GetMapping("/{collegeId}")
    public Optional<College> getCollegeDetails(@PathVariable("collegeId") int collegeId){
        return collegeService.getCollegeById(collegeId);
    }

}
