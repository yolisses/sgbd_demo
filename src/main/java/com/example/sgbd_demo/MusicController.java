package com.example.sgbd_demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@AllArgsConstructor
public class MusicController {

    MusicRepo musicRepo;

    @GetMapping("/musics")
    public List<Music> all() {
        return musicRepo.findAll();
    }

    @GetMapping("/mock")
    public void mock() {
        List<Music> musics = Arrays.asList(
                new Music(0, "Viva la Vida"),
                new Music(1, "I really want to stay at your house")
        );
        musicRepo.saveAll(musics);
    }
}
