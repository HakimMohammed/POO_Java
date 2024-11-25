package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements IMetier{
    @Override
    public void addProfessor(Professor p) {
        Connection connection = SingletonConnexionDB.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO Professors(nom,prenom,cin,addresse,telephone,email,date_recrutement) VALUES(?,?,?,?,?,?,?)");
            statement.setString(1, p.getNom());
            statement.setString(2, p.getPrenom());
            statement.setString(3, p.getCin());
            statement.setString(4, p.getAdresse());
            statement.setString(5, p.getTelephone());
            statement.setString(6, p.getEmail());
            statement.setDate(7, p.getDateRecruitment());
            statement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("couldn't insert a professor into the database", e);
        }
    }

    @Override
    public void deleteProfessor(int id) {
        System.out.println("Deleting user number "+id);
        Connection connection = SingletonConnexionDB.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM Professors WHERE id=?");
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("USer succefully Deleted");
        } catch (Exception e) {
            throw new RuntimeException("couldn't delete a professor from database", e);
        }
    }

    @Override
    public void updateProfessor(int id, Professor p) {
        Connection connection = SingletonConnexionDB.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE Professors SET nom=?,prenom=?,cin=?,addresse=?,telephone=?,email=?,date_recrutement=? WHERE id=?");
            statement.setString(1, p.getNom());
            statement.setString(2, p.getPrenom());
            statement.setString(3, p.getCin());
            statement.setString(4, p.getAdresse());
            statement.setString(5, p.getTelephone());
            statement.setString(6, p.getEmail());
            statement.setDate(7, p.getDateRecruitment());
            statement.setInt(8, id);
            statement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("couldn't update professor in database", e);
        }
    }

    @Override
    public void assignProfessorToDep(int id_professor, int id_department) {
        Connection connection = SingletonConnexionDB.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE Professors SET id_department=? WHERE id=?");
            statement.setInt(1,id_department);
            statement.setInt(2,id_professor);
            statement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("couldn't assign professor to department", e);
        }
    }

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

    @Override
    public List<Professor> getAllProfessors() {
        List<Professor> professors = new ArrayList<>();
        Connection connection = SingletonConnexionDB.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Professors");
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
            throw new RuntimeException("couldn't fetch professors from database", e);
        }
        return professors;
    }

    @Override
    public List<Professor> getProfessorsByKeyWord(String key) {
        List<Professor> professors = new ArrayList<>();
        Connection connection = SingletonConnexionDB.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Professors WHERE nom LIKE ? OR prenom LIKE ?");
            statement.setString(1,"%"+key+"%");
            statement.setString(2,"%"+key+"%");
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
            throw new RuntimeException("couldn't fetch professors by keyword from database", e);
        }
        return professors;
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
}
