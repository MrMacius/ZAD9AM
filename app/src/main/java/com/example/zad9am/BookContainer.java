package com.example.zad9am;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class BookContainer {
    @SerializedName("docs")
    private List<Book> bookList;

    // Getter for bookList
    public List<Book> getBookList() {
        return bookList;
    }

    // Setter for bookList
    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
