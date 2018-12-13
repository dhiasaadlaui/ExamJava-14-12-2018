/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrevisionhopital;

import java.util.Objects;

/**
 *
 * @author wiemhjiri
 */
public class Medecin {
    private int cin;
    private String nom;
    private String prenom;
    private int numOrdre;

    public Medecin(int cin, String nom, String prenom, int numOrdre) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.numOrdre = numOrdre;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumOrdre() {
        return numOrdre;
    }

    @Override
    public String toString() {
        return "Medecin{" + "cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", numOrdre=" + numOrdre + '}' +"\n";
    }

    @Override
    public int hashCode() {
        return cin;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Medecin other = (Medecin) obj;
        if (this.cin != other.cin) {
            return false;
        }
        if (this.numOrdre != other.numOrdre) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        return true;
    }

  
    
 
   
 

}
