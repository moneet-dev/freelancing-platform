package org.lnc.controllers;

import org.lnc.model.Application;
import org.lnc.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/freelancer")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/apply")
    public ResponseEntity<?> apply(@RequestBody Application app) {
        return ResponseEntity.ok(applicationService.applyToJob(app));
    }

    @GetMapping("/applications/{freelancerId}")
    public List<Application> getApplications(@PathVariable Long freelancerId) {
        return applicationService.getByFreelancerId(freelancerId);
    }
}
