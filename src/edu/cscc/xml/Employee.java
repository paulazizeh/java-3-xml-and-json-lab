package edu.cscc.xml;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Employee")
@XmlAccessorType(XmlAccessType.FIELD)

public class Employee {
    @XmlAttribute(name = "id")
    private String employeeId;
    @XmlElement(name = "FirstName")
    private String firstName;
    @XmlElement(name = "LastName")
    private String lastName;
    @XmlElement(name = "PayRate")
    private double payRate;
    @XmlElement(name = "ActiveStore")
    private ActiveStore activeStore;


    public Employee(String employeeId, String firstName, String lastName, double payRate, ActiveStore activeStore) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.payRate = payRate;
        this.activeStore = activeStore;
    }

    public Employee() {

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public ActiveStore getActiveStore() {
        return activeStore;
    }

    public void setActiveStore(ActiveStore activeStore) {
        this.activeStore = activeStore;
    }

    }

