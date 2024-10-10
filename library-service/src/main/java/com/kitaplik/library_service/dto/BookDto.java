package com.kitaplik.library_service.dto;


public class BookDto {
    private BookIdDto bookIdDto;
    private String title;
    private int bookYear;
    private String author;
    private String pressName;


    public BookDto(){}

    public BookDto(BookIdDto bookIdDto, String title, int bookYear, String author, String pressName) {
        this.bookIdDto = bookIdDto;
        this.title = title;
        this.bookYear = bookYear;
        this.author = author;
        this.pressName = pressName;
    }

    public BookIdDto getId() {
        return bookIdDto;
    }

    public void setId(BookIdDto bookIdDto) {
        this.bookIdDto = bookIdDto;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPressName() {
        return pressName;
    }

    public void setPressName(String pressName) {
        this.pressName = pressName;
    }
}
