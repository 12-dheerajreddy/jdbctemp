package com.durgasoft.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


import com.durgasoft.dto.Employee;
import com.durgasoft.mapper.EmployeeRowMapper;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		
		
	}
	

	@Override
	public String add(Employee emp) {
		String status="";
		try {
			List<Employee> emp1=jdbcTemplate.query("select * from emp1 where eno="+emp.getEno(), new EmployeeRowMapper());
			if(emp1.isEmpty()==true) {
			int rowcount=	jdbcTemplate.update("insert into emp1 values("+emp.getEno()+",'"+emp.getEname()+"',"+emp.getEsal()+",'"+emp.getEaddr()+"')");
			if(rowcount==1) {	
			status="employee inserted sucessfully";
			}
			else {
				status="employee Insertion failure";
			}
			}
			else {
				status="employee existed already";
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Employee search(int eno) {
		
		return null;
	}

	@Override
	public String update(Employee emp) {
	
		return null;
	}

	@Override
	public String delete(int eno) {
		
		return null;
	}

}
