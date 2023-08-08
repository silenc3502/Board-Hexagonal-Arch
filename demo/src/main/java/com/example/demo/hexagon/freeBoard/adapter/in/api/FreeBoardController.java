package com.example.demo.hexagon.freeBoard.adapter.in.api;

import com.example.demo.hexagon.freeBoard.application.port.in.WriteFreeBoardCommand;
import com.example.demo.hexagon.freeBoard.application.port.in.WriteFreeBoardResult;
import com.example.demo.hexagon.freeBoard.application.port.in.WriteFreeBoardUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/free-board")
public class FreeBoardController {

    private final WriteFreeBoardUseCase writeFreeBoardUseCase;

    @PostMapping("/write")
    public WriteFreeBoardResponse writeFreeBoard (@RequestBody FreeBoardWriteParameter parameter) {
        log.info("게시물 작성 요청: ", parameter);

        final WriteFreeBoardResult result = writeFreeBoardUseCase.execute(
                new WriteFreeBoardCommand(
                        parameter.getFreeBoardTitle(),
                        parameter.getFreeBoardWriter(),
                        parameter.getFreeBoardContent()
                )
        );

        return new WriteFreeBoardResponse(
                result.getFreeBoardId()
        );
    }

    @GetMapping("/test")
    public Boolean testController () {
        log.info("testController()");

        return true;
    }
}
