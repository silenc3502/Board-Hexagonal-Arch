package com.example.demo.hexagon.freeBoard.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@ToString
@Getter
@EqualsAndHashCode
public class FreeBoardId {

    private final String id;

    public FreeBoardId() {
        this.id = UUID.randomUUID().toString();
    }

    public FreeBoardId(String id) {
        this.id = id;
    }
}
