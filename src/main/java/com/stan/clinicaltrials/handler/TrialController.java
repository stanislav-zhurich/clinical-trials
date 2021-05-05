package com.stan.clinicaltrials.handler;

import com.stan.clinicaltrials.model.Trial;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/trials")
public class TrialController {

    @GetMapping("/{id}")
    private Mono<Trial> getEmployeeById(@PathVariable String id) {
        Trial trial = new Trial("123", "title test", "description test");
        return Mono.just(trial);
    }
}
