package in.raj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class MyRestController {
    @GetMapping("/single")
    public Mono<String> singleResponse(){
        return Mono.just("Hello World");
    }

    @GetMapping("/multiple")
    public Flux<Integer> multipleResponse(){
        return Flux.range(1,10);
    }
}
