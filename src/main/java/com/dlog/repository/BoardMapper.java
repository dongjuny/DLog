package com.dlog.repository;

import com.dlog.domain.BoardVO;
import com.dlog.repository.annotation.MyMapper;

import java.util.List;

@MyMapper
public interface BoardMapper {
    void create(BoardVO boardVO);
    BoardVO read(String board_id);
    void update(BoardVO boardVO);
    void delete(String board_id);
    List<BoardVO> getList();
}
