package com.company;

public class Patient {
    int numSecu;
    String nom;
    String prenom;
    String adresse;
    String numTelephone;
    String courriel;

    public Patient(int numSecu, String nom, String prenom, String adresse, String numTelephone, String courriel) {
        this.numSecu = numSecu;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numTelephone = numTelephone;
        this.courriel = courriel;
    }

    public int getNumSecu() {
        return numSecu;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNumTelephone() {
        return numTelephone;
    }

    public String getCourriel() {
        return courriel;
    }
}
