package service;

import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import repository.BookRepo;

import java.util.List;

public class BookServiceImpl implements BookService{

    @Autowired
    private final BookRepo bookRepo;

    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    @Transactional
    public List<Book> findAll() {
        return bookRepo.findAll();
    }
}
