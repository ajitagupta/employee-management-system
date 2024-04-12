package com.eb.app;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import com.eb.context.ContextProvider;

import com.eb.dao.EmployeeDao;
import com.eb.model.Employee;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext ctx = ContextProvider.provideContext();
		EmployeeDao employeeDao = ctx.getBean("epDao", EmployeeDao.class);

		Employee ss = new Employee();
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		do {
			System.out.println("press 1-Insert Student Data");
			System.out.println("press 2-Read All Student Data");
			System.out.println("press 3-Read Student Data By Id");
			System.out.println("press 4-Update Student Data");
			System.out.println("press 5-Delete Student Data");
			System.out.println("press 6-Exit");
			System.out.println("Enter choice:");
			choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Enter Student Id:");
				int id = sc.nextInt();
				System.out.println("Enter Student Name");
				String sname = sc.next();
				Employee s = new Employee(id, sname);
				employeeDao.insert(s);
				System.out.println("Data inserted sccessfully");
				break;

			case 2:
				employeeDao.getAllEmployees().forEach(System.out::println);
				break;

			case 3:
				System.out.println("Enter Id:");
				int id1 = sc.nextInt();
				employeeDao.getEmployee(id1);
				employeeDao.getAllEmployees().forEach(System.out::println);
				break;

			case 4:
				System.out.println("Enter name which u want to update:");
				String name = sc.next();
				System.out.println("Enter id");
				int id2 = sc.nextInt();
				ss.setName(name);
				ss.setId(id2);
				employeeDao.update(ss);
				System.out.println("Data updated successfully");
				break;

			case 5:
				System.out.println("Enter which id u want to delete:");
				id = sc.nextInt();
				employeeDao.delete(id);
				System.out.println("Id deleted successfully");
				break;

			case 6:
				System.out.println("Exit");
				break;

			default:
				System.out.println("Wrong choice");

			}
		} while (choice != 6);
	}

}
