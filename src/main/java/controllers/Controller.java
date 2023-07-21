package controllers;

import models.StoryBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import services.PlotPointService;
import services.StoryBoardService;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {


    PlotPointService plotPointService;
    StoryBoardService storyBoardService;
    @Autowired
    public Controller(PlotPointService plotPointService, StoryBoardService storyBoardService) {
        this.plotPointService = plotPointService;
        this.storyBoardService = storyBoardService;
    }

    @GetMapping
    public List<StoryBoard> getAllStoryBoards(){
        return storyBoardService.getAllStoryBoards();
    }

    @GetMapping
    Optional<StoryBoard> getStoryBoardByID(@RequestParam Integer ID) {
        return storyBoardService.getStoryBoardById(ID);
    }
}
