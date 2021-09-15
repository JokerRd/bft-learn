package com.bftcom.bftlearn.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_test_entity", sequenceName = "seq_test_entity", allocationSize = 1)
    private long id;

    @Column(name = "name_test")
    private String nameTest;

    @Column(name = "description_test")
    private String descriptionTest;

    @Column(name = "is_show_result")
    private boolean isShowResult;
}
