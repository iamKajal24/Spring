package com.api.book.bootrestbook.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.stereotype.Component;
import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;
import jakarta.transaction.Transactional;

@Component
public class BookService {
   
  @Autowired  
  private BookRepository bookRepository;

    // Get all books
    public List<Book> getAllBooks() {
        List<Book> list = (List<Book>) this.bookRepository.findAll();
        return list;
    }

    // Get a single book by id
    public Book getBookById(int id) {
        Book book = null;
        try {
            book = this.bookRepository.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    // Create a new book
    @Transactional // Add @Transactional to ensure this operation is within a transaction
    public Book addBook(Book b) {
        Book result = bookRepository.save(b);
        return result;
    }

    // Delete a book
    @Transactional // Add @Transactional to ensure this operation is within a transaction
    public void deleteBook(int bid) {
        bookRepository.deleteById(bid);
    }

    // Update a book
    @Transactional // Add @Transactional to ensure this operation is within a transaction
    public void updateBook(Book book, int bookId) {
        try {
            book.setId(bookId);
            bookRepository.save(book);
        } catch (ObjectOptimisticLockingFailureException e) {
            throw new RuntimeException("The book was modified or deleted by another user. Please try again.");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("An error occurred while updating the book.");
        }
    }
}





// //delete book
// public List<Book> deleteBook(int bid){
//     return list.stream()
//                 .filter(book->{
//                     if(book.getId()!=bid){
//                         return true;
//                     }
//                     return false;
//                 }).collect(Collectors.toList());
// }


//all  method 
//private static List<Book> list = new ArrayList<>();
//static {
//     list.add(new Book(12,"Java Complete Reference","xyz"));
//     list.add(new Book(12768,"Python","XYZ"));
//     list.add(new Book(16376,"SYSTEM DESIGN","LMN"));
//     list.add(new Book(29270,"Object Oriented Programming","DEF"));
// }

// //get all books

// public List<Book> getAllBooks(){

//     return list;
// }

// //get single book
// public Book getBookById(int id) {
//     return list.stream()
//                .filter(e -> e.getId() == id)
//                .findFirst().get(); // Returns null if no book is found
// }

// //create book
// public Book addBook(Book b){
//      list.add(b);
//      return b;
// }

// //delete book
// public void deleteBook(int bid){
//     list = list.stream()
//                 .filter(book->book.getId()!=bid).collect(Collectors.toList());

// }

// //update the book
// public Book updateBook(Book book,int bookId){
//     list = list.stream().map(b->{
//         if(b.getId()==bookId){
//             b.setTitle(book.getTitle());
//             b.setAuthor(book.getAuthor());
//         }
        
//         return b;
//     }).collect(Collectors.toList());
//             return book;
// }
