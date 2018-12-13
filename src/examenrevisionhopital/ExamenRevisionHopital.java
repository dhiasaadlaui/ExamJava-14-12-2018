/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrevisionhopital;

/**
 *
 * @author wiemhjiri
 */
public class ExamenRevisionHopital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hopital razi = new Hopital();

        Medecin m1 = new Medecin(0, "Dhia", "Saadlaui", 200);
        Medecin m2 = new Medecin(500, "Amal", "Saadlaui", 200);
        Medecin m3 = new Medecin(600, "Khalil", "Saadlaui", 200);
        Medecin m4 = new Medecin(700, "Khawla", "Saadlaui", 200);
        
        Patient p1 = new Patient(22, "mohamed", "lotfi", 1212);
        Patient p2 = new Patient(55, "samir", "Saadlaui", 1);                        
        Patient p3 = new Patient(66, "mohamed", "ali", 1212);
        Patient p4 = new Patient(77, "Dhia", "Saadlaui", 1);
        
        razi.ajouterMedecin(m4);
        razi.ajouterMedecin(m1);
        razi.ajouterMedecin(m3);
        razi.ajouterMedecin(m2);
        
        razi.ajouterPatient(m1, p4);
        razi.ajouterPatient(m2, p1);
        razi.ajouterPatient(m2, p3);
        razi.ajouterPatient(m2, p2);
        
       // razi.afficherMap();
       // razi.afficherMedcinPatients(m2);
        System.out.println(razi.RetournerNomPatients());
    }

}
