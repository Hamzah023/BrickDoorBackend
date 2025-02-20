package com.brickdoor.service;


import com.brickdoor.model.Community;
import com.brickdoor.repository.CommunityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityServiceImplementation implements CommunityService{

    private final CommunityRepository communityRepository; //this connects with the repo

    public CommunityServiceImplementation(CommunityRepository communityRepository) { // this is a dependency injection injecting the community repo into the service class
        this.communityRepository = communityRepository;
    }

    @Override//the override annotation makes it clear that these methods represent the communityService interface
    public List<Community> getAllCommunities(){
        return communityRepository.findAll();
    }

    @Override
    public Community createCommunity(Community community){
        return communityRepository.save(community);
    }

}

