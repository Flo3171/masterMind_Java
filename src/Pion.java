public class Pion {

    public enum Couleur {
        Rouge, Jaune, Vert, Bleu, Noir, Blanc;  
    }

    private Couleur couleur;

    public Pion(Couleur couleur){
        this.couleur = couleur;
    }

    public String formate(){
        switch (couleur) {
            case Rouge:
                return "ROUGE";
            case Jaune:
                return "JAUNE";
            case Vert:
                return "VERT ";
            case Bleu:
                return "BLEU ";
            case Noir:
                return "NOIR ";
            case Blanc:
                return "BLANC";
        
            default:
                return "     ";
        }
    }






    
}
