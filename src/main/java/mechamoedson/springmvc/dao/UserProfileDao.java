package mechamoedson.springmvc.dao;

import java.util.List;

import mechamoedson.springmvc.model.UserProfile;
 
 
public interface UserProfileDao {
 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}