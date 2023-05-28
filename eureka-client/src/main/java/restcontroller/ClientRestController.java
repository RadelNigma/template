package restcontroller;

import feign.FeignServiceUtil;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientRestController {

    @Autowired
    FeignServiceUtil feignServiceUtil;

    @GetMapping("/books")
    public List<Book> getAllBooksFromClient() {
        return feignServiceUtil.getBooks();
    }
}
