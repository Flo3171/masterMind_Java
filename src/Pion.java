public class Pion {

    public enum Couleur {
        Rouge, Jaune, Vert, Bleu, Noir, Blanc;  
    }

    private Couleur couleur;
    private int colone;

    public Pion(Couleur couleur, int colone){
        this.couleur = couleur;
        this.colone = colone;
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
