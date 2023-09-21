package models;

import java.util.ArrayList;

public class Salary {
    
    public double sumSalary(ArrayList<Employee> emplist) {
        double sum = 0;
        for(Employee emp : emplist) {
            sum = sum + emp.salary;
        }
        return sum;
    }
}
