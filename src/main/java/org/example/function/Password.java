package org.example.function;

import org.example.conServer.ServerFunction;
import org.example.enums.ErrorsEnum;
import org.example.enums.SendStatusEnum;
import org.example.vo.PasswordVo;

import java.util.Date;

public class Password {
    private String addPath="http://localhost:8081/Password/save";
    private String messageFromServer;
    private ServerFunction server=new ServerFunction();
    public ErrorsEnum addPassword(String password,long userId){
        PasswordVo passwordVo=new PasswordVo();
        passwordVo.setPass(password);
        passwordVo.setDate(new Date());
        passwordVo.setUserId(userId);
        ErrorsEnum e=server.connect(addPath, SendStatusEnum.POST,password);
        messageFromServer=server.getMassageHead();
        return e;
    }

    public String getMessageFromServer() {
        return messageFromServer;
    }
}
