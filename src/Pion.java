

public class Pion {

    public enum Couleur {
        Rouge, Jaune, Vert, Cyan, Noir, Blanc, Vide;  
    }

    private Couleur couleur;

    public Pion(Couleur couleur){
        this.couleur = couleur;
    }

    public Pion(){
        this.couleur = aleatoireCouleur();
    }

    public String formate(){
        switch (couleur) {
            case Rouge:
                return "Ro";
            case Jaune:
                return "Ja";
            case Vert:
                return "Ve";
            case Cyan:
                return "Cy";
            case Noir:
                return "No";
            case Blanc:
                return "Bl";
        
            default:
                return "     ";
        }
    }

    public boolean isEqualTo(Pion pion){
        if (couleur == pion.couleur){
            return true;
        }
        else{
            return false;
        }
    }

    public static Couleur aleatoireCouleur(){
        switch (Aleatoire.nbAleatoire(0, 5)) {
            case 0:
                return Couleur.Rouge;
            case 1:
                return Couleur.Jaune;
            case 2:
                return Couleur.Vert;
            case 3:
                return Couleur.Cyan;
            case 4:
                return Couleur.Noir;
            case 5:
                return Couleur.Blanc;

        
            default:
                return Couleur.Vide;
        }
    }

    






    
}
