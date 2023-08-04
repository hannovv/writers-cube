package com.writers.cube.writerscube.repositories;

import com.writers.cube.writerscube.models.Genre;
import com.writers.cube.writerscube.models.StoryBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepo extends JpaRepository<Genre, String> {
}
