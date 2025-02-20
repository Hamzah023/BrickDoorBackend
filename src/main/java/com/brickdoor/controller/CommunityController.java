package com.brickdoor.controller;

import com.brickdoor.model.Community;
import com.brickdoor.service.CommunityService;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/community")
public class CommunityController {

    private final CommunityService communityService; //final means once assigned cant be changed

    public CommunityController(@Autowired CommunityService communityService) {
        this.communityService = communityService;
    }

    //get all communities for search
    //the getMapping is to map restapi http get requests into specific methods

    @GetMapping
    public List<Community> getAllCommunities() {
        return communityService.getAllCommunities();
    }

    @PostMapping
    public Community createCommunity(@RequestBody Community community) {
        return communityService.createCommunity(community);
    }

}
