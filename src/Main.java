

public class Main {
    public static void main(String[] args){
        Pion.Couleur[] listCouleur = new Pion.Couleur[]{Pion.Couleur.Bleu, Pion.Couleur.Rouge, Pion.Couleur.Jaune, Pion.Couleur.Blanc};

        Ligne ligne = new Ligne(listCouleur, 0);

        System.out.println(ligne.foramte());

        /*Pion pion = new Pion(Pion.Couleur.Blanc, 0);
        System.out.println(pion.formate());*/

    }
    
}
