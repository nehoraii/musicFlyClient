package org.example.vo;

import lombok.Data;

import java.util.Date;

@Data
public class SongsVO {
    private Long id;
    private String nameSong;
    private long userId;
    private byte[] theSong;
    private String zaner;
    private Date date;
}
