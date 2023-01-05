package com.board.model.vo;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class Board {
	private int boardNo;
	private String boardTitle;
	private String boardWriter;
	private String boardContent;
	private String boarddOrginalFileName;
	private String boardRenamedFileName;
	private Date boardDate;
	private int boardReadCount;
	private List<BoardComment> comments;
}
