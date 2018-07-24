package com.example.android.marvelfandom;

public class Character {
    int id;
    String name;
    String summary;
    int image_id;

    public Character() {
    }

    public Character(int id, String name, String summary, int image_id) {
        this.id = id;
        this.name = name;
        this.summary = summary;
        this.image_id = image_id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }

    public int getImage_id() {
        return image_id;
    }
}
