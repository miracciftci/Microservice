package com.kitaplik.library_service.model;

import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "library")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ElementCollection
    private List<Long> userBook;


    public Library(){

    }

    public Library(Long id, List<Long> userBook) {
        this.id = id;
        this.userBook = userBook;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getUserBook() {
        return userBook;
    }

    public void setUserBook(List<Long> userBook) {
        this.userBook = userBook;
    }
}
