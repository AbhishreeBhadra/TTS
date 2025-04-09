package com.example.tts.controller;

import com.example.tts.service.TTSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TTSController {

    @Autowired
    private TTSService ttsService;

    // Endpoint to fetch available voices
    @GetMapping("/voices")
    public List<String> getVoices() {
        return ttsService.getAvailableVoices();
    }
}


