import metier.DepartmentMetierImpl;
import metier.ProfessorMetierImpl;
import models.Departement;
import models.Professor;

import java.util.List;
import java.sql.Date;

public class Application {
    public static void main(String[] args) {
        ProfessorMetierImpl professorMetier = new ProfessorMetierImpl();
        DepartmentMetierImpl departmentMetier = new DepartmentMetierImpl();

        // addProfessor *5
        System.out.println(" adding new professors . . .\n");
        Professor professor1 = new Professor("Doe", "John", "AB123456", "123 Elm Street", "123-456-7890", "johndoe@example.com", new Date(System.currentTimeMillis()));
        professorMetier.addProfessor(professor1);

        Professor professor2 = new Professor("Smith", "Jane", "CD789012", "456 Oak Avenue", "987-654-3210", "janesmith@example.com", new Date(System.currentTimeMillis()));
        professorMetier.addProfessor(professor2);

        Professor professor3 = new Professor("Johnson", "Michael", "EF345678", "789 Maple Boulevard", "456-789-1234", "michaeljohnson@example.com", new Date(System.currentTimeMillis()));
        professorMetier.addProfessor(professor3);

        Professor professor4 = new Professor("Brown", "Emily", "GH901234", "321 Pine Drive", "654-321-0987", "emilybrown@example.com", new Date(System.currentTimeMillis()));
        professorMetier.addProfessor(professor4);

        Professor professor5 = new Professor("Taylor", "David", "IJ567890", "654 Cedar Lane", "789-123-4567", "davidtaylor@example.com", new Date(System.currentTimeMillis()));
        professorMetier.addProfessor(professor5);

        // getAllProfessors
        System.out.println(" fetching professors . . .");
        List<Professor> professors = professorMetier.getAllProfessors();
        for (Professor professor: professors) {
            System.out.println("\n");
            System.out.println("id: " + professor.getId());
            System.out.println("nom complet: " + professor.getPrenom() + " " + professor.getNom());
            System.out.println("cin: " + professor.getCin());
            System.out.println("address: " + professor.getAdresse());
            System.out.println("telephone: " + professor.getTelephone());
            System.out.println("email: " + professor.getEmail());
            System.out.println("recruitment date: " + professor.getDateRecruitment());
            System.out.println("department: " + professor.getIdDepartment());
            System.out.println("\n");
        }

        // updateProfessor
        System.out.println(" updating existing professor . . .");
        System.out.println("\n");
        int id_prof = 22;
        Professor updatedProfessor1 = new Professor("Doe", "John", "AB123456", "456 New Elm Street", "987-654-3210", "johndoe@example.com", new Date(System.currentTimeMillis()));
        professorMetier.updateProfessor(id_prof, updatedProfessor1);

        // deleteProfessor
        System.out.println(" deleting existing professor . . .");
        System.out.println("\n");
        professorMetier.deleteProfessor(24);

        // assignProfessorToDep
        System.out.println(" assigning department to a professor . . .");
        System.out.println("\n");
        int id_professor = 26;
        int id_department = 1;
        professorMetier.assignProfessorToDep(id_professor, id_department);

        // getAllProfessors
        System.out.println(" fetching professors after update and delete . . .");
        System.out.println("\n");
        List<Professor> listProfessors = professorMetier.getAllProfessors();
        for (Professor professor: listProfessors) {
            System.out.println("\n");
            System.out.println("id: " + professor.getId());
            System.out.println("nom complet: " + professor.getPrenom() + " " + professor.getNom());
            System.out.println("cin: " + professor.getCin());
            System.out.println("address: " + professor.getAdresse());
            System.out.println("telephone: " + professor.getTelephone());
            System.out.println("email: " + professor.getEmail());
            System.out.println("recruitment date: " + professor.getDateRecruitment());
            System.out.println("department: " + professor.getIdDepartment());System.out.println("\n");
        }

        // getProfessorsByKeyWord
        System.out.println(" fetching professors using keyword . . .");
        String keyword = "Doe";
        List<Professor> foundProfessors = professorMetier.getProfessorsByKeyWord(keyword);
        for(Professor professor: foundProfessors) {System.out.println("\n");
            System.out.println("id: " + professor.getId());
            System.out.println("nom complet: " + professor.getPrenom() + " " + professor.getNom());
            System.out.println("cin: " + professor.getCin());
            System.out.println("address: " + professor.getAdresse());
            System.out.println("telephone: " + professor.getTelephone());
            System.out.println("email: " + professor.getEmail());
            System.out.println("recruitment date: " + professor.getDateRecruitment());
            System.out.println("department: " + professor.getIdDepartment());System.out.println("\n");
        }

        // addDepartment *3
        System.out.println("\n");
        System.out.println(" adding new departments . . .");
        Departement dep1 = new Departement("Computer Science");
        departmentMetier.addDDepartment(dep1);

        Departement dep2 = new Departement("Mathematics");
        departmentMetier.addDDepartment(dep2);

        Departement dep3 = new Departement("Physics");
        departmentMetier.addDDepartment(dep3);


        // getAllDepartments
        System.out.println("\n");
        System.out.println(" fetching departments . . .");
        List<Departement> dep = departmentMetier.getAllDepartments();
        for (Departement d : dep) {
            System.out.println("\n");
            System.out.println("id: " + d.getId());
            System.out.println("nom: " + d.getNom());System.out.println("\n");
        }

        // deleteDepartment
        System.out.println("\n");
        System.out.println(" deleting department . . .");
        departmentMetier.deleteDepartment(3);

        // updateDepartment
        System.out.println("\n");
        System.out.println(" updating department . . .");
        int id_dep = 4;
        Departement updatedDepartment = new Departement("Mathematics & Physics");
        departmentMetier.editDepartment(id_dep, updatedDepartment);

        // getAllDepartments
        System.out.println("\n");
        System.out.println(" fetching departments . . .");
        List<Departement> deps = departmentMetier.getAllDepartments();
        for (Departement d : deps) {
            System.out.println("id: " + d.getId());
            System.out.println("nom: " + d.getNom());
        }

        // getProfessorsByDepartment
        System.out.println("\n");
        System.out.println(" fetching professors by department . . .");
        int id_depart = 1;
        List<Professor> professorList = departmentMetier.getProfessorsByDep(id_depart);
        for(Professor professor: professorList) {
            System.out.println("\n");
            System.out.println("id: " + professor.getId());
            System.out.println("nom complet: " + professor.getPrenom() + " " + professor.getNom());
            System.out.println("cin: " + professor.getCin());
            System.out.println("address: " + professor.getAdresse());
            System.out.println("telephone: " + professor.getTelephone());
            System.out.println("email: " + professor.getEmail());
            System.out.println("recruitment date: " + professor.getDateRecruitment());
            System.out.println("department: " + professor.getIdDepartment());System.out.println("\n");
        }
    }
}
