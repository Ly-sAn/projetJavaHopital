package com.company;

public class Medicament {

    Aleatoire aleatoire = new Aleatoire();
    DateNow dateNow = new DateNow();

    private int codeISN;
    private String nomenclature;
    private String description;
    private int quantiteDispo;
    private String datePrescription;
    private int prix;

    public Medicament(int codeISN, String nomenclature, String description, String quantiteDispo, String datePrescription, String prix) {
        this.codeISN = aleatoire.getCodeISN();
        this.nomenclature = nomenclature;
        this.description = description;
        this.quantiteDispo = aleatoire.getQuantiteDispo();
        this.datePrescription = dateNow.dateNow();
        this.prix = aleatoire.getPrix();
    }

    public int getCodeISN() {
        return codeISN;
    }

    public String getNomenclature() {
        return nomenclature;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantiteDispo() {
        return quantiteDispo;
    }

    public String getDatePrescription() {
        return datePrescription;
    }

    public int getPrix() {
        return prix;
    }

}
