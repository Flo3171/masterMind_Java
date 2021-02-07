import java.io.*;

public class Acquisition {
    
    static int acquisitionSansMessage(int mini, int maxi){
        String input = null;
        int number = 0;
        boolean erreur = false;
        do {
            // java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
            // String string = r.readLine();
            // retour = Integer.parseInt(string);
            
            erreur = false;
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                input = bufferedReader.readLine();
                number = Integer.parseInt(input);
            } catch (NumberFormatException ex) {
                erreur = true;
            } catch (IOException e) {
                e.printStackTrace();
            }

        } while (!(erreur == false && number >= mini && number <= maxi));
        return number;
    }

    static Pion.Couleur[] acquiertCouleur(){
        Pion.Couleur[] listCouleur = new Pion.Couleur[4];
    
        for (int i = 0; i < 4; i++) {
            System.out.println("Quel est la couleur du pion numéro " + i + ": \n1 - Rouge \n2 - Jaune \n3 - Vert \n4 - Cyan \n5 - Noir \n6 - Blanc");
            switch (acquisitionSansMessage(1, 6)) {
                case 1:
                    listCouleur[i] = Pion.Couleur.Rouge;
                    break;
                case 2:
                    listCouleur[i] = Pion.Couleur.Jaune;
                    break;
                case 3:
                    listCouleur[i] = Pion.Couleur.Vert;
                    break;
                case 4:
                    listCouleur[i] = Pion.Couleur.Cyan;
                    break;
                case 5:
                    listCouleur[i] = Pion.Couleur.Noir;
                    break;
                case 6:
                    listCouleur[i] = Pion.Couleur.Blanc;
                    break;
            
                default:
                    break;
            }
        }
        return listCouleur;
    }
}
