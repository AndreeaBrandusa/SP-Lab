package org.sp.persistence;

import org.sp.models.Author;
import org.sp.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorsRepository extends JpaRepository<Book, Integer> {

}
