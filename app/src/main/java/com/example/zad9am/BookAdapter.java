package com.example.zad9am;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookHolder> {

    private List<Book> books;

    @NonNull
    @Override
    public BookHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new BookHolder(inflater, parent);
    }

    @Override
    public void onBindViewHolder(@NonNull BookHolder holder, int position) {
        if (books != null && position < books.size()) {
            Book book = books.get(position);
            holder.bind(book);
        } else {
            Log.d("MainActivity", "No books");
        }
    }

    @Override
    public int getItemCount() {
        return (books != null) ? books.size() : 0;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
        notifyDataSetChanged();
    }
}