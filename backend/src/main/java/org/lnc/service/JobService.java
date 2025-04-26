package org.lnc.service;

import org.lnc.model.Job;
import org.lnc.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Optional<Job> getJobById(Long id) {
        return jobRepository.findById(id);
    }

    public Job postJob(Job job) {
        return jobRepository.save(job);
    }

    public List<Job> getJobsByClientId(Long clientId) {
        return jobRepository.findByClientId(clientId);
    }

    public void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }
    // Save or post a new job
    public Job save(Job job) {
        return jobRepository.save(job);
    }
}
