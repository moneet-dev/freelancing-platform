package org.lnc.controllers;

import org.lnc.model.Job;
import org.lnc.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class JobController {
    @Autowired
    private JobService jobService;

    @PostMapping("/post-job")
    public ResponseEntity<?> postJob(@RequestBody Job job) {
        return ResponseEntity.ok(jobService.save(job));
    }

    @GetMapping("/my-jobs/{clientId}")
    public List<Job> getClientJobs(@PathVariable Long clientId) {
        return jobService.getJobsByClientId(clientId);
    }
}