package org.example;

import org.example.util.IHMEtudiant;
import org.example.util.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DatabaseManager.getConnection()) {
            if (connection != null) {
                System.out.println("Connexion réussie");
            }
            IHMEtudiant etudiantView = new IHMEtudiant(connection);
            etudiantView.menuPrincipal();
        } catch (SQLException e) {
            System.out.println("Erreur de connexion à la base de données: " + e.getMessage());
        }
    }
}