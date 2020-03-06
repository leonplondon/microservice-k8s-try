package pro.darkgod.foo.controllers;

import lombok.extern.slf4j.Slf4j;
import pro.darkgod.foo.models.DatabaseCredentials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/")
@Slf4j
public class FooController {

    @Value("${postgres.port}")
    Integer portValue;

    @Value("${postgres.host}")
    String hostValue;

    private final RestTemplate barServiceRestTemplate;

    @Autowired
    public FooController(@Qualifier("bar-ms") RestTemplate serviceOneRestTemplate) {
        this.barServiceRestTemplate = serviceOneRestTemplate;
    }

    @GetMapping("/caller")
    public DatabaseCredentials callEcho() {
        log.info("Receive call to /api/v1/caller on service two");

        String response = barServiceRestTemplate.getForObject("/echo", String.class);

        log.info("Response received from service one {}", response);

        return DatabaseCredentials.builder().externalController(response).host(hostValue).port(portValue).build();
    }

}
