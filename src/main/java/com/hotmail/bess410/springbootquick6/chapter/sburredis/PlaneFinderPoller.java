package com.hotmail.bess410.springbootquick6.chapter.sburredis;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@EnableScheduling
@Component
@RequiredArgsConstructor
public class PlaneFinderPoller {
    private WebClient client = WebClient.create("http://localhost:7634/aircraft");

    @NonNull
    private final AircraftRepository repository;

    @Scheduled(fixedRate = 1000)
    private void pollPlanes() {
//        repository.deleteAll();

//        client.get()
//                .retrieve()
//                .bodyToFlux(Aircraft.class)
//                .filter(plane -> !plane.getReg().isEmpty())
//                .toStream()
//                .forEach(repository::save);

        repository.findAll().forEach(System.out::println);
    }
}
