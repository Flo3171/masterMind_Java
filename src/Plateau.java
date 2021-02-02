import java.util.*; 

public class Plateau {
    Ligne reference;
    List<Ligne> proposition;

    public Plateau(Pion.Couleur[] couleur){
        this.reference = new Ligne(couleur);
        this.proposition = new ArrayList<Ligne>();
    }


}
