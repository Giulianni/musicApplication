package com.dh.musicservice.controller;

import com.dh.musicservice.model.Music;
import com.dh.musicservice.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/music")
public class MusicController {

    private MusicService musicService;

    @Autowired
    public MusicController(MusicService musicService) {
        this.musicService = musicService;
    }


    @GetMapping("/{genre}")
    public List<Music> getSongsByGenre(@PathVariable String genre) {
        return musicService.getSongsByGenre(genre);
    }

}
