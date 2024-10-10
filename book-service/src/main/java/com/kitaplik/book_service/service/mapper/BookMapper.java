package com.kitaplik.book_service.service.mapper;

import com.kitaplik.book_service.dto.BookDto;
import com.kitaplik.book_service.model.Book;
import org.mapstruct.Mapper;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mapping(source = "id", target = "id.id")
    @Mapping(source = "isbn", target = "id.isbn")
    BookDto booktoBookDto(Book book);

    /*
    @Mapping(source = "id.id", target = "id")
    @Mapping(source = "id.isbn", target = "isbn")
    Book bookDtoToBook(BookDto bookDto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "isbn", target = "isbn")
    BookIdDto bookToBookIdDto(Book book);
     */

}
