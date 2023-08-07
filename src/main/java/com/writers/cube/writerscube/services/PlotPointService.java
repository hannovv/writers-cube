package com.writers.cube.writerscube.services;

import com.writers.cube.writerscube.models.PlotElement;
import com.writers.cube.writerscube.models.PlotPoint;
import com.writers.cube.writerscube.models.PlotPointDTO;
import com.writers.cube.writerscube.models.StoryBoard;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.writers.cube.writerscube.randomizer.PlotPointRandomizer;
import com.writers.cube.writerscube.repositories.PlotPointRepo;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class PlotPointService {

    PlotPointRepo plotPointRepo;


    @Autowired
    public PlotPointService(PlotPointRepo plotPointRepo) {
        this.plotPointRepo = plotPointRepo;
    }
    public List<PlotPointDTO> getAllPlotPoints() {
        return plotPointRepo.findAll();
    }

    public List<PlotPointDTO> getPlotPointByStoryBoardId(String id) {
        return plotPointRepo.findAllByStoryBoardId(id);
    }

    public PlotPointDTO createNewPlotPoint(PlotPointDTO plotPoint) {
        return plotPointRepo.save(plotPoint);
    }

    public PlotPointDTO findById(String id) {
        System.out.println("finding plotpoint with id "+ id);
        Optional<PlotPointDTO> ppo = plotPointRepo.findById(id);
        if (ppo.isEmpty()) {
            throw new EntityNotFoundException(id);
        }
        return ppo.get();

    }


    public void deletePlotPoint(String id) {
        System.out.println("finding plotpoint with id "+ id);
        plotPointRepo.delete(this.findById(id));
    }


}
