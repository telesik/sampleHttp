package com.alexeyk.sample.http;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kiselev on 09.01.2017.
 */
public class HttpSender {

    public static void main(String[] args) {
        RestTemplate template = new RestTemplate();
        String url = String.format("%s/%s", "http://www.newsru.com", "#en/ru/hello");
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "*/*");
        HttpEntity<String> requestEntity = new HttpEntity<>("hello", headers);
        ;
        ResponseEntity<String> responseEntity = template.exchange(url, HttpMethod.GET, requestEntity, String.class);
        System.out.println(responseEntity);
    }
}
