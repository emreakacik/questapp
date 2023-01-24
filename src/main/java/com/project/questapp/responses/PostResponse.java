package com.project.questapp.responses;

import com.project.questapp.entities.Post;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class PostResponse {
    @Id
    Long id;
    Long userId;
    String userName;
    String title;
    String text;




    public PostResponse(Post entity) {
        this.id = entity.getId();
        this.userId = entity.getUser().getId();
        this.userName = entity.getUser().getUserName();
        this.title = entity.getTitle();
        this.text = entity.getText();


    }


}
