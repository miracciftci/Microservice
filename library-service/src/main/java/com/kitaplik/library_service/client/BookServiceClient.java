package com.kitaplik.library_service.client;

import com.kitaplik.library_service.dto.BookDto;
import com.kitaplik.library_service.dto.BookIdDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "book-service", path = "/v1/books")
public interface BookServiceClient {
    // FeignClient ile istek atmak istediğimiz service'i beliriyoruz

    @GetMapping("/isbn/{isbn}")
    ResponseEntity<BookIdDto> getBookByIsbn(@PathVariable String isbn);

    @GetMapping("/book/{id}")
    ResponseEntity<BookDto> getBookById(@PathVariable  Long id);


}
