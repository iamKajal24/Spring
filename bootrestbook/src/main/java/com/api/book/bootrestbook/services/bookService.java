package com.api.book.bootrestbook.services;

// import java.util.ArrayList;
import java.util.List;
// import java.util.stream.Collectors;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;

@Component
public class bookService {

    @Autowired
    private BookRepository bookRepository;
 
    // private static List<Book> list = new ArrayList<>();

    // static{

    //     list.add(new Book(12,"java complete reference","xyz"));
    //     list.add(new Book(36,"Head First to Java","ABC"));
    //     list.add(new Book(12678,"Think is Java","LMN"));
    // }

    
    //get all books -> read
    // public List<Book> getAllBooks(){
    //     return list;
    // }

    public List<Book> getAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    //get single book by id -> single read
    // public <Book> getBookByid(int id){
    //     Book book = null;
    //     try{
    //         // book =list.stream().filter(e->e.getId()==id).findFirst().get();
    //     }
    //     catch(Exception e){
    //         e.printStackTrace();
    //     }
    //     return book;
    // }

    public Optional<Book> getBookById(int id) {
        return bookRepository.findById(id);
    }

    //create a book -> create book
    // public Book addBook(Book b){
    //     // list.add(b);
    //     this.bookRepository.save(b);
    //     return b;
    // }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    //delete book
//   public void deleteBook(int bid) {
    // list = list.stream()
    //            .filter(book -> book.getId() != bid)
    //            .collect(Collectors.toList());
//     this.bookRepository.deleteById(bid);
// }

public void deleteBook(int bookId) {
    bookRepository.deleteById(bookId);
}

    // update the book
    // public void updateBook(Book book, int bookId){
    //     // list =list.stream().map(b->{
    //     //     if(b.getId()==bookId){
    //     //         b.setTitle(book.getTitle());
    //     //         b.setAuthor(book.getAuthor());
    //     //     }
    //     //     return b;
    //     // }).collect(Collectors.toList());
    //     this.bookRepository.save(book);
    // }

    public Book updateBook(Book book, int bookId) {
        Optional<Book> existingBook = bookRepository.findById(bookId);
        if (existingBook.isPresent()) {
            Book updatedBook = existingBook.get();
            updatedBook.setTitle(book.getTitle());
            updatedBook.setAuthor(book.getAuthor());
            return bookRepository.save(updatedBook);
        } else {
            throw new RuntimeException("Book with ID " + bookId + " not found.");
        }
    }
}
