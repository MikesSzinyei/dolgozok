package controllers;


import models.Filehandler;
import views.Mainconsole;

public class Maincontroller {
    public Maincontroller() {
        // new Mainconsole().welcome();
        new Filehandler().readFile();

    }
}
