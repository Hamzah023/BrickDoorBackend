package com.brickdoor.service;

import com.brickdoor.model.Community;
import java.util.List;

public interface CommunityService {
    List<Community> getAllCommunities();
    Community createCommunity(Community community);

}
