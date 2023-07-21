package repositories;

import models.StoryBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryBoardRepo extends JpaRepository<StoryBoard, String> {

}
