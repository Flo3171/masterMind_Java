import java.util.*; 

public class Plateau {
    Ligne reference;
    List<Ligne> proposition;

    public Plateau(Pion.Couleur[] couleur){
        this.reference = new Ligne(couleur);
        this.proposition = new ArrayList<Ligne>();
    }

    public String formate(Joueur.Role role){
        String retour;
        retour = "\t JEU DE MASTER MIND \n\nCode secret :\n     ___________________\n    ";
        if (role == Joueur.Role.chercheur){
            retour = retour + "| Xx | Xx | Xx | Xx |";
        }
        else{
            retour = retour + reference.foramte(false);
        }

        retour = retour + "\n    |____|____|____|____|\n ________________________________\n|n° | A  | B  | C  | D  ||BC | BP|";

        for (int i = 0; i < proposition.size(); i++) {
            retour = retour + "\n| " + i + " " + proposition.get(i).foramte(true);
        }
        retour = retour + "\n|___|____|____|____|____||___|___|";

        return retour;
    }

    public void addLigne(Pion.Couleur[] couleur){
        proposition.add(new Ligne(couleur, reference));
    }



}
