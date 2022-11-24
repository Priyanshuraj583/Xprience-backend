package com.xprience.xprience.APIs.user.Controller;

import com.xprience.xprience.APIs.user.Model.UserAddRequestModel;
import com.xprience.xprience.APIs.user.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("xprience/api/v1/")
public class UserController {


    @Autowired
    private UserServices userServices;

    @PostMapping("register")
    public String registerUser(@RequestBody UserAddRequestModel user){
        return userServices.registerUser(user);
    }

}
