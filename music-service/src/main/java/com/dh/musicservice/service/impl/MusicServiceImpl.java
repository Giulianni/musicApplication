package com.dh.musicservice.service.impl;

import com.dh.musicservice.model.Music;
import com.dh.musicservice.repository.MusicRepository;
import com.dh.musicservice.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {
    private MusicRepository musicRepository;

    @Autowired
    public MusicServiceImpl(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @Override
    public List<Music> getSongsByGenre(String genre) {
        return musicRepository.findAllByGenre(genre);
    }
}
