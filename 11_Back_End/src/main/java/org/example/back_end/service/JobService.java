package org.example.back_end.service;

import org.example.back_end.dto.JobDTO;

public interface JobService {
    public void saveJob(JobDTO jobDTO);
    public void updateJob(JobDTO jobDTO);
}
