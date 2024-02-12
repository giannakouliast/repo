//package com.h2.db.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.h2.db.exception.RecordNotFoundException;
//import com.h2.db.model.Employee;
//import com.h2.db.service.EmployeeService;
//
//@Controller
//public class EmployeeController 
//{
//	@Autowired
//	EmployeeService service;
//
//	@GetMapping("/")
//	public String getAllEmployees(Model model) 
//	{	
//		System.out.println("getAllEmployees");
//		
//		List<Employee> list = service.getAllEmployees();
//
//		model.addAttribute("employees", list);
//		
//		return "list-employees";
//	}
//	
//	@RequestMapping(path = {"/edit", "/edit/{employee_id}"})
//	public String editEmployeeById(Model model, @PathVariable("employee_id") Optional<Long> employee_id) 
//							throws RecordNotFoundException 
//	{
//		
//		System.out.println("editEmployeeById" + employee_id);
//		if (employee_id.isPresent()) {
//			Employee entity = service.getEmployeeById(employee_id.get());
//			model.addAttribute("employee", entity);
//		} else {
//			model.addAttribute("employee", new Employee());
//		}
//		
//		
//		return "add-edit-employee";
//	}
//	
//	@RequestMapping(path = "/delete/{id}")
//	public String deleteEmployeeById(Model model, @PathVariable("employee_id") Long employee_id) 
//							throws RecordNotFoundException 
//	{
//		
//		System.out.println("deleteEmployeeById" + employee_id);
//		
//		service.deleteEmployeeById(employee_id);
//		return "redirect:/";
//	}
//
//	@RequestMapping(path = "/createEmployee", method = RequestMethod.POST)
//	public String createEmployee(Employee employee) 
//	{
//		System.out.println("createEmployee ");
//		
//		service.createEmployee(employee);
//		
//		return "redirect:/";
//	}
//	
//	@RequestMapping(path = "/updateEmployee", method = RequestMethod.POST)
//	public String updateEmployee(Employee employee) 
//	{
//		System.out.println("updateEmployee ");
//		
//		service.updateEmployee(employee);
//		
//		return "redirect:/";
//	}
//
//}
//package com.h2.db.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.h2.db.exception.RecordNotFoundException;
//import com.h2.db.model.Employee;
//import com.h2.db.service.EmployeeService;
//
//@Controller
//@RequestMapping("/")
//public class EmployeeController 
//{
//	@Autowired
//	EmployeeService service;
//
//	@RequestMapping
//	public String getAllEmployees(Model model) 
//	{	
//		System.out.println("getAllEmployees");
//		
//		List<Employee> list = service.getAllEmployees();
//
//		model.addAttribute("employees", list);
//		
//		return "list-employees";
//	}
//
//	
//	
//	
//	@RequestMapping(path = {"/edit", "/edit/{id}"})
//	public String editEmployeeById(Model model, @PathVariable("id") Optional<Long> id) 
//							throws RecordNotFoundException 
//	{
//		
//		System.out.println("editEmployeeById" + id);
//		if (id.isPresent()) {
//			Employee entity = service.getEmployeeById(id.get());
//			model.addAttribute("employee", entity);
//		} else {
//			model.addAttribute("employee", new Employee());
//		}
//		
//		
//		return "add-edit-employee";
//	}
//	
//	@RequestMapping(path = "/delete/{id}")
//	public String deleteEmployeeById(Model model, @PathVariable("id") Long id) 
//							throws RecordNotFoundException 
//	{
//		
//		System.out.println("deleteEmployeeById" + id);
//		
//		service.deleteEmployeeById(id);
//		return "redirect:/";
//	}
//
//	@RequestMapping(path = "/createEmployee", method = RequestMethod.POST)
//	public String createOrUpdateEmployee(Employee employee) 
//	{
//		System.out.println("createOrUpdateEmployee ");
//		
//		service.createOrUpdateEmployee(employee);
//		
//		return "redirect:/";
//	}
//}
