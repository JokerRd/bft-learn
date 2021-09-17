package com.bftcom.bftlearn.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class AnswerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_answer_entity", sequenceName = "seq_answer_entity", allocationSize = 1)
    private long id;

    @Column(name = "answer")
    private String answer;

    @Column(name = "is_right")
    private boolean isRight;
}
