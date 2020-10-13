package Lab1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Carte carte = new Carte("Eminescu","Luceafarul",255,1974);
        System.out.println(carte);

        List<Carte> liste_carti = new ArrayList<Carte>();

        liste_carti.add(new Carte("Eminescu","Luceafarul",255,1974));
        liste_carti.add(new Carte("Bogdan","Departe de lume",300,2021));
        liste_carti.add(new Carte("Ana","Departe de Ion",144,1920));
        liste_carti.add(new Carte("Trump","Rasismul",1000,2022));
        System.out.println(liste_carti);

    }
}
