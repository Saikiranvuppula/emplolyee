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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Employee;
import com.example.demo.dao.EmployeeRepo;

@RestController
public class EmpController 
{
	 
	@Autowired
	EmployeeRepo repo;
@GetMapping("/employees")
public List<Employee> getEmployees()
{
	 return repo.findAll();
	}
@PostMapping("/employee")
public Employee addEmployee(@RequestBody Employee e)
{
	repo.save(e);
return e;
	}
@PutMapping("/employee")
public Employee UpdateEmployee(@RequestBody Employee e)
{
	repo.save(e);
return e;
	}
@DeleteMapping("/Employee/{empid}")
public String deleteEmployee(@PathVariable int empid) 
{
	Employee e =repo.getOne(empid);
			repo.delete(e);
	return "removed";
}
@RequestMapping("/employee/{empid}")
public Optional<Employee> getEmployee1(@PathVariable("empid") int empid)
{
	 return repo.findById(empid);
	}

}


