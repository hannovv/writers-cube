package com.writers.cube.writerscube.controllers;

import com.writers.cube.writerscube.models.PlotPoint;
import com.writers.cube.writerscube.models.PlotPointDTO;
import com.writers.cube.writerscube.models.StoryBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.writers.cube.writerscube.services.PlotPointService;
import com.writers.cube.writerscube.services.StoryBoardService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {


    PlotPointService plotPointService;
    StoryBoardService storyBoardService;
    @Autowired
    public Controller(PlotPointService plotPointService, StoryBoardService storyBoardService) {
        this.plotPointService = plotPointService;
        this.storyBoardService = storyBoardService;
    }

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/storyboards")
    public List<StoryBoard> getAllStoryBoards(){
        return (List<StoryBoard>)storyBoardService.getAllStoryBoards();
    }

    @GetMapping("/storyboards/{ID}")
    StoryBoard getStoryBoardByID(@PathVariable("ID") String ID) {
        return storyBoardService.getStoryBoardById(ID);
    }
//    @PostMapping
//    StoryBoard createNewStoryBoard(@PathVariable StoryBoard storyBoard) {
//        return storyBoardService.createNewStoryBoard(storyBoard);
//    }
//
//    @GetMapping
//    public List<PlotPointDTO> getAllPlotPoints() {
//        return plotPointService.getAllPlotPoints();
//    }
//
    @GetMapping("/plotpoints/{ID}")
    public List<PlotPointDTO> getPlotPointByStoryBoardId(@PathVariable("ID") String ID) {
        return plotPointService.getPlotPointByStoryBoardId(ID);
    }

    @PostMapping("/plotpoints")
    PlotPointDTO createNewPlotPoint(@RequestBody PlotPointDTO plotPoint) {
        System.out.println("adding new plotpoint");
        return plotPointService.createNewPlotPoint(plotPoint);
    }
}
