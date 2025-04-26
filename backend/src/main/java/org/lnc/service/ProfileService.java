package org.lnc.service;

import org.lnc.model.Profile;
import org.lnc.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Optional<Profile> getProfileByUserId(Long userId) {
        return profileRepository.findByUserId(userId);
    }

    public Profile updateProfile(Profile profile) {
        return profileRepository.save(profile);
    }
}
