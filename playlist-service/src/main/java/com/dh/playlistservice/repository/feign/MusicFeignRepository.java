package com.dh.playlistservice.repository.feign;

import com.dh.playlistservice.model.Playlist;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "music-service")
public interface MusicFeignRepository {
    @GetMapping("/music/{genre}")
    List<Playlist> getSongsByGenre(@PathVariable String genre);

}
