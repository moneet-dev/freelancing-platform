package org.lnc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Application {
    @Id
    @GeneratedValue
    private Long id;
    private Long jobId;
    private Long freelancerId;
    private String status;
}
