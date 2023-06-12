package org.radel.restcontroller;

import org.radel.feign.Feign;
import org.radel.feign.FeignServiceUtil;
import org.radel.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientRestController {

    private final FeignServiceUtil feignServiceUtil;

private final Feign feign;

//    public ClientRestController(Feign feign) {
//        this.feign = feign;
//    }


    public ClientRestController(FeignServiceUtil feignServiceUtil, Feign feign) {
        this.feignServiceUtil = feignServiceUtil;

        this.feign = feign;
    }




    @GetMapping("/feignServiceUtil")
    public List<Book> getAllBooksFromClient() {
        return feignServiceUtil.getAllBooks();
    }

    @GetMapping("/feign")
    public List<Book> getAllBooksFromClient1() {
        return feign.getAllBooks();
    }

    @GetMapping("/test")
    public String getTestMsg() {
        return "Test message";
    }
}
