package edu.cscc.xml;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class EmployeeTest {

    private Employee employee;
    private ActiveStore activeStore;

    @BeforeEach
    void setUp() {
        activeStore = new ActiveStore("39458", "1234 Grove Ave", "Vernon", "KS", "87654");
        employee = new Employee("1234", "Ronald", "Michaels", 10.24, activeStore);

    }

    @Test
    void getEmployeeId() {
        assertEquals("1234", employee.getEmployeeId());
    }

    @Test
    void setEmployeeId() {
        employee.setEmployeeId("9876");
        assertEquals("9876", employee.getEmployeeId());
    }

    @Test
    void getFirstName() {
        assertEquals("Ronald", employee.getFirstName());
    }

    @Test
    void setFirstName() {
        employee.setFirstName("Steve");
        assertEquals("Steve", employee.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Michaels", employee.getLastName());
    }

    @Test
    void setLastName() {
        employee.setLastName("Walken");
        assertEquals("Walken", employee.getLastName());
    }

    @Test
    void getPayRate() {
        assertEquals(10.24, employee.getPayRate());
    }

    @Test
    void setPayRate() {
        employee.setPayRate(10.38);
        assertEquals(10.38, employee.getPayRate());
    }

    @Test
    void getActiveStore() {
        assertEquals(activeStore, employee.getActiveStore());
    }

   @Test
    void setActiveStore() {
        ActiveStore activeStore2 = new ActiveStore("52223", "9876 Pine St", "Washington", "IL", "88542");
        activeStore2.setStoreNumber("12345");
       employee.setActiveStore(activeStore2);
       assertEquals(activeStore2, employee.getActiveStore());
    }
}