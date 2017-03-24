package com.liu.web.action;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.liu.domain.Employee;
import com.liu.service.interfaces.EmployeeServiceInter;
import com.liu.web.forms.EmployeeForm;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {//DispatchAction

	private EmployeeServiceInter employeeServiceInter;
	public void setEmployeeServiceInter(EmployeeServiceInter employeeServiceInter) {
		
		System.out.println("setEmployeeServiceInter����������");
		this.employeeServiceInter = employeeServiceInter;
	}

	/**
	 * 登录
	 */
	public void login() throws Exception {
		
		
	}
	
}
