package com.dlog.repository;

import com.dlog.domain.BoardVO;

import java.util.List;

public interface BoardDAO {
    void create(BoardVO boardVO);
    BoardVO read(String board_id);
    void update(BoardVO boardVO);
    void delete(String board_id);
    List<BoardVO> getList();
}
