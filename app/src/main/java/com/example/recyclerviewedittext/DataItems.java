package com.example.recyclerviewedittext;

import java.util.List;

public class DataItems {

    public String title;
    public String year;
    public String genre;
    public String rating;
    public int imageId;


    public DataItems(int imageId,String title, String year, String genre, String rating) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
        this.imageId = imageId;
    }
}

