package org.example;

import org.example.conServer.ServerFunction;
import org.example.enums.SendStatusEnum;
import org.example.function.Login;
import org.example.function.User;
import org.example.vo.LoginVo;
import org.example.vo.PasswordVo;
import org.example.vo.UserVo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user=new User();
        UserVo userVo=new UserVo();
        userVo.setUserName("Nehoraii123");
        userVo=user.getUserByUserName(userVo);
        LoginVo loginVo=new LoginVo();
        loginVo.setUserId(userVo.getId());
        Login login=new Login();
        loginVo=login.getLoginByUser(loginVo);
        System.out.println(loginVo);
        login.updateLogin(loginVo,"12345");
    }
}
