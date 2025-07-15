package org.example.back_end.controller;

import lombok.RequiredArgsConstructor;
import org.example.back_end.dto.JobDTO;
import org.example.back_end.service.JobService;
import org.example.back_end.service.impl.JobServiceImpl;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/job")
@RestController
@RequiredArgsConstructor
public class JobController {

    //constructor injection
    private final JobService jobService;

    @PostMapping("create")
    public void createJob(@RequestBody JobDTO jobDTO){
        jobService.saveJob(jobDTO);
    }
    @PutMapping("edit")
    public void updateJob(@RequestBody JobDTO jobDTO){
        jobService.updateJob(jobDTO);
    }
}
