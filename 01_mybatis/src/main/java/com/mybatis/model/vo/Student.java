package com.mybatis.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Student {
	private int no;
	private String name;
	private String tel;
	private String email;
	private String addr;
	private Date reg_date;
}
