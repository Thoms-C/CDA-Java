import java.util.Scanner;

public class TVA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le prix HT : ");
        double prixHT = scanner.nextDouble();

        double tauxTVA = 0.2;

        double prixTTC = prixHT * (1 + tauxTVA);

        System.out.println("Le prix TTC est : " + prixTTC);

        scanner.close();
    }
}
