package com.kitaplik.book_service.dto;

public class BookIdDto {
    private Long id;
    private String isbn;

    public BookIdDto(){

    }

    public BookIdDto(Long id, String isbn) {
        this.id = id;
        this.isbn = isbn;
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
