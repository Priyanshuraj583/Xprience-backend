package com.xprience.xprience.APIs.user.Services;


import com.xprience.xprience.APIs.user.Model.UserAddRequestModel;
import com.xprience.xprience.APIs.user.Model.UserModel;
import com.xprience.xprience.APIs.user.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;
    public String registerUser(UserAddRequestModel user) {
        if(userRepository.countByEmail(user.getEmail())>0){
            return "Email already in use";
        }else{
            UserModel userModel = new UserModel();
            userModel.setName(user.getName());
            userModel.setAge(user.getAge());
            userModel.setEmail(user.getEmail());
            userModel.setGender(user.getGender());
            userModel.setCountry(user.getCountry());
            userModel.setPhoneNumber(user.getPhoneNumber());
            userRepository.save(userModel);
            return "Registered";
        }
    }
}
