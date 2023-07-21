package controllers;

import models.PlotPoint;
import models.StoryBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositories.PlotPointRepo;
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
    StoryBoard getStoryBoardByID(@RequestParam String ID) {
        return storyBoardService.getStoryBoardById(ID);
    }
    @PostMapping
    StoryBoard createNewStoryBoard(@PathVariable StoryBoard storyBoard) {
        return storyBoardService.createNewStoryBoard(storyBoard);
    }

    @GetMapping
    public List<PlotPoint> getAllPlotPoints() {
        return plotPointService.getAllPlotPoints();
    }

    @GetMapping
    public PlotPoint getPlotPointByStoryBoardId(@RequestParam String ID) {
        return plotPointService.getPlotPointByStoryBoardId(ID);
    }

    @PostMapping
    PlotPoint createNewPlotPoint(@PathVariable PlotPoint plotPoint) {
        return plotPointService.createNewPlotPoint(plotPoint);
    }
}
