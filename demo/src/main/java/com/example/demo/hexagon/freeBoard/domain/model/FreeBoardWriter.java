package com.example.demo.hexagon.freeBoard.domain.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class FreeBoardWriter {
    private String writer;

    public FreeBoardWriter(String writer) {
        checkWriterValidation(writer);
        this.writer = writer;
    }

    private void checkWriterValidation (String writer) {
        if (writer == null) {
            throw new IllegalArgumentException("작성자는 null이 될 수 없습니다!");
        }

        if (writer.trim().isEmpty()) {
            throw new IllegalArgumentException("작성자를 입력해야 합니다!");
        }
    }
}
