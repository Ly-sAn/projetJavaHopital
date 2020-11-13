package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListPraticien {

    private List<Praticien> praticienList = new ArrayList<>();

    public void ListPatricien() {


    }

    public void addPraticienGyneco() {
        praticienList.add(new Praticien(34354, "Dujardin", "Bernard", "Maternité", "Médecin", "Jeanne D'Arc", 150, "Gynécologue"));
    }

    public void addPraticienSageFemme() {
        praticienList.add(new Praticien(45673, "Dujardin", "Sophie", "Maternité", "Infirmière", "Jeanne D'Arc", 150, "Sage-Femme"));
    }

    public void addPraticienDermatologue() {
        praticienList.add(new Praticien(25786, "Dubois", "Leonard", "Chirurgie", "Médecin", "Bogdanoff", 150, "Dermatologue"));
    }

    public void addPraticienChirurgien() {
        praticienList.add(new Praticien(65543, "Dubois", "Sandrine", "Chirurgie", "Urgentiste", "Bogdanoff", 150, "Chirurgienne"));
    }

    public void addPraticienCaridologue() {
        praticienList.add(new Praticien(78008, "Lopez", "Patrick", "Cardiologie", "Médecin", "Usain Bolt", 150, "Cardiologue"));
    }

    public void addPraticienPneumologue() {
        praticienList.add(new Praticien(56432, "Lopez", "Béatrice", "Cardiologie", "Médecin", "Usain Bolt", 150, "Pneumologue"));
    }

    public void addPraticienKiné() {
        praticienList.add(new Praticien(89076, "Salmon", "Willy", "Sport", "Médecin", "Coubertin", 150, "Kiné"));
    }
    public void addPraticienPodologue() {
        praticienList.add(new Praticien(36562, "Salmon", "Zélie", "Sport", "Médecin", "Coubertin", 150, "Podologue"));
    }

    public void PrintPraticien() {
        System.out.println("Liste des Praticiens");
        for (Praticien praticien : this.praticienList) {
            System.out.println("\t" + "Numéro Matricule : " + praticien.getNumMatricule() + " Fonction : " + praticien.getFonction() + " Nom : " + praticien.getNom() + " Prenom : " + praticien.getPrenom() + " Spécialité : " + praticien.getSpecialite() + " Grade :  " + praticien.getGrade() + " Hôpital : " + praticien.getHopital() + " Taux horaire : " + praticien.getTauxHoraire());
        }
    }

    public List<Praticien> getPraticienList() {
        return praticienList;
    }

}
