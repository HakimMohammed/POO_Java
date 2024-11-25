package metier;

import models.Professor;

import java.util.List;

public interface ProfessorMetier {
    List<Professor> getAllProfessors();

    List<Professor> getProfessorsByKeyWord(String key);

    void addProfessor(Professor p);

    void deleteProfessor(int id);

    void updateProfessor(int id, Professor p);

    void assignProfessorToDep(int id_professor, int id_department);
}
