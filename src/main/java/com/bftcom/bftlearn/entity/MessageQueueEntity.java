package com.bftcom.bftlearn.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "messages")
public class MessageQueueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "message")
    private String message;

    @Column(name = "theme")
    private String theme;

    @Column(name = "datetime_message")
    private LocalDateTime dateTimeMessage;

}
