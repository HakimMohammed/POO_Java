package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import metier.DepartmentMetierImpl;
import models.Departement;
import models.Professor;

public class DepartmentController {
    private final DepartmentMetierImpl metier;

    public DepartmentController(DepartmentMetierImpl metier) {
        this.metier = metier;
    }

    public ObservableList<Departement> fetchAll() {
        return FXCollections.observableArrayList(metier.getAllDepartments());
    }

    public void delete(int id){
        metier.deleteDepartment(id);
    }

    public void edit(int id, Departement departement){
        metier.editDepartment(id, departement);
    }

    public void create(Departement departement) {
        metier.addDDepartment(departement);
    }

    public ObservableList<Departement> search(String keyword) {
        return FXCollections.observableArrayList(metier.getAllDepartments());
    }
}
