package org.radel.restcontroller;

import org.radel.feign.FeignServiceUtil;
import org.radel.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientRestController {

    private final FeignServiceUtil feignServiceUtil;

    public ClientRestController(FeignServiceUtil feignServiceUtil) {
        this.feignServiceUtil = feignServiceUtil;
    }

    @GetMapping("/feign")
    public List<Book> getAllBooksFromClient() {
        return feignServiceUtil.getAllBooks();
    }

    @GetMapping("/test")
    public String getTestMsg() {
        return "Test message";
    }
}
