package com.example.demo.hexagon.freeBoard.domain.model;

import com.example.demo.hexagon.freeBoard.application.port.in.UpdateFreeBoardCommand;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@ToString
public class FreeBoard {

    private final FreeBoardId freeBoardId;
    private final FreeBoardInfo freeBoardInfo;

    private final LocalDateTime createAt;
    private final LocalDateTime updateAt;

    public FreeBoard(FreeBoardId freeBoardId, FreeBoardInfo freeBoardInfo,
                     LocalDateTime createAt, LocalDateTime updateAt) {

        this.freeBoardId = freeBoardId;
        this.freeBoardInfo = freeBoardInfo;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public static FreeBoard createNewFreeBoard(FreeBoardInfo freeBoardInfo) {
        final LocalDateTime now = LocalDateTime.now();
        return new FreeBoard(new FreeBoardId(), freeBoardInfo, now, now);
    }

    public void update(UpdateFreeBoardCommand command) {
        freeBoardInfo.update(command);
    }
}
