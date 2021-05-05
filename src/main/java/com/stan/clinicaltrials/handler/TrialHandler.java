package com.stan.clinicaltrials.handler;

import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

//@Controller
public class TrialHandler implements HttpHandler {
    @Override
    public Mono<Void> handle(ServerHttpRequest request, ServerHttpResponse response) {
        return null;
    }
}
