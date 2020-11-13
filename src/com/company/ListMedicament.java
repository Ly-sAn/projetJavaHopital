package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListMedicament {

    private List<Medicament> medicamentList = new ArrayList<>();

    public void addMedicamentGyneco() {
        medicamentList.add(new Medicament(1, "Alpagelle","Crème vaginale","40", "13/11/2020", "3,50"));
        medicamentList.add(new Medicament(1, "Pharmatex","Mini-ovule","30", "13/11/2020", "5,20"));
        medicamentList.add(new Medicament(1, "Salbumol","Solution injectable","50", "13/11/2020", "2.45"));
        medicamentList.add(new Medicament(1, "Carbégoline","Comprimé","30", "13/11/2020", "6.49"));
    }

    public void addMedicamentSageFemme() {
        medicamentList.add(new Medicament(1, "Cimipax","Comprimé pélliculé","34", "13/11/2020", "7.4"));
        medicamentList.add(new Medicament(1, "Atobisan","Solution à diluer pour perfusion","67", "13/11/2020", "1.43"));
        medicamentList.add(new Medicament(1, "Nife-par","Solution buvable","43", "13/11/2020", "8.67"));
        medicamentList.add(new Medicament(1, "Scoburen","Injectable","65", "13/11/2020", "9.75"));
    }

    public void addMedicamentDermatologue() {
        medicamentList.add(new Medicament(1, "Mycohydralin","Crème","34", "13/11/2020", "4.56"));
        medicamentList.add(new Medicament(1, "Darkatin","Gel","65", "13/11/2020", "7.65"));
        medicamentList.add(new Medicament(1, "Ecanazole","Poudre","45", "13/11/2020", "2.34"));
        medicamentList.add(new Medicament(1, "Micoapaysil","Solution","76", "13/11/2020", "8.65"));
    }

    public void addMedicamentChirurgienne() {
        medicamentList.add(new Medicament(1, "Morphine","Anti-Douleur","12", "13/11/2020", "5.67"));
        medicamentList.add(new Medicament(1, "Buprénorphine","Anti-Douleur","23", "13/11/2020", "8.65"));
        medicamentList.add(new Medicament(1, "Fentanyl","Anti-Douleur","456", "13/11/2020", "9.54"));
        medicamentList.add(new Medicament(1, "Oxycodone","Anti-Douleur","754", "13/11/2020", "3.45"));
    }

    public void addMedicamentCardiologue() {
        medicamentList.add(new Medicament(1, "Anticoagulants","Coeur","342", "13/11/2020", "5.6"));
        medicamentList.add(new Medicament(1, "Antiarythmiques","Coeur","1234", "13/11/2020", "5.3"));
        medicamentList.add(new Medicament(1, "Bêtabloquants","Coeur","234", "13/11/2020", "7.3"));
        medicamentList.add(new Medicament(1, "Antiplaquettaires","Coeur","543", "13/11/2020", "6.54"));
    }

    public void addMedicamentPneumologue() {
        medicamentList.add(new Medicament(1, "Lidocaïne","Pneumologie","234", "13/11/2020", "5.6"));
        medicamentList.add(new Medicament(1, "Ibuprofène","Pneumologie","654", "13/11/2020", "76.5"));
        medicamentList.add(new Medicament(1, "Triamcinolone","Pneumologie","435", "13/11/2020", "54.6"));
        medicamentList.add(new Medicament(1, "Landiolol","Pneumologie","765", "13/11/2020", "54.5"));
    }

    public void addMedicamentKiné() {
        medicamentList.add(new Medicament(1, "Huile","Huile de massage","54", "13/11/2020", "5.7"));
        medicamentList.add(new Medicament(1, "Gel","Anti-Douleur","76", "13/11/2020", "5.4"));
        medicamentList.add(new Medicament(1, "Crème","Douleur","322", "13/11/2020", "8.76"));
        medicamentList.add(new Medicament(1, "Gel","Anti-Douleur","34", "13/11/2020", "9.76"));
    }

    public void addMedicamentPodologue() {
        medicamentList.add(new Medicament(1, "Crème","Pour verrue","332", "13/11/2020", "34.5"));
        medicamentList.add(new Medicament(1, "Gel","Ongle Incarné","3434", "13/11/2020", "346.54"));
        medicamentList.add(new Medicament(1, "Crème","Mycose","445", "13/11/2020", "23.45"));
        medicamentList.add(new Medicament(1, "Gel","Soins","32", "13/11/2020", "3.45"));
    }

    public void PrintMedicament() {
        System.out.println("Liste des médicaments");
        for (Medicament medicaments : this.medicamentList) {
            System.out.println("\t" + " Nom : "+  medicaments.getNomenclature() + " Quantité disponible : " + medicaments.getQuantiteDispo() + " Description : " + medicaments.getDescription() + " Prix :  " + medicaments.getPrix() + " Date de Prescription : " + medicaments.getDatePrescription() + " Code ISN : " + medicaments.getCodeISN());
        }
    }

    public List<Medicament> getMedicamentList() {
        return medicamentList;
    }


}
