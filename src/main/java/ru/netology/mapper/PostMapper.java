package ru.netology.mapper;

import ru.netology.model.Post;
import ru.netology.model.PostDTO;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface PostMapper {
    Post dtoToPost(PostDTO postDTO);
    PostDTO postToDto(Post post);
}