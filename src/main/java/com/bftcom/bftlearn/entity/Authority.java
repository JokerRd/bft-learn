package com.bftcom.bftlearn.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity(name = "authorities")
public class Authority implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "authoriry")
    private String authority;

    @ManyToOne
    @JoinColumn(name = "username", insertable = false, updatable = false)
    private User user;

    @Override
    public String getAuthority() {
        return authority;
    }
}
