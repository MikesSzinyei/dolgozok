package controllers;


import java.util.ArrayList;

import models.Employee;
import models.Filehandler;
import models.Salary;
import views.Mainconsole;

public class Maincontroller {
    public Maincontroller() {
        // new Mainconsole().welcome();
        ArrayList<Employee> emplist = new Filehandler().readFile();

        double sum = new Salary().sumSalary(emplist);
        new Mainconsole().showSalarySum(sum);

    }
}
