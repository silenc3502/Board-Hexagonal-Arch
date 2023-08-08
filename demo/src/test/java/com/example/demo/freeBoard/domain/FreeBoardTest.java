package com.example.demo.freeBoard.domain;

import com.example.demo.hexagon.freeBoard.domain.model.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("자유 게시판 엔티티 테스트")
public class FreeBoardTest {

    @DisplayName("게시물 생성 규칙 테스트")
    @Test
    void 자유_게시판_생성_규칙_테스트 () {
        final String title = "제목";
        final String writer = "작성자";
        final String content = "내용";

        final FreeBoardInfo boardInfo = FreeBoardInfo.createFreeBoardInfo(
                new FreeBoardTitle(title),
                new FreeBoardWriter(writer),
                new FreeBoardContent(content)
        );

        final FreeBoard newFreeBoard = FreeBoard.createNewFreeBoard(boardInfo);
        final FreeBoardInfo info = newFreeBoard.getFreeBoardInfo();

        assertEquals(title, info.getFreeBoardTitle().getTitle());
        assertEquals(writer, info.getFreeBoardWriter().getWriter());
        assertEquals(content, info.getFreeBoardContent().getContent());
    }

}
