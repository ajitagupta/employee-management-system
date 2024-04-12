package com.eb.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.eb.model.Employee;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
	/*
	 * Helper class that simplifies Hibernate data access code. HibernateTemplate
	 * contains all crud methods like SaveOrUpdate(),delete,update,LoadAll()
	 * 
	 * 
	 */
	private HibernateTemplate hTemplate;

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}


	@Override
	public Employee getEmployee(int id) {
		return hTemplate.get(Employee.class, id);

	}

	@Override
	public List<Employee> getAllEmployees() {
		return hTemplate.loadAll(Employee.class);

	}
	
	@Override
	@Transactional
	public void delete(int id) {
		Employee e = hTemplate.get(Employee.class, id);
		hTemplate.delete(e);
		
	}

	@Override
	@Transactional
	public int insert(Employee e) {
		return (int) hTemplate.save(e);
	}

	@Override
	@Transactional
	public void update(Employee e) {
		hTemplate.update(e);
		
	}
}