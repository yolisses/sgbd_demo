package com.example.sgbd_demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepo extends JpaRepository<Music, Long> {
}
