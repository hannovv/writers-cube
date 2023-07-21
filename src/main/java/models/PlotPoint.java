package models;

import java.util.List;

public class PlotPoint {

    String StoryBoardId;
    Genre genre;
    List<Event> events;

    List<Character> characters;

    TimePeriod timeperiod;

    Setting setting;

    public PlotPoint(){};
    public PlotPoint(Genre genre, List<Event> events, List<Character> characters, TimePeriod timePeriod, Setting setting, String StoryBoardId){};

    public Genre getGenre() {
        return genre;
    }

    public List<Event> getEvents() {
        return events;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public TimePeriod getTimeperiod() {
        return timeperiod;
    }

    public Setting getSetting() {return setting;};

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    public void setTimePeriod(TimePeriod timeperiod) {
        this.timeperiod = timeperiod;
    }

    public void setSetting(Setting setting) {this.setting = setting;};
    public String getStoryBoardId() {
        return StoryBoardId;
    }

    public void setStoryBoardId(String storyBoardId) {
        StoryBoardId = storyBoardId;
    }

}
