package org.example.back_end.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.back_end.dto.JobDTO;
import org.example.back_end.repository.JobRepository;
import org.example.back_end.service.JobService;
import org.example.back_end.service.impl.JobServiceImpl;
import org.example.back_end.util.APIResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/job")
@RestController
@RequiredArgsConstructor
@CrossOrigin
public class JobController {
    //constructor injection
    private final JobService jobService;

    //bean validation
    @PostMapping("create")
    public ResponseEntity<APIResponse> createJob(@Valid @RequestBody JobDTO jobDTO){
        jobService.saveJob(jobDTO);
        return new ResponseEntity(new APIResponse(200,"Job Created Successfully",null), HttpStatus.CREATED);
    }
    @PutMapping("edit")
    public ResponseEntity<APIResponse> updateJob(@Valid @RequestBody JobDTO jobDTO){
        jobService.updateJob(jobDTO);
        return new ResponseEntity(new APIResponse(200,"Job Updated Successfully",null), HttpStatus.OK);
    }
    @GetMapping("alljobs")
    public ResponseEntity<APIResponse> getAllJobs(){
        List<JobDTO> jobDTOS=jobService.getAllJobs();
        return new ResponseEntity(new APIResponse(200, "Success", jobDTOS),HttpStatus.OK);
    }
    @PatchMapping("status/{id}")
    public ResponseEntity<APIResponse> changeStatus(@PathVariable("id") String id){
        jobService.changeJobStatus(id);
        return new ResponseEntity(new APIResponse(200,"Job Status Changed Successfully",null), HttpStatus.OK);
    }
    @GetMapping("search/{keyword}")
    public ResponseEntity<APIResponse> searchJob(@PathVariable("keyword") String keyword){
        jobService.getAllJobsByKeyword(keyword);
        return new ResponseEntity(new APIResponse(200,"Job Found Successfully",null), HttpStatus.OK);
    }
}
