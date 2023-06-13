package org.example.function;

import org.example.conServer.ServerFunction;
import org.example.enums.ErrorsEnum;
import org.example.enums.SendStatusEnum;
import org.example.vo.SongsVO;

import java.util.Date;

public class Song {
    private String addSongPath="http://localhost:8080/Song/save";
    private String getSongPath="http://localhost:8080/Song/getSongByName";
    private String messageFromServer;
    private ServerFunction server=new ServerFunction();
    public void addSong(long albumId,String nameSong,String zaner,long userId,Date date,byte[] theSong){
        SongsVO song=new SongsVO();
        song.setNameSong(nameSong);
        song.setZaner(zaner);
        song.setUserId(userId);
        song.setDate(date);
        song.setTheSong(theSong);
        ErrorsEnum e;
        System.out.println(song.getTheSong().length);
        e=server.connect(addSongPath, SendStatusEnum.POST,song);
        System.out.println(e);
        messageFromServer=server.getMassageHead();
    }
    public String getSongsByName(String nameSong){
        SongsVO song=new SongsVO();
        song.setNameSong(nameSong);
        song.setZaner("zaner");
        song.setUserId(1);
        song.setDate(new Date());
        song.setNameSong(nameSong);
        ErrorsEnum e;
        e=server.connect(getSongPath, SendStatusEnum.POST,song);
        System.out.println(e);
        messageFromServer=server.getMassageHead();
        return messageFromServer;
    }

    public String getMessageFromServer() {
        return messageFromServer;
    }
}
