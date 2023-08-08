package com.example.demo.hexagon.freeBoard.application.port.out;

import com.example.demo.hexagon.freeBoard.domain.model.FreeBoard;

public interface StoreFreeBoardPort {
    void store (FreeBoard freeBoard);
}
