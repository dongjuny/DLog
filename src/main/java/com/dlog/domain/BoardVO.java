package com.dlog.domain;

import org.codehaus.jackson.annotate.JsonCreator;

public class BoardVO {
    private int board_id;
    private String board_title;
    private String board_contents;

    public BoardVO(){
        super();
    }
    public BoardVO(int board_id, String board_title, String board_contents) {
        this.board_id = board_id;
        this.board_title = board_title;
        this.board_contents = board_contents;
    }

    @JsonCreator
    public BoardVO(String board_title, String board_contents) {
        this.board_title = board_title;
        this.board_contents = board_contents;
    }
    public int getBoard_id() {
        return board_id;
    }

    public String getBoard_title() {
        return board_title;
    }

    public String getBoard_contents() {
        return board_contents;
    }

    public void setBoard_id(int board_id) {
        this.board_id = board_id;
    }

    public void setBoard_title(String board_title) {
        this.board_title = board_title;
    }

    public void setBoard_contents(String board_contents) {
        this.board_contents = board_contents;
    }
}
