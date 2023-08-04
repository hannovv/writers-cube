package com.writers.cube.writerscube.repositories;

import com.writers.cube.writerscube.models.StoryBoard;
import com.writers.cube.writerscube.models.TimePeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimePeriodRepo extends JpaRepository<TimePeriod, String> {
}
