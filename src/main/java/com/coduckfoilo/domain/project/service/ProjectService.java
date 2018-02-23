package com.coduckfoilo.domain.project.service;

import com.coduckfoilo.domain.project.domain.ProjectRepository;
import com.coduckfoilo.domain.project.dto.ProjectMainResponseDto;
import com.coduckfoilo.domain.project.dto.ProjectSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ProjectService {

//    private ProjectRepository projectRepository;
//
//    @Transactional
//    public long save(ProjectSaveRequestDto dto) {
//        return projectRepository.save(dto.toEntity()).getId();
//    }
//
//    @Transactional(readOnly = true)
//    public List<ProjectMainResponseDto> findAllDesc() {
//        return projectRepository.findAllDesc()
//                .map(projects -> new ProjectMainResponseDto(projects))
//                .collect(Collectors.toList());
//    }
}
