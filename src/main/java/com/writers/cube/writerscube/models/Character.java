package com.writers.cube.writerscube.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Character extends PlotElement {

    @JsonProperty
    String name;
    @JsonProperty
    String description;

    @Id
    String id;

    @JsonProperty
    String storyBoardId;

    @JsonProperty
    String plotPointId;

    public Character(String name, String description, String id, String storyBoardId, String plotPointId) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.storyBoardId = storyBoardId;
        this.plotPointId = plotPointId;
    }

    public Character() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStoryBoardId() {
        return storyBoardId;
    }

    public void setStoryBoardId(String storyBoardId) {
        this.storyBoardId = storyBoardId;
    }

    public String getPlotPointId() {
        return plotPointId;
    }

    public void setPlotPointId(String plotPointId) {
        this.plotPointId = plotPointId;
    }
}
