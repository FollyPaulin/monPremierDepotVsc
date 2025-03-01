package Bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Membre {
    // Les attributs de la classe membre
    private String nom;
    private String identifiant;
    private List<Livre> emprunts;
// Le constructeurs de la classe
    public Membre(String nom, String identifiant) {
        this.nom = nom;
        this.identifiant = identifiant;
        this.emprunts = new ArrayList<>();
    }
// Methode d'affichage des infos de la classe
    public void afficherInfos() {
        System.out.println("Nom: " + this.nom + "\n" + "Identifiant: " + this.identifiant);
        for (Livre livre : emprunts) {
            System.out.println(livre.getTitre());
        }
    }
// Méthode d'ajout de livre a la liste emprunts
    public void emprunterLivre(Livre livre) {
        if (livre.isDisponible()) {
            emprunts.add(livre);
            livre.setDisponible(false);
            System.out.println("Le livre: \" " + livre.getTitre() + "\" à été emprunter");
        } else {
            System.out.println("Le livre n'est pas disponible");
        }
    }

// Méthode de suppression de livre
    public void rendreLivre(Livre livre) {
        if (!livre.isDisponible()) {
            emprunts.remove(livre);
            livre.setDisponible(true);
            System.out.println("Le livre: \""+ livre.getTitre() + "\" à été rendu ");
        }
        else{
            System.out.println("Le livre est déjà disponible");
        }



    }
}