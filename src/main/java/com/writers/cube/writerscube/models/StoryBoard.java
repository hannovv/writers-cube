package com.writers.cube.writerscube.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;
@Entity
public class StoryBoard {


    @Id
    String id;
    @JsonProperty
    String title;
    @JsonProperty
    String description;


    public StoryBoard(String id, String description, String title) {

        this.description = description;
        this.title = title;
        this.id = id;
    }

    public StoryBoard() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StoryBoard{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
