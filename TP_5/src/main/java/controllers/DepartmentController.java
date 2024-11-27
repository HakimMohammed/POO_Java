package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import metier.DepartmentMetierImpl;
import models.Departement;

public class DepartmentController {
    private final DepartmentMetierImpl metier;

    public DepartmentController(DepartmentMetierImpl metier) {
        this.metier = metier;
    }

    public ObservableList<Departement> fetchAll() {
        return FXCollections.observableArrayList(metier.getAllDepartments());
    }
}
