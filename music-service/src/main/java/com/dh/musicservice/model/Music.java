package com.dh.musicservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//Puedo usar la notacion @Data, pero me trae muchas cosas que capaz no necesito, por esto use getters y setters
@Getter @Setter
@Entity
@Table(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String genre;
    private String artist;
    private String urlStream;
}
