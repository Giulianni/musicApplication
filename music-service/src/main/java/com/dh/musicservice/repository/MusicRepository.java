package com.dh.musicservice.repository;

import com.dh.musicservice.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {

    List<Music> findAllByGenre(String genre);
}
