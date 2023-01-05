package com.emp.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.model.service.EmpService;
import com.emp.model.vo.Employee;

/**
 * Servlet implementation class searchEmp
 */
@WebServlet("/searchEmp.do")
public class searchEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String type=request.getParameter("type");
		String keyword=request.getParameter("keyword");			
//		char gender=request.getParameter("gender").charAt(0);
			
		Map<String,Object> param=new HashMap();
		param.put("type", type);
		param.put("keyword", keyword);
		param.put("gender", request.getParameter("gender"));
		try {
			param.put("salary", Integer.parseInt(request.getParameter("salary")));
			
		}catch(NumberFormatException e) {
			param.put("salary", 0);
			
		}
		
		//salary값 안넣고 넘어오면 에러뜨니까 try catch문으로 감싸거나 요렇게 쓰기 
		//param.put("salary", request.getParameter("salary")==null?"0":Integer.parseInt(request.getParameter("salary")));
		
		
		param.put("salFlag", request.getParameter("salFlag"));
		
		//yyyy-MM-dd
//		param.put("hireDate", request.getParameter("hireDate"));
		param.put("hireDate", request.getParameter("hiredate")==null?"":request.getParameter("hiredate").replace("-", "/")); //yyyy-MM-dd -> yyyy/MM/dd
		param.put("hireFlag", request.getParameter("hireFlag"));
		
		param.put("jobs", request.getParameterValues("job")); //param이 object랏 ㅓ암거나 다 먹을수잇음
		
		List<Employee> searchResult= new EmpService().searchEmp(param);
		
		//System.out.println(searchResult);
		
		request.setAttribute("employees", searchResult);
		request.getRequestDispatcher("/views/emp/empList.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
