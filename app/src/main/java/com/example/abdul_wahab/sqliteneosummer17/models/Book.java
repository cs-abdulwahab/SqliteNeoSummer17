package com.example.abdul_wahab.sqliteneosummer17.models;

import com.orm.SugarRecord;

/**
 * Created by Abdul-Wahab on 8/4/2017.
 */

public class Book extends SugarRecord<Book> {

    String title;
    String edition;

    public Book(){
    }

    public Book(String title, String edition){
        this.title = title;
        this.edition = edition;
    }
}