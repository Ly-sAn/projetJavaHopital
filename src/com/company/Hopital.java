package com.company;


import java.util.LinkedList;
import java.util.List;

public class Hopital {
    String nom;
    String adresse;
    String specialite;
    List<String> listeHopital = new LinkedList<>();


    public Hopital(String nom, String adresse, String specialite) {
        this.nom = nom;
        this.adresse = adresse;
        this.specialite = specialite;
    }



}
