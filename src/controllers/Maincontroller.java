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

        new Salary().sumSalary(emplist);

    }
}
