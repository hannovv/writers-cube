package services;

import models.StoryBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.StoryBoardRepo;

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

    public Optional<StoryBoard> getStoryBoardById(Integer id) {
        return storyBoardRepo.findById(id);
    }
}
