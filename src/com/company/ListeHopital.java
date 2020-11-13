package com.company;

import java.util.LinkedList;
import java.util.List;

public class ListeHopital {
    private List<Hopital> listeHopital = new LinkedList<>();

    public ListeHopital() {

    }

    public void addMaternite(){
        listeHopital.add(new Hopital("Jeanne D'Arc", "3 rue Jean Moulin", "Maternité"));
    }

    public void addChirurgie(){
        listeHopital.add(new Hopital("Bogdanoff", "40 rue de Russie", "Chirurgie"));
    }

    public void addSport(){
        listeHopital.add(new Hopital("Coubertin", "192 rue de Paris", "Sport"));
    }

    public void addCardio(){
        listeHopital.add(new Hopital("Usain Bolt", "11 rue de Jamaïque", "Cardiologie"));
    }


    public void printHopital(){
        for (Hopital hopital : this.listeHopital){
        System.out.println( "Nom : " + hopital.getNom() + "\n" +
                "Adresse : " + hopital.getAdresse() + "\n" +
                "Spécialité : " + hopital.getSpecialite() );
        }
    }
}
