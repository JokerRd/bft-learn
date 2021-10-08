package com.bftcom.bftlearn.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class MessageForQueue {

    private  String message;

    private  String theme;

    public MessageForQueue(String message, String theme) {
        this.message = message;
        this.theme = theme;
    }
}
