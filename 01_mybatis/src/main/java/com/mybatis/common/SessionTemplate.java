package com.mybatis.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionTemplate {
	//mybatis가 제공하는 SqlSession객체를 생성해주는 
	//static메소드를 가지고 있는 클래스. == JDBCTemplate과 동일
	//SqlSession객체를 생성해주는 메소드외에 선언할 것은 없다!
	public static SqlSession getSession() {
		//SqlSession객체를 생성하는 방법
		//1. SqlSessionFactoryBuilder 클래스를 생성
		//2. 설정파일인 mybatis-config.xml파일을 가져옴(InputStream)
		//3. SqlSessionFactoryBuilder의 build()메소드를 이용해서 SqlSesstionFactory를 생성
		//3. SqlSessionFactory의 openSession()메소드를 이용해서 SqlSession객체를 생성
		// openSession매개변수로 true/false(transaction처리에 대한 옵션)
		SqlSession session=null;
		try {
			SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
			String path="/mybatis-config.xml";
			//Resources클래스가 제공하는 static메소드인 getResouceAsStream()을 이용함
			InputStream is=Resources.getResourceAsStream(path);
			SqlSessionFactory factory=builder.build(is);
			session=factory.openSession(false);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return session;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
