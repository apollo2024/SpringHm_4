package ru.geekbrains.SpringHm_4.Serevices;

import org.springframework.stereotype.Service;
import ru.geekbrains.SpringHm_4.Domain.Book;
import ru.geekbrains.SpringHm_4.Interfaces.BookService;

import java.util.ArrayList;
import java.util.List;


@Service
public class BookServiceImpl implements BookService {


    private List<Book> bookRepository = new ArrayList<>();

    @Override
    public List<Book> getAllBooks() {
        return bookRepository;
    }

    @Override
    public void addBook(Book book) {
        bookRepository.add(book);
    }
}



