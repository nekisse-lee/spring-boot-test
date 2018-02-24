package com.coduckfoilo.domain.project.service;

import com.coduckfoilo.domain.project.domain.Project;
import com.coduckfoilo.domain.project.domain.ProjectRepository;
import com.coduckfoilo.domain.project.dto.ProjectSaveRequestDto;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectServiceTest {
    @Autowired
    private ProjectService projectService;

    @Autowired
    ProjectRepository projectRepository;

    @After
    public void cleanUp() {
        projectRepository.deleteAll();
    }

    @Test
    public void Dto데이터가_proect테이블에_저장된다() {
        //given
        ProjectSaveRequestDto dto = ProjectSaveRequestDto.builder()
                .userId(1)
                .title("제목1")
                .description("내용1")
                .build();

        //when
//        projectService.save(dto);

        //then
        Project project = projectRepository.findAll().get(0);
        assertThat(project.getTitle()).isEqualTo(dto.getTitle());

    }







}