package com.nekisse.webservice.service;


import com.nekisse.webservice.domain.PostsRepository;
import com.nekisse.webservice.web.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;


    @Transactional
    public Long save(PostsSaveRequestDto dto) {
        return postsRepository.save(dto.toEntity()).getId();
    }
}
