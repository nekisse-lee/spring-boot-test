package com.coduckfoilo.domain.project.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

/**
 * Created by YG-MAC on 2018. 1. 21..
 */
public interface ProjectRepository extends JpaRepository<Project, Long> {
//    @Query("SELECT p " +
//            "FROM Project p " +
//            "ORDER BY p.id DESC")
//    Stream<Project> findAllDesc();
}
