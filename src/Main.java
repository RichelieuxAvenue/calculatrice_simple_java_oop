import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean isOn = true;
        while (isOn) {
            //prendre les données de l'utilisateur
            int nombre1 = InterractionsUtilisateur.demanderEntier();
            String operation = InterractionsUtilisateur.choixOperation();
            int nombre2 = InterractionsUtilisateur.demanderEntier();

            //choisir l'opération correct et l'effectuer
            if (operation.equals("+")) {
                int resultat = Operations.add(nombre1, nombre2);
                String resultatMessage = String.format("Le resultat de l'addition de %d et %d est %d",nombre1, nombre2, resultat );
                JOptionPane.showMessageDialog(null, resultatMessage);
                JOptionPane.showMessageDialog(null, "Fin du programme...👋");
                break;
            }
            else if (operation.equals("-")) {
                int resultat = Operations.subtract(nombre1, nombre2);
                String resultatMessage = String.format("Le resultat de la soustraction de %d et %d est %d",nombre1, nombre2, resultat );
                JOptionPane.showMessageDialog(null, resultatMessage);
                JOptionPane.showMessageDialog(null, "Fin du programme...👋");
                break;
            }
            else if (operation.equals("*")) {
                int resultat = Operations.multiply(nombre1, nombre2);
                String resultatMessage = String.format("Le resultat de la multiplication de %d et %d est %d",nombre1, nombre2, resultat );
                JOptionPane.showMessageDialog(null, resultatMessage);
                JOptionPane.showMessageDialog(null, "Fin du programme...👋");
                break;
            }
            else if (operation.equals("/")) {
                int resultat = Operations.divide(nombre1, nombre2);
                String resultatMessage = String.format("%d divisé par %d vaut %d", nombre1, nombre2, resultat );
                JOptionPane.showMessageDialog(null, resultatMessage);
                JOptionPane.showMessageDialog(null, "Fin du programme...👋");
                break;
            }
        }
    }
}
