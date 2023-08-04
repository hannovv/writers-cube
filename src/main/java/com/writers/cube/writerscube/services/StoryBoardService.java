package com.writers.cube.writerscube.services;

import jakarta.persistence.EntityNotFoundException;
import com.writers.cube.writerscube.models.StoryBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.writers.cube.writerscube.repositories.StoryBoardRepo;

import java.util.List;
import java.util.Optional;

@Service
public class StoryBoardService {

    StoryBoardRepo storyBoardRepo;
    @Autowired
    public StoryBoardService(StoryBoardRepo storyBoardRepo) {
        this.storyBoardRepo = storyBoardRepo;
    }

    public List<StoryBoard> getAllStoryBoards() {
        return storyBoardRepo.findAll();
    }

    public StoryBoard getStoryBoardById(String id) {
        Optional<StoryBoard> storyBoardOptional = storyBoardRepo.findById(id);
        if (storyBoardOptional.isEmpty()) {
            throw new EntityNotFoundException(id);
        }
            return storyBoardOptional.get();

    }

    public StoryBoard createNewStoryBoard(StoryBoard storyBoard) {
        return storyBoardRepo.save(storyBoard);
    }
}
