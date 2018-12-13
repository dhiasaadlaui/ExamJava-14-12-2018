/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrevisionhopital;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *
 * @author wiemhjiri
 */
public class Hopital {

    public Map<Medecin, ListPatients> medecinPatiens = new TreeMap<>(Comparator.comparing(Medecin::getNom));

    public Hopital() {
    }

    public void ajouterMedecin(Medecin m) {

        medecinPatiens.putIfAbsent(m, new ListPatients());

    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (!medecinPatiens.containsKey(m)) {
            System.out.println("Medecin n'existe pas dans l'hopital");
        } else {
            medecinPatiens.get(m).ajouterPatient(p);
        }

    }

    /*Avec l'api stream */
    public void afficherMap() {

        /*First way*/
        System.out.println("************FIRST WAY************************************");
        medecinPatiens.entrySet().stream().forEach(e -> {

            System.out.println("---medecin----------------------------------------------");
            System.out.println(e.getKey());
            System.out.println("---Liste des Patients----------------------------------------------");
            e.getValue().afficherPatients();
        });
        /*Second Way */

//        System.out.println("************Second WAY************************************");
//
//        medecinPatiens.forEach((k, v) -> {
//            System.out.println("---medecin----------------------------------------------");
//            System.out.println(k);
//            System.out.println("---Liste des Patients----------------------------------------------");
//            v.afficherPatients();
//        });
    }

    /* Afficher les patients dont le nom est "mohamed" 
    qui appartiennent au medecin m passé en paramétre */
    public void afficherMedcinPatients(Medecin m) {
        if (!medecinPatiens.containsKey(m)) {
            System.out.println("Medecin n'existe pas dans l'hopital");
        } else {
            medecinPatiens
                    .get(m)
                    .getListP()
                    .stream()
                    .filter(e -> e.getNom().equals("mohamed"))
                    .forEach(System.out::println);
        }
    }

    /* Retourner les noms des patients dont le " numSecuriteSociale = 1" */
    public List<String> RetournerNomPatients() {

        List<String> names = new ArrayList<>();
        medecinPatiens
                .values()
                .stream()
                .forEach(e -> {
                    names.addAll(e.getListP()
                            .stream()
                            .filter(p -> p.getNumSecuriteSociale() == 1)
                            .map(Patient::getNom)
                            .collect(Collectors.toList()));
                });
        return names;
    }

}
