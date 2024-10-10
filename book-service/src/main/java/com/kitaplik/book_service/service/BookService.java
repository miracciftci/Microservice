package com.kitaplik.book_service.service;


import com.kitaplik.book_service.dto.BookDto;
import com.kitaplik.book_service.dto.BookIdDto;
import com.kitaplik.book_service.exception.BookNotFoundException;
import com.kitaplik.book_service.model.Book;
import com.kitaplik.book_service.repository.BookRepository;
import com.kitaplik.book_service.service.mapper.BookMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public Book findEntity(Long id){
        return bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book not found by id: "+id));
    }

    public List<BookDto> getAllBooks(){
        return bookRepository.findAll()
                        .stream()
                        .map(book -> BookMapper.INSTANCE.booktoBookDto(book))
                        .collect(Collectors.toList());
    }

    public BookIdDto findByIsbn(String isbn){
        return bookRepository.findBookByIsbn(isbn)
                .map(book -> new BookIdDto(book.getId(),book.getIsbn()))
                .orElseThrow(() -> new BookNotFoundException("Book not found by isbn"));
    }

    public BookDto findBookDetailsById(Long id){
        Book book =  bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found by id : "+id));
        return BookMapper.INSTANCE.booktoBookDto(book);
    }



}
