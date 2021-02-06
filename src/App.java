public class App {
    public static void main(String[] args) throws Exception {
        Pion.Couleur[] listCouleur = new Pion.Couleur[]{Pion.Couleur.Cyan, Pion.Couleur.Rouge, Pion.Couleur.Jaune, Pion.Couleur.Blanc};

        /*Ligne ligne = new Ligne(listCouleur);

        System.out.println(ligne.foramte());*/

        /*Pion pion = new Pion(Pion.Couleur.Blanc, 0);
        System.out.println(pion.formate());*/

        Plateau plateauJeu = new Plateau(listCouleur);

        listCouleur[0] = Pion.Couleur.Rouge;
        listCouleur[1] = Pion.Couleur.Cyan;
        listCouleur[2] = Pion.Couleur.Noir;
        listCouleur[3] = Pion.Couleur.Rouge;

        plateauJeu.addLigne(listCouleur);

        System.out.println(plateauJeu.formate(Joueur.Role.codeur)); 


    }
}
