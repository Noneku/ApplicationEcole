package com.afpa.www.gestionEleves;

import java.util.ArrayList;

public class Eleve {
    String nom;
    ArrayList<Integer> listeNotes;
    double moyenne;

    public Eleve(String nom, ArrayList<Integer> listeNotes, double moyenne) {
        this.nom = nom;
        this.listeNotes = listeNotes;
        this.moyenne = moyenne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Integer> getListeNotes() {
        return listeNotes;
    }

    public void setListeNotes(ArrayList<Integer> listeNotes) {
        this.listeNotes = listeNotes;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
}
