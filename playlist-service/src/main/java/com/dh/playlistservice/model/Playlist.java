package com.dh.playlistservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Playlist {

        private Integer id;
        private String name;
        private String genre;
        private String artist;
        private String urlStream;




}

