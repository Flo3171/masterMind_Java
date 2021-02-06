public class Evaluation {
    int nbBonneCouleur;
    int nbBienPlace;

    public Evaluation(int nbBonneCouleur, int nbBienPlace){
        this.nbBonneCouleur = nbBonneCouleur;
        this.nbBienPlace = nbBienPlace;
    }

    public String formate(){
        String retour;

        retour = nbBonneCouleur + " | " + nbBienPlace;

        return retour;
    }
}
