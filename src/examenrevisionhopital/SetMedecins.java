/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrevisionhopital;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author wiemhjiri
 */
public class SetMedecins {
    private Set<Medecin> setM = new HashSet<>();

    public SetMedecins(){
    }

    public void ajouterMedecin(Medecin m) {
        if (setM.add(m))
            System.out.println("medecin ajouté avec succés");
        else
            System.out.println("Erreur d'ajout medecin , ce medecin existe deja");
    }

    public boolean rechercherMedecin(int cin) {
  return  setM.stream()
          .anyMatch(e-> e.getCin()==cin);
    }

    public void afficherMedecins() {
       setM.stream().forEach(e->{
           System.out.println(e);
       });
    }
    
    public long nombreMedecins(){
        return setM.stream().count();
   
    }
    
    public TreeSet<Medecin> trierMedecins(){
       return setM.stream()
               .collect(Collectors.toCollection(TreeSet::new));
        
    }
    
}
