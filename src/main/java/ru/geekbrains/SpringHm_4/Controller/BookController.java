package ru.geekbrains.SpringHm_4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.SpringHm_4.Domain.Book;
import ru.geekbrains.SpringHm_4.Serevices.BookServiceImpl;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookServiceImpl bookService;
    Book book;

    @GetMapping("/add")
    public String showForm(Model model) {
        book = new Book("", "", "");
        model.addAttribute("book", book);
        return "form";
    }

    @PostMapping("/add")
    public String submitForm(@ModelAttribute("book") Book book) {
        bookService.addBook(book);
        return "redirect:/";
    }

    @RequestMapping("/")
    public String home(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "home";
    }
}