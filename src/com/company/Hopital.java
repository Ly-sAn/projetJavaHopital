package com.company;


import java.util.LinkedList;
import java.util.List;

public class Hopital {
    String nom;
    String adresse;
    String specialite;

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getSpecialite() {
        return specialite;
    }

    public Hopital(String nom, String adresse, String specialite) {
        this.nom = nom;
        this.adresse = adresse;
        this.specialite = specialite;
    }

}
