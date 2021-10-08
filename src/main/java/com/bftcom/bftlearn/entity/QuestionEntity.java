package com.bftcom.bftlearn.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_question_entity", sequenceName = "seq_question_entity", allocationSize = 1)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_test", nullable = false, updatable = false, insertable = false)
    private TestEntity testEntity;

    @Column(name = "id_test")
    private long idTest;

    @Column(name = "name_question")
    private String  nameQuestion;

    @Column(name = "description_question")
    private String descriptionQuestion;

    @Column(name = "type_question")
    private String typeQuestion;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<AnswerEntity> answers;
}
