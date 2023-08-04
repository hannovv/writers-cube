package com.writers.cube.writerscube.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TimePeriod extends PlotElement {

    String timePeriod;
    @Id
    private String id;

    public TimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public TimePeriod() {

    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
