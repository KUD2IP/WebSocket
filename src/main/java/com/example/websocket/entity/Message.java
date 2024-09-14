package com.example.websocket.entity;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    private String name;
    private String message;
}
