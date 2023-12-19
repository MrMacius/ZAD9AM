package com.example.zad9am;

import com.google.gson.annotations.SerializedName;

public class Book {
    @SerializedName("title")
    private String title;

    @SerializedName("cover_i")
    private String cover;

    @SerializedName("number_of_pages_median")
    private String numberOfPages;

    @SerializedName("author_name")
    private String author;

    // Constructor (if needed)

    // Getter and Setter for 'title'
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for 'cover'
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    // Getter and Setter for 'numberOfPages'
    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // Getter and Setter for 'author'
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}