package com.writers.cube.writerscube.repositories;

import com.writers.cube.writerscube.models.Setting;
import com.writers.cube.writerscube.models.StoryBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingRepo extends JpaRepository<Setting, String> {
}
