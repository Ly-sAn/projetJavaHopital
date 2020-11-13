package com.company;

public class Aleatoire {

    int numMatricule = (int)(Math.random() * (99999 - 10000 + 1) + 10000);
    int codeISN = (int)(Math.random() * (999999 - 100000 + 1) + 100000);
    int quantiteDispo = (int)(Math.random() * (100 - 1 + 1) + 1);
    int prix = (int)(Math.random() * (10 - 2 + 1) + 2);
    int tauxHoraire = (int)(Math.random() * (150 - 50 + 1) + 50);

    public int getCodeISN() {
        return codeISN;
    }

    public int getQuantiteDispo() {
        return quantiteDispo;
    }

    public int getPrix() {
        return prix;
    }

    public int getTauxHoraire() {
        return tauxHoraire;
    }


    public int getNumMatricule() {
        return numMatricule;
    }


}
