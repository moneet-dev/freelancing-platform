package org.lnc.service;

import org.lnc.model.Application;
import org.lnc.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    public List<Application> getApplicationsByJobId(Long jobId) {
        return applicationRepository.findByJobId(jobId);
    }

    public List<Application> getApplicationsByFreelancerId(Long freelancerId) {
        return applicationRepository.findByFreelancerId(freelancerId);
    }

    public Application applyToJob(Application application) {
        return applicationRepository.save(application);
    }

    // Get all applications submitted by a freelancer
    public List<Application> getByFreelancerId(Long freelancerId) {
        return applicationRepository.findByFreelancerId(freelancerId);
    }
}
