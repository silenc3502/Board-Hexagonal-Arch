package com.example.demo.hexagon.freeBoard.domain.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class FreeBoardTitle {

    private String title;

    public FreeBoardTitle(String title) {
        checkTitleValidation(title);
        this.title = title;
    }

    private void checkTitleValidation (String title) {
        if (title == null) {
            throw new IllegalArgumentException("제목은 null이 될 수 없습니다!");
        }

        if (title.trim().isEmpty()) {
            throw new IllegalArgumentException("제목을 입력해야 합니다!");
        }
    }

    public FreeBoardTitle updateFreeBoardTitle (String title) {
        checkTitleValidation(title);
        this.title = title;

        return this;
    }
}
