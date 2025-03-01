package Bibliotheque;

public class LivreAcademique extends Livre{
    private String domaine;

    public LivreAcademique(String titre, String auteur, String isbn, boolean disponible, String domaine){
       // Appel du constructeur de la classe parent
        super(titre,auteur,isbn,disponible);
        this.domaine = domaine;
    }
// Redéfinition de la méthode afficherInfos de la classe parent
    @Override
    public void  afficherInfos(){
        System.out.println("Titre: "+ this.titre + "Auteur: "+ this.auteur+ "Isbn: "+ this.isbn + "Domaine: " + this.domaine);
    }
}
