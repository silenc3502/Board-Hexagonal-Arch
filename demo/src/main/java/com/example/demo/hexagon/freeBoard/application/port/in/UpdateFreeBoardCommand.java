package com.example.demo.hexagon.freeBoard.application.port.in;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UpdateFreeBoardCommand {

    private final String freeBoardTitle;
    private final String freeBoardWriter;
    private final String freeBoardContent;
}
