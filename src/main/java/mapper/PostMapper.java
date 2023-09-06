package mapper;

import model.Post;
import model.PostDTO;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface PostMapper {
    Post dtoToPost(PostDTO postDTO);
    PostDTO postToDto(Post post);
}