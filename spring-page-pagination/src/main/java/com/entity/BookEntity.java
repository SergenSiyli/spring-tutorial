package com.entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(of = "id")
@Table(name = "books")
public class BookEntity {

    @Id
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private LocalDate publishDate;
}

