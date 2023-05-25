package org.example.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @GetMapping("/name")
    public String getName() {
        return "My Name from feign client";
    }

    @GetMapping("/address")
    public String getAddress() {
        return "My Address from feign client";
    }
}
