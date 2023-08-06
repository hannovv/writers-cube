package com.writers.cube.writerscube.controllers;

import com.writers.cube.writerscube.chatGPT.ChatRequest;
import com.writers.cube.writerscube.chatGPT.ChatResponse;
import com.writers.cube.writerscube.chatGPT.StoryBoardPrompt;
import com.writers.cube.writerscube.models.PlotPoint;
import com.writers.cube.writerscube.models.PlotPointDTO;
import com.writers.cube.writerscube.models.StoryBoard;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.writers.cube.writerscube.services.PlotPointService;
import com.writers.cube.writerscube.services.StoryBoardService;
import org.springframework.web.client.RestTemplate;


import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {


    PlotPointService plotPointService;
    StoryBoardService storyBoardService;

    @Qualifier("openaiRestTemplate")
    @Autowired
    private RestTemplate restTemplate;

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String apiUrl;

    @Autowired
    public Controller(PlotPointService plotPointService, StoryBoardService storyBoardService) {
        this.plotPointService = plotPointService;
        this.storyBoardService = storyBoardService;
    }

    @PostMapping("/chat")
    public String chat(@RequestBody StoryBoardPrompt storyBoardPrompt) {
        // create a request

        //separate prompt from storyboardprompt model
        String prompt = storyBoardPrompt.getPrompt();
        ChatRequest request = new ChatRequest(model, prompt);
//        request.setN(1);

        // call the API
        System.out.println(request.toString());
        ChatResponse response = restTemplate.postForObject(apiUrl, request, ChatResponse.class);

        if (response == null || response.getChoices() == null || response.getChoices().isEmpty()) {
            return "No response";
        }

        //add ChatGPT's response to the plotpoint database
        PlotPointDTO plotPoint = new PlotPointDTO();
        plotPoint.setDescription(response.getChoices().get(0).getMessage().getContent());
        plotPoint.setStoryBoardId(storyBoardPrompt.getStoryBoardId());
        plotPoint.setId("100");
        plotPointService.createNewPlotPoint(plotPoint);

        // return the first response

        return response.getChoices().get(0).getMessage().getContent();
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
        System.out.println(plotPoint.toString());
        System.out.println(plotPointService.createNewPlotPoint(plotPoint).toString());
        return plotPointService.createNewPlotPoint(plotPoint);
    }

    @DeleteMapping("/{ID}")
    ResponseEntity<String> deletePlotPointById(@PathVariable("ID") String ID) {
        System.out.println("deleting plotpoint with id" + ID);
         plotPointService.deletePlotPoint(ID);
         return new ResponseEntity<>(HttpStatus.OK);
    }
}
