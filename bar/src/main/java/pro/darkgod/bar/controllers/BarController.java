package pro.darkgod.bar.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@Slf4j
public class BarController {

    @GetMapping("/echo")
    public String echo() {
        log.info("Receive call to /api/echo on service one");

        String response = BarController.class.getSimpleName();

        log.info("Response to be sent {}", response);

        return response;
    }
}
