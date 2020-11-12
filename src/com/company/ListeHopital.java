package com.company;

import java.util.LinkedList;
import java.util.List;

public class ListeHopital {
    private List<Hopital> listeHopital = new LinkedList<>();

    public ListeHopital(List<Hopital> listeHopital) {
        this.listeHopital = listeHopital;
        this.listeHopital.add(new Hopital("Jeanne D'Arc", "3 rue Jean Moulin", "Maternité"));
    }

    public void printList(){


    }
}
