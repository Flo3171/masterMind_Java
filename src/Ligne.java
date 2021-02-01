public class Ligne {
    
    final private int  NB_TROUS_PAR_LINGE = 4;
    private Pion[] trous;
    private int ligne;

    public Ligne(Pion.Couleur[] couleur, int ligne){
        this.trous = new Pion[NB_TROUS_PAR_LINGE];
        for (int i = 0; i < couleur.length; i++) {
            this.trous[i] = new Pion(couleur[i], i);
        }
        this.ligne = ligne;
    }

    public String foramte(){
        String retour = "n°" + ligne + " | ";
        for (int i = 0; i < NB_TROUS_PAR_LINGE; i++) {
            retour = retour + trous[i].formate() + " | ";
        }
        return retour;
    }
}
