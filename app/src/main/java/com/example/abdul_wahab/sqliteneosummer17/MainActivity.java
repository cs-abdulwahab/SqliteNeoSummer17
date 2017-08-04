package com.example.abdul_wahab.sqliteneosummer17;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.abdul_wahab.sqliteneosummer17.models.Book;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long id = 1;

        /*Book bk = Book.findById(Book.class, id);

        Book book = new Book("Title here", "2nd edition");
        book.save();*/


    }
}
