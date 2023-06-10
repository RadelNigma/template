package org.radel.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ClientRestController {

    @GetMapping("/test")
    public String getTestMsg() {
        return "This is eureka-service2. Test message";
    }
}
