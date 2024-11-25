package metier;

import java.util.List;
import java.sql.Date;

public class Application {
    public static void main(String[] args) {
        MetierImpl metier = new MetierImpl();

        // addProfessor *5
        System.out.println(" adding new professors . . .");
        Professor professor1 = new Professor("Doe", "John", "AB123456", "123 Elm Street", "123-456-7890", "johndoe@example.com", new Date(System.currentTimeMillis()));
        metier.addProfessor(professor1);

        Professor professor2 = new Professor("Smith", "Jane", "CD789012", "456 Oak Avenue", "987-654-3210", "janesmith@example.com", new Date(System.currentTimeMillis()));
        metier.addProfessor(professor2);

        Professor professor3 = new Professor("Johnson", "Michael", "EF345678", "789 Maple Boulevard", "456-789-1234", "michaeljohnson@example.com", new Date(System.currentTimeMillis()));
        metier.addProfessor(professor3);

        Professor professor4 = new Professor("Brown", "Emily", "GH901234", "321 Pine Drive", "654-321-0987", "emilybrown@example.com", new Date(System.currentTimeMillis()));
        metier.addProfessor(professor4);

        Professor professor5 = new Professor("Taylor", "David", "IJ567890", "654 Cedar Lane", "789-123-4567", "davidtaylor@example.com", new Date(System.currentTimeMillis()));
        metier.addProfessor(professor5);

        // getAllProfessors
        System.out.println(" fetching professors . . .");
        List<Professor> professors = metier.getAllProfessors();
        for (Professor professor: professors) {
            System.out.println("id: " + professor.getId());
            System.out.println("nom complet: " + professor.getPrenom() + " " + professor.getNom());
            System.out.println("cin: " + professor.getCin());
            System.out.println("address: " + professor.getAdresse());
            System.out.println("telephone: " + professor.getTelephone());
            System.out.println("email: " + professor.getEmail());
            System.out.println("recruitment date: " + professor.getDateRecruitment());
            System.out.println("department: " + professor.getIdDepartment());
        }

        // updateProfessor
        System.out.println(" updating existing professor . . .");
        int id_prof = 22;
        Professor updatedProfessor1 = new Professor("Doe", "John", "AB123456", "456 New Elm Street", "987-654-3210", "johndoe@example.com", new Date(System.currentTimeMillis()));
        metier.updateProfessor(id_prof, updatedProfessor1);

        // deleteProfessor
        System.out.println(" deleting existing professor . . .");
        metier.deleteProfessor(24);

        // assignProfessorToDep
        System.out.println(" assigning department to a professor . . .");
        int id_professor = 26;
        int id_department = 1;
        metier.assignProfessorToDep(id_professor, id_department);

        // getAllProfessors
        System.out.println(" fetching professors after update and delete . . .");
        List<Professor> listProfessors = metier.getAllProfessors();
        for (Professor professor: listProfessors) {
            System.out.println("id: " + professor.getId());
            System.out.println("nom complet: " + professor.getPrenom() + " " + professor.getNom());
            System.out.println("cin: " + professor.getCin());
            System.out.println("address: " + professor.getAdresse());
            System.out.println("telephone: " + professor.getTelephone());
            System.out.println("email: " + professor.getEmail());
            System.out.println("recruitment date: " + professor.getDateRecruitment());
            System.out.println("department: " + professor.getIdDepartment());
        }

        // getProfessorsByKeyWord
        System.out.println(" fetching professors using keyword . . .");
        String keyword = "Doe";
        List<Professor> foundProfessors = metier.getProfessorsByKeyWord(keyword);
        for(Professor professor: foundProfessors) {
            System.out.println("id: " + professor.getId());
            System.out.println("nom complet: " + professor.getPrenom() + " " + professor.getNom());
            System.out.println("cin: " + professor.getCin());
            System.out.println("address: " + professor.getAdresse());
            System.out.println("telephone: " + professor.getTelephone());
            System.out.println("email: " + professor.getEmail());
            System.out.println("recruitment date: " + professor.getDateRecruitment());
            System.out.println("department: " + professor.getIdDepartment());
        }

        // addDepartment *3
        System.out.println(" adding new departments . . .");
        Departement dep1 = new Departement("Computer Science");
        metier.addDDepartment(dep1);

        Departement dep2 = new Departement("Mathematics");
        metier.addDDepartment(dep2);

        Departement dep3 = new Departement("Physics");
        metier.addDDepartment(dep3);


        // getAllDepartments
        System.out.println(" fetching departments . . .");
        List<Departement> dep = metier.getAllDepartments();
        for (Departement d : dep) {
            System.out.println("id: " + d.getId());
            System.out.println("nom: " + d.getNom());
        }

        // deleteDepartment
        System.out.println(" deleting department . . .");
        metier.deleteDepartment(3);

        // updateDepartment
        System.out.println(" updating department . . .");
        int id_dep = 4;
        Departement updatedDepartment = new Departement("Mathematics & Physics");
        metier.editDepartment(id_dep, updatedDepartment);

        // getAllDepartments
        System.out.println(" fetching departments . . .");
        List<Departement> deps = metier.getAllDepartments();
        for (Departement d : deps) {
            System.out.println("id: " + d.getId());
            System.out.println("nom: " + d.getNom());
        }

        // getProfessorsByDepartment
        System.out.println(" fetching professors by department . . .");
        int id_depart = 1;
        List<Professor> professorList = metier.getProfessorsByDep(id_depart);
        for(Professor professor: professorList) {
            System.out.println("id: " + professor.getId());
            System.out.println("nom complet: " + professor.getPrenom() + " " + professor.getNom());
            System.out.println("cin: " + professor.getCin());
            System.out.println("address: " + professor.getAdresse());
            System.out.println("telephone: " + professor.getTelephone());
            System.out.println("email: " + professor.getEmail());
            System.out.println("recruitment date: " + professor.getDateRecruitment());
            System.out.println("department: " + professor.getIdDepartment());
        }
    }
}
