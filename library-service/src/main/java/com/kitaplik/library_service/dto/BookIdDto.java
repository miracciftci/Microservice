package com.kitaplik.library_service.dto;


public class BookIdDto {
    private Long id;
    private String isbn;


    public BookIdDto(){

    }

    public BookIdDto(String isbn, Long id) {
        this.isbn = isbn;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
