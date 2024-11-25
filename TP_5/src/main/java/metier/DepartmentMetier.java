package metier;

import models.Departement;
import models.Professor;

import java.util.List;

public interface DepartmentMetier {
    void addDDepartment(Departement departement);

    List<Departement> getAllDepartments();

    void deleteDepartment(int id);

    void editDepartment(int id, Departement departement);

    List<Professor> getProfessorsByDep(int id_department);
}
