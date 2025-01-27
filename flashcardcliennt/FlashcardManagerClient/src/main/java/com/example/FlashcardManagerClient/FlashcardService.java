package com.example.FlashcardManagerClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;

@Service
public class FlashcardService {

    @Autowired
    private RestTemplate restTemplate;

    public String getFlashcardById(String cardId) {
        String url = "http://flashcardfuns-service/getByFlashCardId?cardId=" + cardId;
        return restTemplate.getForObject(url, String.class);
    }
}
