//package com.h2.db.service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.h2.db.exception.RecordNotFoundException;
//import com.h2.db.model.Employee;
//import com.h2.db.model.repository.EmployeeRepository;
//
//
//@Service
//public class EmployeeService {
//	
//	@Autowired
//	EmployeeRepository repository;
//	
//	public List<Employee> getAllEmployees()
//	{
//		System.out.println("getAllEmployees");
//		List<Employee> result = (List<Employee>) repository.findAll();
//		
//		if(result.size() > 0) {
//			return result;
//		} else {
//			return new ArrayList<Employee>();
//		}
//	}
//
//	
//	public Employee getEmployeeById(Long employee_id) throws RecordNotFoundException 
//	{
//		System.out.println("getEmployeeById");
//		Optional<Employee> employee = repository.findById(employee_id);
//		
//		if(employee.isPresent()) {
//			return employee.get();
//		} else {
//			throw new RecordNotFoundException("No employee record exist for given id");
//		}
//	}
//	
//	public Employee createEmployee(Employee entity) 
//	{
//		System.out.println("createEmployee");
//		// Create new entry 
//		if(entity.getId()  == null) 
//		{
//			entity = repository.save(entity);
//			
//			return entity;
//		} 
//		else 
//		{
//			// update existing entry 
//			Optional<Employee> employee = repository.findById(entity.getId());
//			
//			if(employee.isPresent()) 
//			{
//				Employee newEntity = employee.get();
//				newEntity.setEmail(entity.getEmail());
//				newEntity.setFirstName(entity.getFirstName());
//				newEntity.setLastName(entity.getLastName());
//				newEntity = repository.save(newEntity);
//				
//				return newEntity;
//				
//			} else {
//				entity = repository.save(entity);
//				
//				return entity;
//			}
//		}
//	} 
//	
//	public Employee updateEmployee(Employee entity) 
//	{
//		System.out.println("updateEmployee");
//		// update existing entry 
//		Optional<Employee> employee = repository.findById(entity.getId());
//		
//		if(employee.isPresent()) 
//		{
//			Employee newEntity = employee.get();
//			newEntity.setEmail(entity.getEmail());
//			newEntity.setFirstName(entity.getFirstName());
//			newEntity.setLastName(entity.getLastName());
//			newEntity = repository.save(newEntity);
//			
//			return newEntity;
//			
//		} else {
//			entity = repository.save(entity);
//			
//			return entity;
//		}
//	}
//	
//	
//	public void deleteEmployeeById(Long employee_id) throws RecordNotFoundException 
//	{
//		System.out.println("deleteEmployeeById");
//		
//		Optional<Employee> employee = repository.findById(employee_id);
//		
//		if(employee.isPresent()) 
//		{
//			repository.deleteById(employee_id);
//		} else {
//			throw new RecordNotFoundException("No employee record exist for given id");
//		}
//	} 
//}

//package com.h2.db.service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.h2.db.exception.RecordNotFoundException;
//import com.h2.db.model.Employee;
//import com.h2.db.model.repository.EmployeeRepository;
//
//
//@Service
//public class EmployeeService {
//	
//	@Autowired
//	EmployeeRepository repository;
//	
//	public List<Employee> getAllEmployees()
//	{
//		System.out.println("getAllEmployees");
//		List<Employee> result = (List<Employee>) repository.findAll();
//		
//		if(result.size() > 0) {
//			return result;
//		} else {
//			return new ArrayList<Employee>();
//		}
//	}
//
//	
//	public Employee getEmployeeById(Long id) throws RecordNotFoundException 
//	{
//		System.out.println("getEmployeeById");
//		Optional<Employee> employee = repository.findById(id);
//		
//		if(employee.isPresent()) {
//			return employee.get();
//		} else {
//			throw new RecordNotFoundException("No employee record exist for given id");
//		}
//	}
//	
//	public Employee createOrUpdateEmployee(Employee entity) 
//	{
//		System.out.println("createOrUpdateEmployee");
//		// Create new entry 
//		if(entity.getId()  == null) 
//		{
//			entity = repository.save(entity);
//			
//			return entity;
//		} 
//		else 
//		{
//			// update existing entry 
//			Optional<Employee> employee = repository.findById(entity.getId());
//			
//			if(employee.isPresent()) 
//			{
//				Employee newEntity = employee.get();
//				newEntity.setEmail(entity.getEmail());
//				newEntity.setFirstName(entity.getFirstName());
//				newEntity.setLastName(entity.getLastName());
//
//				newEntity = repository.save(newEntity);
//				
//				return newEntity;
//			} else {
//				entity = repository.save(entity);
//				
//				return entity;
//			}
//		}
//	} 
//	
//	public void deleteEmployeeById(Long id) throws RecordNotFoundException 
//	{
//		System.out.println("deleteEmployeeById");
//		
//		Optional<Employee> employee = repository.findById(id);
//		
//		if(employee.isPresent()) 
//		{
//			repository.deleteById(id);
//		} else {
//			throw new RecordNotFoundException("No employee record exist for given id");
//		}
//	} 
//}