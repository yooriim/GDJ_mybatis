package com.emp.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionTemplate {
	public static SqlSession getSession() {

		SqlSession session=null;
		try {
			
			String path="/mybatis-config.xml";
			InputStream is=Resources.getResourceAsStream(path);
			
//			SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
//			SqlSessionFactory factory=builder.build(is);
//			session=factory.openSession(false);
			session=new SqlSessionFactoryBuilder().build(is).openSession(false);
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		return session;
	}
	
	public static SqlSession getSessionWeb() {
		SqlSession session=null;
		try {
			
			String path="/mybatis-config.xml";
			InputStream is=Resources.getResourceAsStream(path);			
			//config에 enviroment id 적어주면 그걸로 접속함
			session=new SqlSessionFactoryBuilder().build(is,"web").openSession(false);
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		return session;
	}
}
