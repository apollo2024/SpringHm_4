package ru.geekbrains.SpringHm_4.Interfaces;

import ru.geekbrains.SpringHm_4.Domain.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();

    void addBook(Book book);

}
