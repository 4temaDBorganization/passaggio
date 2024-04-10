package com.passaggio.project.controller;

import com.passaggio.project.models.signup.SignUpDTO;
import com.passaggio.project.models.signup.SignUpService;
import com.passaggio.project.view.signup.SignUp;

import java.util.Map;

public class SignUpController {
    public final SignUp signUp;
    public final SignUpService signUpService;

    public SignUpController(){
        signUp =new SignUp();
        signUpService = new SignUpService();

    }


    public void registerSignUp(Map<String, String> parameter) {

        int userCode = Integer.parseInt(parameter.get("userCode"));
        String userId = parameter.get("userId");
        String userPwd = parameter.get("userPwd");
        String userNickName = parameter.get("userNickName");
        char userGender = parameter.get("userGender").charAt(0);

        SignUpDTO signUpDTO = new SignUpDTO();
        signUpDTO.setSeq(userCode);
        signUpDTO.setId(userId);
        signUpDTO.setPwd(userPwd);
        signUpDTO.setNick(userNickName);
        signUpDTO.setGender(userGender);

        signUpService.registerUser(signUpDTO);
    }
}
