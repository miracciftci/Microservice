package com.kitaplik.library_service.dto;

public class AddBookRequest {
    private Long libraryId;
    private String isbn;


    public AddBookRequest(){

    }

    public AddBookRequest(Long libraryId, String isbn) {
        this.libraryId = libraryId;
        this.isbn = isbn;
    }

    public Long getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(Long libraryId) {
        this.libraryId = libraryId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
