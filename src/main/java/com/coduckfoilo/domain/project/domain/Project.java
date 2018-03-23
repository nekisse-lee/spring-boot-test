package com.coduckfoilo.domain.project.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by YG-MAC on 2018. 1. 21..
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Project  extends BaseTimeEntity{
    @Id
    @Column(name = "PROJECT_ID")
    @GeneratedValue
    private long id;

    private long userId;

    private String title;

    private String description;

//    private LocalDate startDate;
//
//    private LocalDate endDate;

    @Builder
    public Project(long userId, String title, String description) {
        this.userId = userId;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public void update(Project updateProject) {
        this.userId = updateProject.id;
        this.title = updateProject.title;
        this.title = updateProject.description;
    }
}
