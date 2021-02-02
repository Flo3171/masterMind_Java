public class App {
    public static void main(String[] args) throws Exception {
        Pion.Couleur[] listCouleur = new Pion.Couleur[]{Pion.Couleur.Bleu, Pion.Couleur.Rouge, Pion.Couleur.Jaune, Pion.Couleur.Blanc};

        Ligne ligne = new Ligne(listCouleur);

        System.out.println(ligne.foramte());

        /*Pion pion = new Pion(Pion.Couleur.Blanc, 0);
        System.out.println(pion.formate());*/
    }
}
