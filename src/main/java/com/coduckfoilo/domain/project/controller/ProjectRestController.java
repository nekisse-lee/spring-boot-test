package com.coduckfoilo.domain.project.controller;


import com.coduckfoilo.domain.project.ProjectRepository;
import com.coduckfoilo.domain.project.dto.ProjectSaveRequestDto;
import com.coduckfoilo.domain.project.service.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProjectRestController {

//    private ProjectRepository projectRepository;  테스트메서드 통과하였으므로 ProjectService 사용
    private ProjectService projectService;

    @GetMapping("/hello")
    public String hello() {
        return "helloWorld";
    }

    @PostMapping("/projects")
    public Long saveProjects(@RequestBody ProjectSaveRequestDto dto) {
//        return projectRepository.save(dto.toEntity()).getId();
        return projectService.save(dto);
    }
}
