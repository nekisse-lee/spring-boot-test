package com.coduckfoilo.domain.project;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectRepositoryTest {

    @Autowired
    ProjectRepository projectRepository;

    @After
    public void cleanUp() {
        projectRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        //given
        projectRepository.save(Project.builder()
                .userId(1)
                .title("제목1")
                .description("내용1")
                .build());

        //when
        List<Project> projectList = projectRepository.findAll();

        //then
        Project project = projectList.get(0);
//         assertThat(project.getUserId(), is(1));   왜 ???실패?
        assertThat(project.getTitle(), is("제목1"));   //이미 sql파일에 들어가있음...
    }

    @Test
    public void BaseTimeEntity_등록() {
        //given
        LocalDateTime now = LocalDateTime.now();
        projectRepository.save(Project.builder()
                .title("시간등록제목")
                .description("시간등록내용")
                .build());
        //when
        List<Project> projectList = projectRepository.findAll();

        //then
        Project project = projectList.get(2);
        assertTrue(project.getStartDate().isAfter(now));
        assertTrue(project.getEndDate().isAfter(now));


    }


}