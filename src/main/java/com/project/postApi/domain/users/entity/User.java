package com.project.postApi.domain.users.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;
    @Column(length = 30)
    private String email;
    @Column(length = 20)
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
