package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.dao.EmployeeDao;
import com.durgasoft.dto.Employee;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/durgasoft/resource/aplicationContext.xml");
		EmployeeDao dao=(EmployeeDao) context.getBean("employeeDao");
		
		Employee emp= new Employee();
		emp.setEno(555);
		emp.setEname("dheeraj");
		emp.setEsal(65000);
		emp.setEaddr("proddatur");
		String Status = dao.add(emp);
		System.out.println(Status);
	}

}
