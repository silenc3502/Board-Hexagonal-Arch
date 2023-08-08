package com.example.demo.freeBoard.domain;

import com.example.demo.hexagon.freeBoard.domain.model.FreeBoardTitle;
import com.example.demo.hexagon.freeBoard.domain.model.FreeBoardWriter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("자유 게시판 게시물 작성자 테스트")
public class FreeBoardWriterTest {

    @DisplayName("writer가 주어진 제약 조건을 만족하는 경우 예외 없음")
    @Test
    void writer_제약조건_문제_없음 () {
        assertDoesNotThrow(() -> new FreeBoardWriter("Hexagonal Architecture"));
    }

    @DisplayName("writer가 null인 경우 IllegalArgumentException")
    @Test
    void writer_null이면_IllegalArgumentException () {
        assertThrows(IllegalArgumentException.class, () -> new FreeBoardWriter(null));
    }

    @DisplayName("writer가 empty인 경우 IllegalArgumentException")
    @Test
    void writer_empty_IllegalArgumentException () {
        assertThrows(IllegalArgumentException.class, () -> new FreeBoardWriter(""));
    }

    @DisplayName("writer가 whitespace인 경우 IllegalArgumentException")
    @Test
    void writer_whitespace_IllegalArgumentException () {
        assertThrows(IllegalArgumentException.class, () -> new FreeBoardWriter(("        ")));
    }
}
