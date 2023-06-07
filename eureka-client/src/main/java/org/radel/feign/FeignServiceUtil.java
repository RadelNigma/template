package org.radel.feign;

import org.radel.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "book-service")
public interface FeignServiceUtil {
    @GetMapping("/api/books")
    List<Book> getAllBooks();
}
