package com.kitaplik.library_service.service;

import com.kitaplik.library_service.client.BookServiceClient;
import com.kitaplik.library_service.dto.AddBookRequest;
import com.kitaplik.library_service.dto.LibraryDto;
import com.kitaplik.library_service.exception.LibraryNotFoundException;
import com.kitaplik.library_service.model.Library;
import com.kitaplik.library_service.repository.LibraryRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class LibraryService {

    private final LibraryRepository libraryRepository;
    private final BookServiceClient bookServiceClient;

    public LibraryService(LibraryRepository libraryRepository, BookServiceClient bookServiceClient) {
        this.libraryRepository = libraryRepository;
        this.bookServiceClient = bookServiceClient;
    }

    public LibraryDto getAllBooksLibraryById(Long id){
        Library library = libraryRepository.findById(id)
                .orElseThrow(() -> new LibraryNotFoundException("Library could not found exception id: " + id));

        LibraryDto libraryDto = new LibraryDto(library.getId(),
                library.getUserBook()
                        .stream()
                        .map(bookId -> bookServiceClient.getBookById(bookId).getBody())
                        .collect(Collectors.toList()));
        return libraryDto;
    }

    public LibraryDto createLibrary(){
        Library newLibrary = libraryRepository.save(new Library());
        return new LibraryDto(newLibrary.getId(),new ArrayList<>());
    }

    public void addBookToLibrary(AddBookRequest request){
        Long bookId = bookServiceClient.getBookByIsbn(request.getIsbn()).getBody().getId();
        Library library = libraryRepository.findById(request.getLibraryId())
                .orElseThrow(() -> new LibraryNotFoundException("Library could not found exception id: " + request.getLibraryId()));

        library.getUserBook().add(bookId);
        libraryRepository.save(library);
    }


}
