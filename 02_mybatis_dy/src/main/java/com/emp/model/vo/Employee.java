package com.emp.model.vo;

import java.sql.Date;

import lombok.Builder;
import lombok.Data;

@Data
public class Employee {
	private String empId;
	private String empName;
	private String empNo;
	private String email;
	private String phone;
//	private String deptCode;
	private Department dept;
	private String jobCode;
	private String salLevel;
	private int salary;
	private double bonus;
	private String managerId;
	private Date hireDate;
	private Date entDate;
	private char entYn;
	private String gender;
}
