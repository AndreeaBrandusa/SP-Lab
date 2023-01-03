package org.sp.difexamples;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.sp.models.Book;
import org.sp.models.Element;
import org.sp.persistence.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class BooksController {
    private final BooksRepository booksRepository;
    private Book book;

    @PostMapping
    private void createBook() {
        Book b = createNewBook();
        this.book = booksRepository.save(b);
    }

    private Book createNewBook() {
        return new Book();
    }

    @SneakyThrows
    @GetMapping("/books/{id}")
    private ResponseEntity<Element> getBook(@PathVariable Integer id) {
        Book b = booksRepository.getOne(id);
        return new ResponseEntity<>(b, HttpStatus.OK);
    }
}
