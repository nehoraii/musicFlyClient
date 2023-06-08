package org.example;

import org.example.conServer.ServerFunction;
import org.example.vo.LoginVo;
import org.example.vo.PasswordVo;
import org.example.vo.UserVo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ServerFunction conUser= new ServerFunction();
        UserVo user =new UserVo();
        user.setName("nehoraii");
        user.setUserName("Nehoraii123");
        user.setPhone("0556652485");
        Date date = new Date(2004, 10, 1);
        user.setBirthDay(date);
        user.setEmail("nehoraii555@gmail.com");
        user.setSecName("babaii");
        PasswordVo passwordVo=new PasswordVo();
        passwordVo.setPass("Nehoraii0556");
        passwordVo.setDate(new Date());
        passwordVo.setUserId(1);
        LoginVo loginVo=new LoginVo();
        loginVo.setIp("127.0.0.34");
        loginVo.setPass("Nehoraii05566524855");
        loginVo.setSec(true);
        loginVo.setDate(new Date());
        loginVo.setUserId(1);
        System.out.println(conUser.connect("http://localhost:8081/Login/save","POST",loginVo));
        System.out.println(conUser.getMassageHead());
       /* System.out.println(conUser.connect("http://localhost:8081/Password/save","POST",passwordVo));
        System.out.println(conUser.getMassageHead());
        System.out.println(conUser.connect("http://localhost:8081/Password/save","POST",passwordVo));
        System.out.println(conUser.getMassageHead());

        */

    }
}
