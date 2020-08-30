package com.dlog.repository;

import com.dlog.domain.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("dao")
public class BoardDAOImpl implements BoardDAO{

    @Autowired
    private BoardMapper mapper;

    @Override
    public void create(BoardVO boardVO) {
        mapper.create(boardVO);
    }

    public BoardVO read(String board_id) {
        BoardVO boardVO = mapper.read(board_id);
        return boardVO;
    }

    @Override
    public void update(BoardVO boardVO) {
        mapper.update(boardVO);
    }

    @Override
    public void delete(String board_id) {
        mapper.delete(board_id);
    }

    @Override
    public List<BoardVO> getList() {
        List<BoardVO> boardVOList = mapper.getList();
        return boardVOList;
    }
}
