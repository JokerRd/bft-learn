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
    @SequenceGenerator(name = "seq_test_entity", sequenceName = "seq_test_entity", allocationSize = 1)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_question", nullable = false)
    private QuestionEntity questionEntity;

    @Column(name = "id_question")
    private long idQuestion;

    @Column(name = "answer")
    private String answer;

    @Column(name = "is_right")
    private boolean isRight;
}
