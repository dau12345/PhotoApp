package com.example.photoapp;

public class Photo {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    private String source_photo;

    public String getSource_photo() {
        return source_photo;
    }

    public void setSource_photo(String newSource_photo) {
        this.source_photo = newSource_photo;
    }

    private String title_photo;

    public String getTitle_photo() {
        return title_photo;
    }

    public void setTitle_photo(String newTitle_photo) {
        this.title_photo = newTitle_photo;
    }

    private String description_photo;

    public String getDescription_photo() {
        return description_photo;
    }

    public void setDescription_photo(String newDesciption_photo) {
        this.description_photo = newDesciption_photo;
    }

    public Photo(int id, String source_photo, String title_photo, String description_photo) {
        this.id = id;
        this.source_photo = source_photo;
        this.title_photo = title_photo;
        this.description_photo = description_photo;
    }
}
