package com.dlog.service;

import com.dlog.domain.BoardVO;
import com.dlog.repository.BoardDAO;
import com.dlog.repository.BoardDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service")
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardDAO dao;

    @Override
    public void create(BoardVO boardVO) {
        dao.create(boardVO);
    }

    public BoardVO read(String board_id) {
         BoardVO boardVO = dao.read(board_id);
         return boardVO;
    }

    @Override
    public void update(BoardVO boardVO) {
        dao.update(boardVO);
    }

    @Override
    public void delete(String board_id) {
        dao.delete(board_id);
    }

    @Override
    public List<BoardVO> getList() {
        List<BoardVO> list = dao.getList();
        return list;
    }
}
