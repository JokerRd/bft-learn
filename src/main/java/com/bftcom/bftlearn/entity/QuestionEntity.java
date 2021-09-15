package com.bftcom.bftlearn.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter
@Setter
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_test_entity", sequenceName = "seq_test_entity", allocationSize = 1)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_test", nullable = false)
    private TestEntity testEntity;

    @Column(name = "id_test")
    private long idTest;

    @Column(name = "name_question")
    private String  nameQuestion;

    @Column(name = "description_question")
    private String descriptionQuestion;

    @Column(name = "type_question")
    private String typeQuestion;
}
