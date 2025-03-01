package Bibliotheque;

public class Bibliotheqe {
    public static void main(String[] args) {

        Livre livre1 = new Livre("Les mythes","Moussa","Lama",true);
        Livre livre2  = new Livre("Sous l'orage", "Seyidou Badian","Cam",true);
        livre1.afficherInfos();
        livre2.afficherInfos();

        Membre membre1 = new Membre("Livre1","123");
        membre1.emprunterLivre(livre1);
        membre1.emprunterLivre(livre2);
        membre1.afficherInfos();

        membre1.rendreLivre(livre1);
        membre1.rendreLivre(livre1);

        /*  livre1.setAuteur("Ochiba");
        livre1.setTitre("Royal");
        livre1.setIsbn("Ryan");
        livre1.setDisponible(false);
        livre1.afficherInfos();*/

    }
}
