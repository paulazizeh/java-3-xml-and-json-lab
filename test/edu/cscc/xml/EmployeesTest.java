package edu.cscc.xml;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

class EmployeesTest {

    private Employees employees;


    @BeforeEach
    void setUp() {
        employees = new Employees();
    }

    @Test
    void getEmployee() {
        assertEquals(true, employees.getEmployee() != null);
    }

    @Test
    void setEmployee() {
        List list = new ArrayList<Employee>();
        Employee employee2 = new Employee();
        list.add(employee2);
        employees.setEmployee(list);
        assertEquals(list, employees.getEmployee());
    }

    @Test
    void addEmployee() {
        Employee employee3 = new Employee();
        employees.addEmployee(employee3);
        assertEquals(true, employees.getEmployee().contains(employee3));
    }
}