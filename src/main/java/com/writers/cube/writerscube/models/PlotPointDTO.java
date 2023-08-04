package com.writers.cube.writerscube.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PlotPointDTO {

    @Id
    private String id;

    @JsonProperty
    private String storyBoardId;

    @JsonProperty
    private String description;

    public PlotPointDTO(String id, String storyBoardId, String description) {
        this.id = id;
        this.storyBoardId = storyBoardId;
        this.description = description;
    }

    public PlotPointDTO() {

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PlotPointDTO{" +
                "id='" + id + '\'' +
                ", storyBoardId='" + storyBoardId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
