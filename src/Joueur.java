import java.util.List;

public class Joueur {

    Role role;

    public enum Role{
        chercheur,  codeur, ordinateur;
    }

    public Joueur(Role role){
        this.role = role;
    }

    public Pion.Couleur[] chooseLine(List<Ligne> proposition){
        Pion.Couleur[] listCouleur = new Pion.Couleur[Ligne.NB_TROUS_PAR_LINGE];

        if (role == Role.chercheur){
            listCouleur = Acquisition.acquiertCouleur();
        }
        else{
            for (int i = 0; i < listCouleur.length; i++) {
                listCouleur[i] = Pion.aleatoireCouleur(); 
            }
             
        }

        return listCouleur;

    }

}
