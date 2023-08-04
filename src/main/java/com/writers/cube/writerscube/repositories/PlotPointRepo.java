package com.writers.cube.writerscube.repositories;

import com.writers.cube.writerscube.models.PlotPoint;
import com.writers.cube.writerscube.models.PlotPointDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlotPointRepo extends JpaRepository<PlotPointDTO, String> {
    List<PlotPointDTO> findAllByStoryBoardId(String id);
}
