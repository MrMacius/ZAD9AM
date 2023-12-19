package com.example.zad9am;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

import java.util.Collections;

public class BookHolder extends RecyclerView.ViewHolder {

    private static final String IMAGE_URL_BASE = "http://covers.openlibrary.org/b/id/";
    private final TextView bookTitleTextView;
    private final TextView bookAuthorTextView;
    private final TextView numberOfPagesTextView;
    private final ImageView bookCover;

    public BookHolder(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.book_list_item, parent, false));

        bookTitleTextView = itemView.findViewById(R.id.book_title);
        bookAuthorTextView = itemView.findViewById(R.id.book_author);
        numberOfPagesTextView = itemView.findViewById(R.id.number_of_pages);
        bookCover = itemView.findViewById(R.id.img_cover);
    }

    public void bind(Book book) {
        if (book != null && checkNullOrEmpty(book.getTitle()) && book.getAuthor() != null) {
            bookTitleTextView.setText(book.getTitle());
            bookAuthorTextView.setText(TextUtils.join(",", Collections.singleton(book.getAuthor())));
            numberOfPagesTextView.setText(book.getNumberOfPages());

            if (book.getCover() != null) {
                RequestCreator request = Picasso.get()
                        .load(IMAGE_URL_BASE + book.getCover() + "-S.jpg");

                request.placeholder(R.drawable.ic_book_black)
                        .into(bookCover);
            } else {
                bookCover.setImageResource(R.drawable.ic_book_black);
            }
        }
    }

    private boolean checkNullOrEmpty(String value) {
        return value != null && !value.isEmpty();
    }
}