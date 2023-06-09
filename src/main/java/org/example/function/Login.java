package org.example.function;

import com.google.gson.Gson;
import org.example.conServer.ServerFunction;
import org.example.enums.ErrorsEnum;
import org.example.enums.SendStatusEnum;
import org.example.vo.LoginVo;

import java.util.Date;

public class Login {
    private String addPath="http://localhost:8081/Login/save";
    private String updatePath="http://localhost:8081/Login/update";
    private String getLoginByUserNamePath="http://localhost:8081/Login/getLoginByUserName";
    private ServerFunction server=new ServerFunction();
    private String messageFromServer;
    public ErrorsEnum addLogin(long userId,String password){
        LoginVo loginVo=new LoginVo();
        loginVo.setDate(new Date());
        loginVo.setUserId(userId);
        loginVo.setPass(password);
        ErrorsEnum e=server.connect(addPath, SendStatusEnum.POST,loginVo);
        messageFromServer=server.getMassageHead();
        return e;
    }
    public ErrorsEnum updateLogin(LoginVo loginVo,String secretKey){
        loginVo.setSecretCode(secretKey);
        ErrorsEnum e=server.connect(updatePath,SendStatusEnum.PUT,loginVo);
        messageFromServer=server.getMassageHead();
        return e;
    }
    public LoginVo getLoginByUser(LoginVo user){
        server.connect(getLoginByUserNamePath,SendStatusEnum.POST,user);
        Gson gson=new Gson();
        LoginVo loginVo=new LoginVo();
        String json=server.getMassageHead();
        messageFromServer=server.getMassageHead();
        loginVo=gson.fromJson(json,loginVo.getClass());
        return loginVo;
    }

    public String getMessageFromServer() {
        return messageFromServer;
    }
}
