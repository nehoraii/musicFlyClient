package org.example.function;

import com.google.gson.Gson;
import org.example.conServer.ServerFunction;
import org.example.enums.ErrorsEnum;
import org.example.enums.SendStatusEnum;
import org.example.vo.UserVo;

import java.util.Date;

public class User {
    private String addPath="http://localhost:8081/User/save";
    private String getPath="http://localhost:8081/User/getUser";
    private String messageFromServer;
    private ServerFunction sever=new ServerFunction();
    public ErrorsEnum addUser(String name , String secName, String userName, String phone, String email, Date birthDay){
        UserVo user=new UserVo();
        user.setName(name);
        user.setUserName(userName);
        user.setPhone(phone);
        user.setEmail(email);
        user.setBirthDay(birthDay);
        user.setSecName(secName);
        ErrorsEnum e=sever.connect(addPath, SendStatusEnum.POST,user);
        messageFromServer=sever.getMassageHead();
        return e;
    }
    public UserVo getUserByUserName(UserVo user){
        sever.connect(getPath,SendStatusEnum.POST,user);
        Gson gson=new Gson();
        String answerServer=sever.getMassageHead();
        user=gson.fromJson(answerServer,UserVo.class);
        return user;
    }

    public String getMessageFromServer() {
        return messageFromServer;
    }
}
