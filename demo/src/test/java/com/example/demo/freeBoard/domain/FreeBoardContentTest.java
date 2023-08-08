package com.example.demo.freeBoard.domain;

import com.example.demo.hexagon.freeBoard.domain.model.FreeBoardContent;
import com.example.demo.hexagon.freeBoard.domain.model.FreeBoardWriter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("자유 게시판 게시물 내용 테스트")
public class FreeBoardContentTest {

    @DisplayName("content가 주어진 제약 조건을 만족하는 경우 예외 없음")
    @Test
    void content_제약조건_문제_없음 () {
        assertDoesNotThrow(() -> new FreeBoardContent("Hexagonal Architecture"));
    }

    @DisplayName("content가 null인 경우 IllegalArgumentException")
    @Test
    void content_null이면_IllegalArgumentException () {
        assertThrows(IllegalArgumentException.class, () -> new FreeBoardContent(null));
    }

    @DisplayName("content가 empty인 경우 IllegalArgumentException")
    @Test
    void content_empty_IllegalArgumentException () {
        assertThrows(IllegalArgumentException.class, () -> new FreeBoardContent(""));
    }

    @DisplayName("content가 whitespace인 경우 IllegalArgumentException")
    @Test
    void content_whitespace_IllegalArgumentException () {
        assertThrows(IllegalArgumentException.class, () -> new FreeBoardContent(("        ")));
    }
}
