package com.thoughtworks.capability.gtb.alice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class AliceApi {

    @Autowired
    private AliceService aliceService;

    @GetMapping
    public String getHelloFromBob() {
        return aliceService.getHello();
    }
}
