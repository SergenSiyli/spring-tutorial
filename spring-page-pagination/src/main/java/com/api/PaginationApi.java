package com.api;


import com.entity.BookEntity;
import com.repo.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class PaginationApi {
    private final BookRepository bookRepository;

    @GetMapping
    public Page<BookEntity> pagination(@RequestParam Integer pageSize,
                                 @RequestParam Integer page){
        Pageable pageable = PageRequest.of(page, pageSize);
        return bookRepository.findAll(pageable);
    }

    @GetMapping("/p")
    public Page<BookEntity> pagination(Pageable pageable){
        // totalElements count query
        return bookRepository.findAll(pageable);
    }


    //Slice doesnt interest count query
    @GetMapping("/s")
    public Slice<BookEntity> slice(Pageable pageable){
        return bookRepository.findAll(pageable);
    }
}

