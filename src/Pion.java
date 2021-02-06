public class Pion {

    public enum Couleur {
        Rouge, Jaune, Vert, Cyan, Noir, Blanc;  
    }

    private Couleur couleur;

    public Pion(Couleur couleur){
        this.couleur = couleur;
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






    
}
