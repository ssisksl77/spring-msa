package me.play.springmsacircuitbreaker1client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/to-read")
    public String toRead() {
        return bookService.readingList();
    }
}
