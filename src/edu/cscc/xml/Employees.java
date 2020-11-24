package edu.cscc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "Employees")
@XmlAccessorType(XmlAccessType.FIELD)

public class Employees implements Serializable {



        @XmlElement(name="Employee")
        private List<Employee> employee;

    public Employees(List<Employee> employee) {
        this.employee = employee;
    }

    public Employees() {
        this.employee = new ArrayList<>();
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public void addEmployee(Employee employee) {
        this.employee.add(employee);
    }

}
