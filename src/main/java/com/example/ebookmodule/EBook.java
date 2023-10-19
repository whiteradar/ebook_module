package com.example.ebookmodule;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class EBook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ASIN;

    private String title;

    private String Author;

    private double price;

    public Integer getASIN() {
        return ASIN;
    }

    public void setASIN(Integer ASIN) {
        this.ASIN = ASIN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}