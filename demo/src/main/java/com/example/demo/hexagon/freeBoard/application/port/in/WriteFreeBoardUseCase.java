package com.example.demo.hexagon.freeBoard.application.port.in;

public interface WriteFreeBoardUseCase {
    WriteFreeBoardResult execute (WriteFreeBoardCommand command);
}
