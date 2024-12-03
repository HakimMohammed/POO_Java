package Exercice_2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class DossierContact {

    File directory = new File("TP_6/src/Exercice_2/repertoire");

    void addContact(String name, String phone_number) {
        try {
            File file = new File(directory, name);
            FileWriter writer = new FileWriter(file);
            writer.write(phone_number);
            writer.close();
            System.out.println("Contact ajouté avec success");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void delContact(String name) {
        try {
            File file = new File(directory, name);
            file.delete();
            System.out.println("Contact supprimé avec success");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void getContactByName(String name) {
        try {
            File file = new File(directory, name);
            Scanner Reader = new Scanner(file);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void updateContact(String name, String phone_number) {
        try {
            File file = new File(directory, name);
            FileWriter writer = new FileWriter(file);
            writer.write(phone_number);
            writer.close();
            System.out.println("Contact modifié avec success");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
