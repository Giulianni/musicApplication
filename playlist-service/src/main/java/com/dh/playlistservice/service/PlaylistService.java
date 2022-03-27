package com.dh.playlistservice.service;

import com.dh.playlistservice.model.Playlist;

import java.util.List;

public interface PlaylistService {
    List<Playlist> getSongsByGenre(String genre);
}
