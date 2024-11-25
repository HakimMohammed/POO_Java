package metier;

import database.SingletonConnexionDB;
import models.Departement;
import models.Professor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DepartmentMetierImpl implements DepartmentMetier{
    @Override
    public void addDDepartment(Departement departement) {
        Connection connection = SingletonConnexionDB.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO Departments(nom) VALUES(?)");
            statement.setString(1,departement.getNom());
            statement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("couldn't create a new department in database", e);
        }
    }

    @Override
    public List<Departement> getAllDepartments() {
        Connection conn = SingletonConnexionDB.getConnection();
        List<Departement> departments = new ArrayList<>();
        try {
            PreparedStatement statement = conn.prepareStatement("SELECT * FROM Departments");
            ResultSet res = statement.executeQuery();
            while (res.next()) {
                Departement d = new Departement(res.getInt("id"), res.getString("nom"));
                departments.add(d);
            }
        }catch (Exception e) {
            throw new RuntimeException("couldn't fetch departments from database", e);
        }
        return departments;
    }

    @Override
    public void deleteDepartment(int id) {
        Connection connection = SingletonConnexionDB.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM Departments WHERE id=?");
            statement.setInt(1,id);
            statement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("couldn't delete a department from database", e);
        }
    }

    @Override
    public void editDepartment(int id, Departement departement) {
        Connection connection = SingletonConnexionDB.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE Departments SET nom=? WHERE id=?");
            statement.setString(1,departement.getNom());
            statement.setInt(2,id);
            statement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("couldn't update a department in datavase", e);
        }
    }

    @Override
    public List<Professor> getProfessorsByDep(int id_department) {
        List<Professor> professors = new ArrayList<>();
        Connection connection = SingletonConnexionDB.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Professors WHERE id_department=?");
            statement.setInt(1,id_department);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                if( resultSet.getInt("id_department") == 0) {
                    Professor professor = new Professor(
                            resultSet.getInt("id"),
                            resultSet.getString("nom"),
                            resultSet.getString("prenom"),
                            resultSet.getString("cin"),
                            resultSet.getString("addresse"),
                            resultSet.getString("telephone"),
                            resultSet.getString("email"),
                            resultSet.getDate("date_recrutement")
                    );
                    professors.add(professor);
                } else {
                    Professor professor = new Professor(
                            resultSet.getInt("id"),
                            resultSet.getString("nom"),
                            resultSet.getString("prenom"),
                            resultSet.getString("cin"),
                            resultSet.getString("addresse"),
                            resultSet.getString("telephone"),
                            resultSet.getString("email"),
                            resultSet.getDate("date_recrutement"),
                            resultSet.getInt("id_department")
                    );
                    professors.add(professor);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("couldn't fetch professors by departments from database", e);
        }
        return professors;
    }
}
