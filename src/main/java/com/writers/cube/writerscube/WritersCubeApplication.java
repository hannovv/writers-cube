package com.writers.cube.writerscube;

import com.writers.cube.writerscube.models.PlotPoint;
import com.writers.cube.writerscube.models.PlotPointDTO;
import com.writers.cube.writerscube.models.StoryBoard;
import com.writers.cube.writerscube.repositories.PlotPointRepo;
import com.writers.cube.writerscube.repositories.StoryBoardRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class WritersCubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WritersCubeApplication.class, args); System.out.println("testing");
	}
	@Bean
	CommandLineRunner init(StoryBoardRepo storyBoardRepo, PlotPointRepo plotPointRepo) {
		return args -> {
				StoryBoard storyBoard = new StoryBoard("4","A story about a vampire who falls in love with a scientist","Cold Hearted");
				storyBoardRepo.save(storyBoard);
				StoryBoard storyBoard2 = new StoryBoard("2","A story about a two brothers","Two Brothers");
				storyBoardRepo.save(storyBoard2);
				StoryBoard storyBoard3 = new StoryBoard("3","A story about a dentist who can't hang","ToothMan");
				storyBoardRepo.save(storyBoard3);

				PlotPointDTO plotPoint = new PlotPointDTO("4", "4", "Edith and Charles meet on the first night of the full moon");
				plotPointRepo.save(plotPoint);
				PlotPointDTO plotPoint2 = new PlotPointDTO("2", "2", "A woman gives birth to twins");
				plotPointRepo.save(plotPoint2);
				PlotPointDTO plotPoint3 = new PlotPointDTO("3", "3", "A man graduates from dental school");
				plotPointRepo.save(plotPoint3);
				PlotPointDTO plotPoint4 = new PlotPointDTO("1", "4", "Edith saves Charles from drowning using superhuman powers");
				plotPointRepo.save(plotPoint4);
				PlotPointDTO plotPoint5 = new PlotPointDTO("5", "4", "Charles confronts Edith about her abilities");
				plotPointRepo.save(plotPoint5);
				PlotPointDTO plotPoint6 = new PlotPointDTO("6", "4", "Charles leaves his research post in the Arctic");
				plotPointRepo.save(plotPoint6);

//			userRepository.findAll().forEach(System.out::println);
		};
	}

}
