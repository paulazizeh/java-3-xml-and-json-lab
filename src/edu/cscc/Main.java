package edu.cscc;

import com.google.gson.Gson;
import edu.cscc.xml.Employee;
import edu.cscc.xml.Employees;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws JAXBException, IOException {
        String fileLocation = System.getProperty("user.dir") + File.separator + "employees.xml";
        System.out.println(fileLocation);
        JAXBContext context = JAXBContext.newInstance(Employees.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Employees employees = (Employees)unmarshaller.unmarshal(new File("employees.xml"));
        Employees invalidEmployees = new Employees();
        Employees validEmployees = new Employees();
        for (Employee employee : employees.getEmployee()) {
            if (!(employee.getEmployeeId().startsWith("2") && (employee.getEmployeeId().endsWith("A") || employee.getEmployeeId().endsWith("S") || employee.getEmployeeId().endsWith("M")))) {
                //employees.getEmployee().remove(employee);
                invalidEmployees.addEmployee(employee);
            }
            else {
                validEmployees.addEmployee(employee);
            }
        }
        Marshaller marshaller;
        marshaller = context.createMarshaller();
        marshaller.marshal(invalidEmployees, new File("invalidEmployees.xml"));

        Gson gson = new Gson();
        String json = gson.toJson(validEmployees);
        gson.fromJson(json, Employees.class);
        FileWriter fileWriter = new FileWriter("stores.json");
        fileWriter.write(json);
        fileWriter.close();

    }

}
