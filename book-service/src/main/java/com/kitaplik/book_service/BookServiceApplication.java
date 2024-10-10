package com.kitaplik.book_service;

import com.kitaplik.book_service.model.Book;
import com.kitaplik.book_service.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Arrays;

@SpringBootApplication
@EnableDiscoveryClient
public class BookServiceApplication implements CommandLineRunner {
	private final BookRepository bookRepository;

	public BookServiceApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book1 = new Book();
		book1.setTitle("Dünyanın Gözü");
		book1.setBookYear(2000);
		book1.setAuthor("Robert Jordan");
		book1.setPressName("İthaki Yayınevi");
		book1.setIsbn("123456");

		Book book2 = new Book();
		book2.setTitle("Yüzüklerin Efendisi");
		book2.setBookYear(1960);
		book2.setAuthor( "J.R.R Tolkien");
		book2.setPressName("Metis Yayıncılık");
		book2.setIsbn("456789");

		Book book3 = new Book();
		book3.setTitle("Harry Potter ve Felsefe Taşı");
		book3.setBookYear(1997);
		book3.setAuthor("J. K. Rowling");
		book3.setPressName("YKB Yayınları");
		book3.setIsbn("987654");

		bookRepository.saveAll(Arrays.asList(book1, book2, book3));
	}
}
