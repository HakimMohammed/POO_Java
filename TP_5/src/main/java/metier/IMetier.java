package metier;

import java.util.List;

public interface IMetier {

    // Professor

    List<Professor> getAllProfessors();

    List<Professor> getProfessorsByKeyWord(String key);

    void addProfessor(Professor p);

    void deleteProfessor(int id);

    void updateProfessor(int id, Professor p);

    void assignProfessorToDep(int id_professor, int id_department);

    // Departments

    void addDDepartment(Departement departement);

    List<Departement> getAllDepartments();

    void deleteDepartment(int id);

    void editDepartment(int id, Departement departement);

    List<Professor> getProfessorsByDep(int id_department);
}
