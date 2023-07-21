package repositories;

import models.PlotPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlotPointRepo extends JpaRepository<PlotPoint, String> {
    PlotPoint findAllByStoryBoardId(String id);
}
