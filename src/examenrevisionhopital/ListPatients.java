/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrevisionhopital;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author wiemhjiri
 */
public class ListPatients implements InterfacePatient{
    private List<Patient> listP = new ArrayList<>();

    public ListPatients(){
        
    }

    public List<Patient> getListP() {
        return listP;
    }

    @Override
    public void ajouterPatient(Patient p) {
       listP.add(p);
    }

    @Override
    public void supprimerPatient(Patient p) {
       listP.remove(p);
    }

/* Avec l'api stream */
    @Override
    public boolean rechercherPatient(Patient p) {
     return listP.stream().anyMatch(e-> e==p);
    }
    
/* Avec l'api stream */
    @Override
    public boolean rechercherPatient(int cin) {
           return listP.stream().anyMatch(e-> e.getCin()==cin);   
    }

    @Override
    public void afficherPatients() {
        listP.forEach(e->System.out.println(e));
    }
    
/* Avec lambda expression */
    @Override
    public void trierPatientsParNom() {
        listP.sort(Comparator.comparing(Patient::getNom));
    }
    
/* Avec l'api stream */
    public void PatientSansRedondance(){
               listP.stream()
                       .collect(Collectors.toSet())
                       .forEach((t) -> {
                       System.out.println(t);
                       });
                       ;
    }
    
    /*Méthode toString */

    @Override
    public String toString() {
    return listP.toString();
    }
    
    
}
