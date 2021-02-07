/*import Joueur.Role;*/


public class App {
    public static void main(String[] args) throws Exception {
        /*Pion.Couleur[] listCouleur = new Pion.Couleur[]{Pion.Couleur.Cyan, Pion.Couleur.Rouge, Pion.Couleur.Jaune, Pion.Couleur.Blanc};*/

        /*Ligne ligne = new Ligne(listCouleur);

        System.out.println(ligne.foramte());*/

        /*Pion pion = new Pion(Pion.Couleur.Blanc, 0);
        System.out.println(pion.formate());*/

        /*Plateau plateauJeu = new Plateau(listCouleur);

        listCouleur[0] = Pion.Couleur.Rouge;
        listCouleur[1] = Pion.Couleur.Cyan;
        listCouleur[2] = Pion.Couleur.Noir;
        listCouleur[3] = Pion.Couleur.Rouge;

        plateauJeu.addLigne(listCouleur);

        System.out.println(plateauJeu.formate(Joueur.Role.codeur)); 
        
        System.out.println(Acquisition.acquisitionSansMessage(2, 4));*/

        Joueur joueur = new Joueur(Joueur.Role.chercheur);
        partie(joueur);

        


    }

    static void partie(Joueur joueur){
        Plateau plateau = new Plateau(joueur);
        plateau.affiche(joueur);

        do {
            plateau.addLigne(joueur.chooseLine(plateau.proposition));
            plateau.affiche(joueur);
        } while (!plateau.finPartie());
        
        System.out.println(plateau.formateResultat(joueur));


    }

    
}
