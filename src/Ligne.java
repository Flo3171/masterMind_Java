/*import Pion.Couleur;*/

public class Ligne {
    
    final private int  NB_TROUS_PAR_LINGE = 4;
    private Pion[] trous;
    private Evaluation evaluation;

    public Ligne(Pion.Couleur[] couleur){
        this.trous = new Pion[NB_TROUS_PAR_LINGE];
        for (int i = 0; i < NB_TROUS_PAR_LINGE; i++) {
            this.trous[i] = new Pion(couleur[i]);
        }
        evaluation = new Evaluation(0, 0);
    }

    public Ligne(Pion.Couleur[] couleur, Ligne reference){
        this.trous = new Pion[NB_TROUS_PAR_LINGE];
        for (int i = 0; i < NB_TROUS_PAR_LINGE; i++) {
            this.trous[i] = new Pion(couleur[i]);
        }
        evaluation = new Evaluation(0, 0);
        this.evalue(reference);
    }

    public String foramte(boolean printEvaluation){
        String retour = "|";
        for (int i = 0; i < NB_TROUS_PAR_LINGE; i++) {
            retour = retour + " " + trous[i].formate() + " |";
        }
        if (printEvaluation){
            retour = retour + "| " + evaluation.formate() + " |";
        }
        return retour;
    }

    public void evalue(Ligne reference){
        evaluation.nbBienPlace = 0;
        evaluation.nbBonneCouleur = 0;
        for (int i = 0; i < NB_TROUS_PAR_LINGE; i++) {
            if (trous[i].isEqualTo(reference.trous[i])){
                evaluation.nbBienPlace ++;
            }
            else if(reference.searchPion(trous[i]) /*&& !this.searchPion(trous[i])*/){
                evaluation.nbBonneCouleur ++;
            }
        }
    }

    public boolean searchPion(Pion pion){
        for (int i = 0; i < NB_TROUS_PAR_LINGE; i++) {
            if (trous[i].isEqualTo(pion)){
                return true;
            }
        }
        return false;
    }
}
