package com.dlog.controller;

import com.dlog.domain.BoardVO;
import com.dlog.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller("controller")
public class boardController {

    @Autowired
    private BoardService service;

    @RequestMapping(value = "/create", method = RequestMethod.POST, headers = {"Content-type=application/json"})
    @ResponseBody
    public Map create(@PathVariable BoardVO boardVO) {
        service.create(boardVO);
        Map result = new HashMap();
        result.put("result", Boolean.TRUE);
        return result;
    }

    @RequestMapping(value = "/read/{board_id}", method = RequestMethod.GET)
    @ResponseBody
    public Map read(@PathVariable String board_id) {
        BoardVO boardVO = service.read(board_id);
        Map result = new HashMap();
        result.put("result", Boolean.TRUE);
        result.put("data", boardVO);
        return result;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, headers = {"Content-type=application/json"})
    @ResponseBody
    public Map update(@PathVariable BoardVO boardVO) {
        service.update(boardVO);
        Map result = new HashMap();
        result.put("result", Boolean.TRUE);
        return result;
    }

    @RequestMapping(value = "/delete/{board_id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Map delete(@PathVariable String board_id) {
        service.delete(board_id);
        Map result = new HashMap();
        result.put("result", Boolean.TRUE);
        return result;
    }


    @RequestMapping(value = "/getlist", method = RequestMethod.GET)
    @ResponseBody
    public Map getList() {
        List<BoardVO> boardVO = service.getList();
        Map result = new HashMap();
        result.put("result", Boolean.TRUE);
        result.put("data", boardVO);
        return result;
    }

}
