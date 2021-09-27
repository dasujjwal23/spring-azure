package com.example.springazure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springazure.dao.EmployeeDao;
import com.example.springazure.model.Employee;

@RestController
public class EmpController {

	  @Autowired
	  private EmployeeDao empdao;
	  
	  	  
	  @PostMapping("/employee")
	  public Employee postEmp(@RequestBody Employee emp)
	  {
	      return empdao.save(emp);
	  }
	  
	  @GetMapping("/employees")
	  public List<Employee> getEmp()
	  {
	     return empdao.findAll();
	  }
	  
	  @DeleteMapping("/delete/{id}")
	  public String deleteEmp(@PathVariable("id") int id)
	  {
		  empdao.deleteById(id);
		  return "This particular employee is deleted from your company's database";
		  
	  }
}
