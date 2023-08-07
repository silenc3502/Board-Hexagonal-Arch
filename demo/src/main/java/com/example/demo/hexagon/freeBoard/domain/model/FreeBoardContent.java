package com.example.demo.hexagon.freeBoard.domain.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class FreeBoardContent {

    private String content;

    public FreeBoardContent(String content) {
        checkContentValidation(content);
        this.content = content;
    }

    private void checkContentValidation (String content) {
        if (content == null) {
            throw new IllegalArgumentException("내용은 null이 될 수 없습니다!");
        }

        if (content.trim().isEmpty()) {
            throw new IllegalArgumentException("내용을 입력해야 합니다!");
        }
    }

    public FreeBoardContent updateFreeBoardContent (String content) {
        checkContentValidation(content);
        this.content = content;

        return this;
    }
}
