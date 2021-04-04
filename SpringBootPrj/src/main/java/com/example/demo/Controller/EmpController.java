package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;
import com.example.demo.dao.EmployeeRepo;
import com.example.demo.service.StudentService;

@RestController
public class EmpController 
{
	 
	@Autowired
	EmployeeRepo repo;
	@Autowired
	StudentService service;
@GetMapping(value="/employees",produces ="application/json")
public List<Employee> getEmployees()
{
	 return service.findEmployees();
	}
@PostMapping("/employee")
public Employee addEmployee(@RequestBody Employee e)
{
	
return repo.save(e);
	}
@PutMapping("/employee")
public Employee UpdateEmployee(@RequestBody Employee e)
{
	
return service.UpdateEmployee(e);
	}
@DeleteMapping("/Employee/{empid}")
public String deleteEmployee(@PathVariable int empid) 
{
	
	return "service.deleteEmployee(empid)";
}
@RequestMapping("/employee/{empid}")
public Optional<Employee> getEmployee1(@PathVariable("empid") int empid)
{
	 return service.getEmployee1(empid);
	}

}


