package com.dh.musicservice.service;

import com.dh.musicservice.model.Music;

import java.util.List;

public interface MusicService {

    List<Music> getSongsByGenre(String genre);
}
