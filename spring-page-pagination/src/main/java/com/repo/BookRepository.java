package com.repo;

import com.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // This is a JPA repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
