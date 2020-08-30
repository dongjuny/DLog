CREATE TABLE board(
    board_id INT PRIMARY KEY AUTO_INCREMENT,
    board_title VARCHAR(32) NOT NULL,
    board_contents VARCHAR(64)
                  ) ENGINE = innodb;