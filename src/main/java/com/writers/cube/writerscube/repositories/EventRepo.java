package com.writers.cube.writerscube.repositories;

import com.writers.cube.writerscube.models.Event;
import com.writers.cube.writerscube.models.StoryBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends JpaRepository<Event, String> {
}
