package com.dlog.domain;

public class BoardVO {
    private String board_id;
    private String board_title;
    private String board_contents;
    private int board_cnt;

    public BoardVO(String board_id, String board_title, String board_contents) {
        this.board_id = board_id;
        this.board_title = board_title;
        this.board_contents = board_contents;
    }
    public String getBoard_id() {
        return board_id;
    }

    public String getBoard_context() {
        return board_contents;
    }

    public String getBoard_title() {
        return board_title;
    }

    public void setBoard_id(String board_id) {
        this.board_id = board_id;
    }

    public void setBoard_context(String board_context) {
        this.board_contents = board_context;
    }

    public void setBoard_title(String board_title) {
        this.board_title = board_title;
    }
}
