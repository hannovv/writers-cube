package com.writers.cube.writerscube.chatGPT;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StoryBoardPrompt {

    @JsonProperty
    String storyBoardId;

    @JsonProperty
    String prompt;

    public StoryBoardPrompt(String storyBoardId, String prompt) {
        this.storyBoardId = storyBoardId;
        this.prompt = prompt;
    }

    public StoryBoardPrompt() {
    }

    public String getStoryBoardId() {
        return storyBoardId;
    }

    public void setStoryBoardId(String storyBoardId) {
        this.storyBoardId = storyBoardId;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
}
