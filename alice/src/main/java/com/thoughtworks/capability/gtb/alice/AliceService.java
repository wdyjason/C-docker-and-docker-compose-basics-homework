package com.thoughtworks.capability.gtb.alice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AliceService {

    @Value("${base.url}")
    private String baseHost;

    public String getHello() {
        System.out.println(baseHost);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(baseHost, String.class);
        return response.getBody();
    }
}
