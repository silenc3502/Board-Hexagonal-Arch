package com.example.demo.freeBoard.application.services;

import com.example.demo.hexagon.freeBoard.adapter.out.jpa.FreeBoardJpaAdapter;
import com.example.demo.hexagon.freeBoard.adapter.out.jpa.FreeBoardRepository;
import com.example.demo.hexagon.freeBoard.application.port.in.WriteFreeBoardCommand;
import com.example.demo.hexagon.freeBoard.application.services.WriteFreeBoardService;
import com.example.demo.hexagon.freeBoard.domain.model.FreeBoard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("FreeBoard 게시물 작성 Domain Service 테스트")
public class WriteFreeBoardServiceTest {

    WriteFreeBoardService writeFreeBoardService;
    FreeBoardRepository freeBoardRepository;

    @BeforeEach
    void beforeEach () {
        FreeBoardJpaAdapter jpaAdapter = new FreeBoardJpaAdapter(freeBoardRepository);
        writeFreeBoardService = new WriteFreeBoardService(jpaAdapter);
    }

    @DisplayName("게시물 작성")
    @Test
    void 게시물_작성 () {
        WriteFreeBoardCommand command = new WriteFreeBoardCommand(
                "title",
                "writer",
                "content"
        );

        writeFreeBoardService.execute(command);
    }
}
