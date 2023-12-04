package org.lessong.springlibrary.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false, unique = true)
    private String isbn;
    private String publisher;
    private String authors;
    private Integer year;
    private String synopsis;
    private Integer numberOfCopies;
    private LocalDateTime createdAt;
}
