package com.example.travelturkey.activity;

import android.net.Uri;

import java.io.Serializable;

public class City implements Serializable {
    String name;
    String number;
    Uri imageUri;
    String comment;
    String bolge;


    public void setComment(String comment) {
        this.comment = comment;
    }

    public City(String name, String number, String comment, String bolge) {
        this.name = name;
        this.number = number;
        this.comment = comment;
        this.bolge = bolge;
    }

    public City(String name, String number, Uri image, String comment){
        this.name = name;
        this.number = number;
        this.imageUri = image;
        this.comment=comment;
    }

}
