package org.lnc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Job {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String skills;
    private Long clientId;

    // Getters/Setters
}
