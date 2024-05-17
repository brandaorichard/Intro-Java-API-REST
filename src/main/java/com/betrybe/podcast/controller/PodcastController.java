package com.betrybe.podcast.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/podcasts")
public class PodcastController {

    @GetMapping
    public String getRoot() {
        return "Yay podcasts!";
    }

    @GetMapping("/{id}")
    public String getPodcast(@PathVariable Long id) {
        return "Podcast id: %d".formatted(id);
    }

    @GetMapping("/search")
    public String searchPodcastByTitle(@RequestParam String title) {
        return "Podcast title: %s".formatted(title);
    }

}
