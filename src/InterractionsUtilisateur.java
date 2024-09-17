import javax.swing.*;

public class InterractionsUtilisateur {
    public static int demanderEntier(){
        boolean nombreValide = false;
        int nombre=0;
        while(!nombreValide){
            try {
                nombre = Integer.parseInt(JOptionPane.showInputDialog("Veuillez saisir un nombre entier: "));
                nombreValide = true;
                break;
            }
            catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(null, "Vous n'avez pas saisie un nombre entier veuillez ressayer. 🛑");
            }
        }
        return nombre;
    }
    public static String choixOperation(){
        boolean choixValide = false;
        String choix = "";
        while(!choixValide){
            try {
                choix = JOptionPane.showInputDialog(null, "Veuillez choisir entre les opérations suivante:\n" +
                        "'+' pour addition\n" +
                        "'-' pour soustraction\n" +
                        "'*' pour multiplication\n" +
                        "'/' pour division");
                if (choix.equals("+") || choix.equals("-") || choix.equals("*") || choix.equals("/")) {
                    choixValide = true;
                }
                else {
                    throw new  Exception("Veuillez choisir entre les quatre proposition du menu. 🛑");
                }
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return choix;
    }
}
