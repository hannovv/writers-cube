package com.writers.cube.writerscube.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Setting extends PlotElement{
    String setting;
    @Id
    private String id;

    public Setting(String setting) {
        this.setting = setting;
    }

    public Setting() {

    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
