package com.company;

public class Praticien {

    Aleatoire aleatoire = new Aleatoire();

    int numMatricule;
    private String nom;
    private String prenom;
    private String specialite;
    private String grade;
    private String hopital;
    private int tauxHoraire;
    private String fonction;

    public Praticien(int numMatricule, String nom, String prenom, String specialite, String grade, String hopital, int tauxHoraire, String fonction) {
        this.numMatricule = aleatoire.getNumMatricule();
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.grade = grade;
        this.hopital = hopital;
        this.tauxHoraire = aleatoire.getTauxHoraire();
        this.fonction = fonction;
    }


    public String getFonction() {
        return fonction;
    }

    public int getNumMatricule() {
        return numMatricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public String getGrade() {
        return grade;
    }

    public String getHopital() {
        return hopital;
    }

    public int getTauxHoraire() {
        return tauxHoraire;
    }

}
