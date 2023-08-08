package com.example.demo.hexagon.freeBoard.adapter.out.jpa;

import com.example.demo.hexagon.freeBoard.application.port.out.StoreFreeBoardPort;
import com.example.demo.hexagon.freeBoard.domain.model.FreeBoard;
import com.example.demo.hexagon.freeBoard.domain.model.FreeBoardInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FreeBoardJpaAdapter implements StoreFreeBoardPort {

    private final FreeBoardRepository freeBoardRepository;

    @Override
    public void store(FreeBoard freeBoard) {

        final FreeBoardInfo freeBoardInfo = freeBoard.getFreeBoardInfo();
        final JpaFreeBoard jpaFreeBoard = new JpaFreeBoard(
                freeBoard.getFreeBoardId().getId(),
                freeBoardInfo.getFreeBoardTitle().getTitle(),
                freeBoardInfo.getFreeBoardWriter().getWriter(),
                freeBoardInfo.getFreeBoardContent().getContent()
        );

        freeBoardRepository.save(jpaFreeBoard);
    }
}
