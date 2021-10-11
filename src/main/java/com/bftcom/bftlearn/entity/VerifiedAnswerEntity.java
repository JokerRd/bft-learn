package com.bftcom.bftlearn.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "verified_answers")
@Getter
@Setter
public class VerifiedAnswerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String username;

    @Column
    private long idTest;

    @Column
    private long idQuestion;

    @Column
    private String nameQuestion;

    @Column
    private String answerUser;

    @Column
    private String rightAnswer;

    @Column
    private boolean isRight;
}
