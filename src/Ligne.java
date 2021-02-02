public class Ligne {
    
    final private int  NB_TROUS_PAR_LINGE = 4;
    private Pion[] trous;
    private Evaluation evaluation;

    public Ligne(Pion.Couleur[] couleur){
        this.trous = new Pion[NB_TROUS_PAR_LINGE];
        for (int i = 0; i < couleur.length; i++) {
            this.trous[i] = new Pion(couleur[i]);
        }
        evaluation = new Evaluation(0, 0);
    }

    public String foramte(){
        String retour = " | ";
        for (int i = 0; i < NB_TROUS_PAR_LINGE; i++) {
            retour = retour + trous[i].formate() + " | ";
        }
        return retour;
    }
}
