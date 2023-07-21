package services;

import models.PlotPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.PlotPointRepo;

import java.util.List;

@Service
public class PlotPointService {

    PlotPointRepo plotPointRepo;

    @Autowired
    public PlotPointService(PlotPointRepo plotPointRepo) {
        this.plotPointRepo = plotPointRepo;
    }
    public List<PlotPoint> getAllPlotPoints() {
        return plotPointRepo.findAll();
    }

    public PlotPoint getPlotPointByStoryBoardId(String id) {
        return plotPointRepo.findAllByStoryBoardId(id);
    }

    public PlotPoint createNewPlotPoint(PlotPoint plotPoint) {
        return plotPointRepo.save(plotPoint);
    }
}
