package com.project.spring.boot.project.Controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import com.project.spring.boot.project.EmployeeModel.Employee;
import com.project.spring.boot.project.Respository.EmployeeRepository;
import com.project.spring.boot.project.Service.EmployeeService;

@Controller
public class EmpController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
//display list of employees
	@GetMapping("/view")
	public ModelAndView passParametersWithModelAndView() {
//		java.util.List<Employee> employees = employeeRepository.findAll();
//		model.addAttribute("employees", employees);
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("listEmployees", employeeService.getAllEmployees());
		
		System.out.println("pooja");
		System.out.println(employeeService.getAllEmployees());
		
		return modelAndView;
	}
}
