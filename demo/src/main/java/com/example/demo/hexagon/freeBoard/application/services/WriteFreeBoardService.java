package com.example.demo.hexagon.freeBoard.application.services;

import com.example.demo.hexagon.freeBoard.application.port.in.WriteFreeBoardCommand;
import com.example.demo.hexagon.freeBoard.application.port.in.WriteFreeBoardResult;
import com.example.demo.hexagon.freeBoard.application.port.in.WriteFreeBoardUseCase;
import com.example.demo.hexagon.freeBoard.application.port.out.StoreFreeBoardPort;
import com.example.demo.hexagon.freeBoard.domain.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class WriteFreeBoardService implements WriteFreeBoardUseCase {

    //private final LoadFreeBoardPort loadFreeBoardPort;
    private final StoreFreeBoardPort storeFreeBoardPort;

    @Override
    public WriteFreeBoardResult execute(WriteFreeBoardCommand command) {
        final FreeBoard newFreeBoard = FreeBoard.createNewFreeBoard(
                FreeBoardInfo.createFreeBoardInfo(
                        new FreeBoardTitle(command.getFreeBoardTitle()),
                        new FreeBoardWriter(command.getFreeBoardWriter()),
                        new FreeBoardContent(command.getFreeBoardContent())
                )
        );

        storeFreeBoardPort.store(newFreeBoard);

        return new WriteFreeBoardResult(
                newFreeBoard.getFreeBoardId().getId()
        );
    }
}
