package com.bftcom.bftlearn.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageForQueue {

    private final String message;

    private final String theme;

    private final LocalDateTime dateTimeMessage;
}
