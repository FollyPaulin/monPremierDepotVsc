package Bibliotheque;

public class Livre {
// Declaration des attributs
    protected String titre;
    protected String auteur;
    protected String isbn;
    protected boolean disponible;
// Le constructeur de la classe
    public Livre(String titre, String auteur, String isbn, boolean disponible){
        this.auteur = auteur;
        this.titre = titre;
        this.isbn = isbn;
        this.disponible = disponible;
    }
// Les setters pour modifier les valeurs
    public String getTitre(){
        return this.titre;
    }
    public String getAuteur(){
        return this.auteur;
    }
    public String getIsbn(){
        return this.isbn;
    }
    // Les getters pour acceder aux valeurs
    public void setTitre(String titre){
        this.titre = titre;
    }
    public void setAuteur(String auteur){
        this.auteur = auteur;
    }
    public void setIsbn(String isbn){
        if(isbn.length() == 3){
            this.isbn= isbn;
        }
        else {
            this.isbn = null;
        }
        }
    public boolean isDisponible(){
        return this.disponible;
    }
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
// Methode d'affichage des informations
    public void afficherInfos(){
        System.out.println("Titre: " + this.titre + "\n"+"Auteur: "+this.auteur
        + "\n"+ "Isbn: "+this.isbn+ "\n"+"Disponible: "+ this.disponible);
    }
}


