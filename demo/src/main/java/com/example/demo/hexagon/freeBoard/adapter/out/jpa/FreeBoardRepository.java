package com.example.demo.hexagon.freeBoard.adapter.out.jpa;

import com.example.demo.hexagon.freeBoard.domain.model.FreeBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FreeBoardRepository extends JpaRepository<JpaFreeBoard, Long> {
}
