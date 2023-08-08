package com.example.demo.freeBoard.domain;

import com.example.demo.hexagon.freeBoard.domain.model.FreeBoardTitle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("자유 게시판 게시물 제목 테스트")
public class FreeBoardTitleTest {

    @DisplayName("title이 주어진 제약 조건을 만족하는 경우 예외 없음")
    @Test
    void title_제약조건_문제_없음 () {
        assertDoesNotThrow(() -> new FreeBoardTitle("Hexagonal Architecture"));
    }

    @DisplayName("title이 null인 경우 IllegalArgumentException")
    @Test
    void title_null이면_IllegalArgumentException () {
        assertThrows(IllegalArgumentException.class, () -> new FreeBoardTitle(null));
    }

    @DisplayName("title이 empty인 경우 IllegalArgumentException")
    @Test
    void title_empty_IllegalArgumentException () {
        assertThrows(IllegalArgumentException.class, () -> new FreeBoardTitle(""));
    }

    @DisplayName("title이 whitespace인 경우 IllegalArgumentException")
    @Test
    void title_whitespace_IllegalArgumentException () {
        assertThrows(IllegalArgumentException.class, () -> new FreeBoardTitle(("        ")));
    }
}
