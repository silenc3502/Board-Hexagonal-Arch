package com.example.demo.hexagon.freeBoard.application.port.in;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class WriteFreeBoardCommand {

    private final String freeBoardTitle;
    private final String freeBoardWriter;
    private final String freeBoardContent;
}
