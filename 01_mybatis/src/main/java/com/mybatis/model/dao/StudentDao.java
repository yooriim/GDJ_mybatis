package com.mybatis.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.vo.Student;

public class StudentDao {

	
	public int insertStudent(SqlSession session) {
		//mybatis를 이용해서 sql구문을 실행할때는 
		//session객체가 제공하는 메소드를 이용해서 실행함.
		//실행될 sql구문은 mapper로 등록되어있는 xml파일을 선택해서 실행.
		
		int result=session.insert("student.insertStudent");
		return result;
	}

	
	public int insertStudentName(SqlSession session, String name) {
		
		return session.insert("student.insertStudentName",name);
		
	}
	
	public int insertStudentInfo(SqlSession session,Student s) {
		return session.insert("student.insertStudentInfo",s);
	}
	
	public int updateStudent(SqlSession session,Student s) {
		return session.update("student.updateStudent",s);
	}
	
	//데이터를 조회하는 메소드는 2가지로 구분	
	//결과가 1행만 있는가 -> selectOne() 메소드 이용 - 한개 type(vo,int,String,...)
	//결과가 다수행인가 -> selectList() 메소드 이용 - List<T> (반환형이 무조건 리스트! 제네릭..어쩌구...ㅠ)
	
	public int selectStudentCount(SqlSession session) {
		//select count(*) from student	
		
		return session.selectOne("student.selectStudentCount");
	}
	
	public Student selectStudent(SqlSession session, int no) {
		
		return session.selectOne("student.selectStudent",no);
	}
	
	public List<Student> selectStudentAll(SqlSession session) {
		
		
		return session.selectList("student.selectStudentAll");
		
	}
	
	public List<Student> selectStudentName(SqlSession session,String name) {
		
		return session.selectList("student.selectStudentName",name);
		
	}
	
	public Map selectStudentMap(SqlSession session,int no) {
		
		return session.selectOne("student.selectStudentMap",no);
		
	}
	
	public List<Map> selectStudentAllMap(SqlSession session) {
		return session.selectList("student.selectStudentAllMap");
	}
	
	public List<Student> selectPageList(SqlSession session,int cPage, int numPerpage){
		//mybatis에서 페이징 처리하기
		//session.selectList
		//RowBounds클래스 이용하기
		//RowBounds클래스를 생성할 때 기준이 되는 값을 매개변수로 넣어주면 됨
		//2가지 값을 넣어줌
		//1. offset : 시작 row 번호 -> (cPage-1)*numPerpage
		//2. limit : 범위 -> numPerpage
		RowBounds rb=new RowBounds((cPage-1)*numPerpage,numPerpage);
		return session.selectList("student.selectPageList",null,rb); //매개변수는 정해져있는 만큼은꼭 넣어야됨 ㅠ 그래서 그냥 의미엇는 값으로 null 넣음 그럼 rbㄱ ㅏ출력되겟지 
		
		
	}
	
}
