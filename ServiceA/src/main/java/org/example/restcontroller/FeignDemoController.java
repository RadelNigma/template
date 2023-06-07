package org.example.restcontroller;

import org.example.feign.FeignServiceB;
import org.example.feign.FeignServiceUtil;
import org.example.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class FeignDemoController {

    private final FeignServiceUtil feignServiceUtil;
    private final FeignServiceB feignServiceB;

    public FeignDemoController(FeignServiceUtil feignServiceUtil, FeignServiceB feignServiceB) {
        this.feignServiceUtil = feignServiceUtil;
        this.feignServiceB = feignServiceB;
    }

    @GetMapping("/test")
    public List<Book> getAllBooks() {
        return feignServiceUtil.getAllBooks();
    }

    @GetMapping("/string")
    public String getString() {
        return "StringTest";
    }

    @GetMapping("/user-name")
    public String getUserName() {
      return  feignServiceB.getName();
    }

    @GetMapping("/user-address")
    public String getUserAddress() {
        return  feignServiceB.getAddress();
    }
}
