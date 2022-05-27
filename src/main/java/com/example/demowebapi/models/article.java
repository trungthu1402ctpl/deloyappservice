package com.example.demowebapi.models;

import javax.persistence.*;

@Entity
@Table(name = "article")
public class article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;
    @Column(name = "body")
    private String body;
    @Column(name = "image")
    private String image;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public article() {
        super();
    }

    public article(long id, String title, String author, String body, String image) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.body = body;
        this.image = image;
    }
}
