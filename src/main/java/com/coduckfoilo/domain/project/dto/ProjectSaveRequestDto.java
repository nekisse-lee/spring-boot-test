package com.coduckfoilo.domain.project.dto;

import com.coduckfoilo.domain.project.Project;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProjectSaveRequestDto {
    private long userId;

    private String title;

    private String description;

    @Builder
    public ProjectSaveRequestDto(long userId, String title, String description) {
        this.userId = userId;
        this.title = title;
        this.description = description;
    }



    public Project toEntity() {
        return Project.builder()
                .userId(userId)
                .title(title)
                .description(description)
                .build();
    }

}
