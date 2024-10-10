package com.kitaplik.library_service.dto;

import java.util.List;

public class LibraryDto {

    private Long id;
    private List<BookDto> userBookList;


    public LibraryDto(){}

    public LibraryDto(Long id, List<BookDto> userBookList) {
        this.id = id;
        this.userBookList = userBookList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<BookDto> getUserBookList() {
        return userBookList;
    }

    public void setUserBookList(List<BookDto> userBookList) {
        this.userBookList = userBookList;
    }
}
