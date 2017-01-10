package com.alexeyk.sample.http;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kiselev on 09.01.2017.
 */
public class HttpSender {

    public static void main(String[] args) {
        RestTemplate template = new RestTemplate();
        String url = String.format("%s/%s", "http://www.newsru.com", "index.html");
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        headers.add(HttpHeaders.ACCEPT, "*/*");
        HttpEntity<String> requestEntity = new HttpEntity<>("body", headers);

        ResponseEntity<String> responseEntity = template.exchange(url, HttpMethod.GET, requestEntity, String.class);
        System.out.println(responseEntity);
    }
}
