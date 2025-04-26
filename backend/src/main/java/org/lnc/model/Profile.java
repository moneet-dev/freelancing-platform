package org.lnc.model;

import jakarta.persistence.*;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bio;
    private String skills;
    private String portfolioUrl;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}

