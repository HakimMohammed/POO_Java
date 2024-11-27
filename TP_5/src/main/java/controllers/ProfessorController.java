package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import metier.ProfessorMetierImpl;
import models.Professor;

public class ProfessorController {
    private final ProfessorMetierImpl metier;

    public ProfessorController(ProfessorMetierImpl metier) {
        this.metier = metier;
    }

    public ObservableList<Professor> fetchAll() {
        return FXCollections.observableArrayList(metier.getAllProfessors());
    }

    public void delete(int id) {
        metier.deleteProfessor(id);
    }

    public void edit(int id, Professor professor) {
        metier.updateProfessor(id, professor);
    }
}
