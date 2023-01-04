package com.project.questapp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="post")
public class Post {
    @Id
    Long id;
    Long userId;
    String title;

    @Lob
    @Column(columnDefinition = "text")
    String text;

}
