package com.coduckfoilo.domain.project.dto;

import com.coduckfoilo.domain.project.domain.Project;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Getter
public class ProjectMainResponseDto {
    private Long id;
    private Long userId;
    private String title;
    private String endDate;

    public ProjectMainResponseDto(Project entity) {
        id = entity.getId();
        userId = entity.getUserId();
        title = entity.getTitle();
        endDate = toStringDateTime(entity.getEndDate());
    }

    private String toStringDateTime(LocalDateTime localDateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return Optional.ofNullable(localDateTime)
                .map(formatter::format)
                .orElse("");
    }
}
