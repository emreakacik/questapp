package com.project.questapp.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    String userName;
    String Password;

}
