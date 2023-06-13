package org.example;
import org.example.function.Front;
import org.example.function.Song;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Front front=(new Front());
        front.runner();
    }
//        User user=new User();
//        UserVo userVo=new UserVo();
//        userVo.setUserName("Nehoraii123");
//        userVo=user.getUserByUserName(userVo);
//        LoginVo loginVo=new LoginVo();
//        loginVo.setUserId(userVo.getId());
//        Login login=new Login();
//        loginVo=login.getLoginByUser(loginVo);
//        System.out.println(loginVo);
//        login.updateLogin(loginVo,"12345");
       /* byte[] audioData = new byte[0];
        try {

        String filePath = "C:\\Users\\user\\Desktop\\EyalGolan-ZeiElAhalon.wav";
        audioData = Files.readAllBytes(Path.of(filePath));
        }catch (Exception e){
            System.out.println(e);
        }
        Song song=new Song();
        String name="ab";
        String zaner="מזרחי";

       // song.addSong(1,name,zaner,1,new Date(),audioData);
        String abc=song.getSongsByName(name);
        System.out.println(abc);
        System.out.println(song.getMessageFromServer());
    }

        */
}
