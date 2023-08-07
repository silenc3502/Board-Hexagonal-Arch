package com.example.demo.hexagon.freeBoard.domain.model;

import com.example.demo.hexagon.freeBoard.application.port.in.UpdateFreeBoardCommand;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class FreeBoardInfo {

    private FreeBoardTitle freeBoardTitle;
    private final FreeBoardWriter freeBoardWriter;
    private FreeBoardContent freeBoardContent;

    public FreeBoardInfo(FreeBoardTitle freeBoardTitle, FreeBoardWriter freeBoardWriter, FreeBoardContent freeBoardContent) {
        this.freeBoardTitle = freeBoardTitle;
        this.freeBoardWriter = freeBoardWriter;
        this.freeBoardContent = freeBoardContent;
    }

    public static FreeBoardInfo createFreeBoardInfo(
            FreeBoardTitle freeBoardTitle, FreeBoardWriter freeBoardWriter, FreeBoardContent freeBoardContent) {

        return new FreeBoardInfo(freeBoardTitle, freeBoardWriter, freeBoardContent);
    }

    public void update(UpdateFreeBoardCommand command) {
        this.freeBoardTitle = freeBoardTitle.updateFreeBoardTitle(command.getFreeBoardTitle());
        this.freeBoardContent = freeBoardContent.updateFreeBoardContent(command.getFreeBoardContent());
    }
}
