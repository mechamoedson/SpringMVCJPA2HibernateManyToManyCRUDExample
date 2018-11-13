package mechamoedson.springmvc.service;

import java.util.List;

import mechamoedson.springmvc.model.UserProfile;
 
 
public interface UserProfileService {
 
    UserProfile findById(int id);
 
    UserProfile findByType(String type);
     
    List<UserProfile> findAll();
     
}