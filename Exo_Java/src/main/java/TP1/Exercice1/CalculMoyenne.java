public class CalculMoyenne {
    public static void main(String[] args) {
        double[] notes = {12, 10, 20};
        double moyenne = calculerMoyenne(notes);

        System.out.println("La moyenne est : " + moyenne);
    }

    // Fonction pour calculer la moyenne des notes
    public static double calculerMoyenne(double[] notes) {

        // Vérifier que toutes les notes sont comprises entre 0 et 20
        for (double note : notes) {
            if (note < 0 || note > 20) {
                System.out.println("Veuillez entrer des notes entre 0 et 20.");
                return 0;
            }
        }

        // Calculer la moyenne
        double somme = 0;
        for (double note : notes) {
            somme += note;
        }

        return somme / notes.length;
    }
}
