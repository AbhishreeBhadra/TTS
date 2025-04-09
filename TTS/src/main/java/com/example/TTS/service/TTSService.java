package com.example.tts.service;

import marytts.modules.synthesis.Voice;
import marytts.modules.synthesis.MarySynthesizer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TTSService {

    // Fetch the available voices using MaryTTS
    public List<String> getAvailableVoices() {
        List<String> voiceNames = new ArrayList<>();

        // Fetch voices from MaryTTS synthesizer
        List<Voice> voices = MarySynthesizer.getAvailableVoices();

        // Add voice names to the list
        for (Voice voice : voices) {
            voiceNames.add(voice.getName());
        }

        return voiceNames;
    }
}
