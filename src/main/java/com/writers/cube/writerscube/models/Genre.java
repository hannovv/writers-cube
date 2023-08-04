package com.writers.cube.writerscube.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Genre extends PlotElement {

    String genre;
    @Id
    private String id;

    public Genre(String genre) {
        this.genre = genre;
    }

    public Genre() {

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
