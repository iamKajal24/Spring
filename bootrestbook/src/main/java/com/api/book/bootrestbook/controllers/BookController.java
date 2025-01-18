package com.api.book.bootrestbook.controllers;

import com.api.book.bootrestbook.entities.Book;
import com.api.book.bootrestbook.services.bookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private bookService bookService;

    // Get all books
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> list = this.bookService.getAllBooks();
        if (list.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build(); // NO_CONTENT indicates an empty list
        }
        return ResponseEntity.ok(list); // OK status (200) with book list
    }

    // Get a single book by ID
    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") int id) {
        Optional<Book> book = this.bookService.getBookById(id);
        if (book.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(book.get());
    }

    // Create a new book
    @PostMapping("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        try {
            Book savedBook = this.bookService.addBook(book);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedBook); // CREATED status (201)
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // Delete a book by ID
    @DeleteMapping("/books/{bookId}")
    public ResponseEntity<Void> deleteBook(@PathVariable("bookId") int bookId) {
        try {
            this.bookService.deleteBook(bookId);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build(); // NO_CONTENT indicates successful deletion
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // Update a book by ID
    @PutMapping("/books/{bookId}")
    public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable("bookId") int bookId) {
        try {
            Book updatedBook = this.bookService.updateBook(book, bookId); // Fetch updated entity from service
            return ResponseEntity.ok(updatedBook); // OK status (200)
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}



//*******************************"***********************************************************************************************************
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RestController;

// import com.api.book.bootrestbook.entities.Book;
// import com.api.book.bootrestbook.services.bookService;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;

// @RestController
// public class BookController{
//    @Autowired
//    private bookService bookService;
   
//    //get all books
//    @GetMapping("/books")
//    public ResponseEntity<List<Book>> getBooks(){
//    List<Book> list = this.bookService.getAllBooks();
//    if(list.size()<=0){
//       return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//    }
//     return ResponseEntity.status(HttpStatus.CREATED).body(list);
//    }

//    //get single book
//    @GetMapping("/books/{id}")
//    public ResponseEntity<Book> getBook(@PathVariable("id") int id){
//       Book book = bookService.getBookById(id);
//       if(book==null){
//          return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//       }
//       return ResponseEntity.of(Optional.of(book)) ;
//    }

//    //create a book
//    @PostMapping("/books")
//    public ResponseEntity<Book> addBook(@RequestBody Book book){
//     Book b = null;
//     try{
//       b=this.bookService.addBook(book);
//       System.out.println("successfully add books"+book);
//       return ResponseEntity.of(Optional.of(b));
//     }
//     catch(Exception e){
//       e.printStackTrace();
//       return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//     }
//    }

//    //delete book
//    @DeleteMapping("/books/{bookId}")
//    public ResponseEntity<Void> deleteBook(@PathVariable("bookId") int bookId){
//         try{
//          this.bookService.deleteBook(bookId);
//          return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//         }
//         catch(Exception e){
//          e.printStackTrace();
//          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//         }
//    }

//    //update book

//    @PutMapping("/books/{bookId}")
//    public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable("bookId") int bookId) {
//      try{
//        this.bookService.updateBook(book, bookId); // Call the service layer to handle the update logic
//        return ResponseEntity.ok().body(book);
//      }
//      catch(Exception e){
//       e.printStackTrace();
//       return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//      }
//    }
   
// }








// @Controller
// @RestController
// public class BookController {

//     @Autowired
//    private BookService bookService;

//     // @RequestMapping(value = "/books", method=RequestMethod.GET)
//     @GetMapping("/books")
//     public List<Book> getBooks(){
//     //  Book book =new Book();
//     //  book.setId(101);
//     //  book.setTitle("java complete reference");
//     //  book.setAuthor("xyz");
//     return (List<Book>) this.bookService.getAllBooks();
//     }
//}
