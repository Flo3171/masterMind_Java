import java.util.*; 

public class Plateau {
    Ligne reference;
    List<Ligne> proposition;
    final int NB_COUP_MAXI = 10;

    public Plateau(Pion.Couleur[] couleur){
        this.reference = new Ligne(couleur);
        this.proposition = new ArrayList<Ligne>();
    }

    public Plateau(Joueur joueur){
        if (joueur.role == Joueur.Role.codeur){
            System.out.println("Choisiser votre combinaison secrète");
            this.reference = new Ligne(Acquisition.acquiertCouleur());
        }
        else{
            this.reference = new Ligne();
        }
        
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

    public void affiche(Joueur joueur){
        System.out.println(formate(joueur.role));
    }

    public boolean finPartie(){
        return (proposition.size() >= NB_COUP_MAXI || proposition.get(proposition.size() - 1).isEqualTo(reference));
    }

    public String formateResultat(Joueur joueur){
        String retour;
        if (proposition.size() >= NB_COUP_MAXI) {
            if (joueur.role == Joueur.Role.chercheur) {
                retour = "Domange, vous avez perdu car vous n'avez pas trouvé la combinaision secrète après " + proposition.size() + " tentatives.";
            } else {
                retour = "Félicitation, vous avez gangé car votre adversaire n'a pas réussi à trouver la combinaison secrète après " + proposition.size() + " tentatives.";
            }
        } else {
            if (joueur.role == Joueur.Role.chercheur) {
                retour = "Félicitation, vous avez gangé, vous avez trouvé la bonne combinaision secrète après " + proposition.size() + " tentatives.";
            } else {
                retour = "Domage, vous avez perdu, votre adversaire à trouvé la bonne combinaision secrète après " + proposition.size() + " tentatives.";
            }
            
        }

        return retour;
    }



}
