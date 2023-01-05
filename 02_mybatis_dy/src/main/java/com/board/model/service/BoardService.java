package com.board.model.service;

import org.apache.ibatis.session.SqlSession;
import static com.emp.common.SessionTemplate.getSessionWeb;

import com.board.model.dao.BoardDao;
import com.board.model.vo.Board;

public class BoardService {
	BoardDao dao=new BoardDao();
	
	public Board selectBoard(int boardNo) {
		SqlSession session=getSessionWeb();
		Board b=dao.selectBoard(session,boardNo);
		session.close();
		return b;
		
	}
}
