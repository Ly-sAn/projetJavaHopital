package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    ListPraticien praticien = new ListPraticien();
    ListMedicament medicament = new ListMedicament();



   public void mainMenu()
    {

        boolean finished = false;

        System.out.println("============================");
        System.out.println("|     GROUPE LAUSPITAU     |");
        System.out.println("============================");
        System.out.println("| Options:                 |");
        System.out.println("|  1. Prise de RDV         |");
        System.out.println("|  2. Liste des Praticiens |");
        System.out.println("|  3. Exit                 |");
        System.out.println("============================");


        while (!finished){

            String input = sc.next();

            switch (input) {
                    case "1" -> {
                        finished = true;
                        menuRDV();
                    }
                    case "2" -> {
                        finished = true;
                        menuPraticien();
                    }
                    case "3" -> {
                        System.out.println("Vous quittez le programme");
                        System.exit(0);
                    }
                    default -> System.out.println("Mauvais choix, veuillez le saisir à nouveau");
                }
            }
    }

    public void menuRDV()
    {

        List<String> listePatient = new ArrayList<>();


        boolean finished = false;

        System.out.println("Bienvenue sur le système de prise de RDV");
        System.out.println("Veuillez entrer vos information");

        while (!finished) {
            System.out.println("Nom");
            String nom = sc.next();
            if (nom.matches("^([A-Z][a-zÀ-ÖØ-öø-ÿ]+)([- ][A-Z][a-zÀ-ÖØ-öø-ÿ]+)?$")) {
                break;
            } else {
                System.out.println("Veuillez resaisir votre nom");
            }
        }
        while (!finished) {
            System.out.println("Prenom");
            String prenom = sc.next();
            if (prenom.matches("^([A-Z][a-zÀ-ÖØ-öø-ÿ]+)([- ][A-Z][a-zÀ-ÖØ-öø-ÿ]+)?$")) {
                break;
            } else {
                System.out.println("Veuillez resaisir votre prénom");
            }
        }



    }

    public void menuPraticien()
    {

        boolean finished = false;
        System.out.println("Veuillez choisir votre spécialité :");
        System.out.println("\t" + "1 : Maternité");
        System.out.println("\t" + "2 : Sport");
        System.out.println("\t" + "3 : Cardiologie");
        System.out.println("\t" + "4 : Chirurgie");
        System.out.println("\t" + "5 : Retour au menu principal");


        while (!finished){

            String input = sc.next();

            switch (input) {
                case "1" -> {
                    finished = true;
                    praticien.addPraticienSageFemme();
                    praticien.addPraticienGyneco();
                    praticien.PrintPraticien();
                    medicament.addMedicamentGyneco();
                    medicament.PrintMedicament();
                }
                case "2" -> {
                    finished = true;
                    praticien.addPraticienKiné();
                    praticien.addPraticienPodologue();
                    praticien.PrintPraticien();
                }
                case "3" -> {
                    finished = true;
                    praticien.addPraticienCaridologue();
                    praticien.addPraticienPneumologue();
                    praticien.PrintPraticien();
                }
                case "4" ->{
                    finished = true;
                    praticien.addPraticienChirurgien();
                    praticien.addPraticienDermatologue();
                    praticien.PrintPraticien();
                }
                case "5" ->{
                    finished = true;
                }
                default -> System.out.println("Mauvais choix, veuillez le saisir à nouveau");
            }
        }

    }

    public Menu() {
       while (true){
           mainMenu();
       }
    }
}
