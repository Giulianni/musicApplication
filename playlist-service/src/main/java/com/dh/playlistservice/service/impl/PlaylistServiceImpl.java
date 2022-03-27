package com.dh.playlistservice.service.impl;

import com.dh.playlistservice.model.Playlist;
import com.dh.playlistservice.repository.feign.MusicFeignRepository;
import com.dh.playlistservice.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistServiceImpl implements PlaylistService {
    private MusicFeignRepository musicFeignRepository;

    @Autowired
    public PlaylistServiceImpl(MusicFeignRepository musicFeignRepository) {
        this.musicFeignRepository = musicFeignRepository;
    }

    @Override
    public List<Playlist> getSongsByGenre(String genre) {
        return musicFeignRepository.getSongsByGenre(genre);
    }
}
