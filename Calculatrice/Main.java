import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculatrice cal = new Calculatrice();
        Operation add = new Addition();
        Operation sous = new Soustraction();
        Operation produit = new Multiplication();
        Operation div = new Division();

        System.out.println("Choix\n 1-Addition\n 2-Soustraction\n 3-Produit\n 4-Division ");
        String choix = scan.nextLine();

        switch (choix) {
            case "1":
                System.out.println(cal.calculer(add, 3, 9));
                break;
            case "2":
                System.out.println(cal.calculer(sous, 29, 9));
                break;
            case "3":
                System.out.println(cal.calculer(produit, 3, 9));
                break;
            case "4":
                System.out.println(cal.calculer(div, 3, 9));
                break;
            default:
                break;
        }

        scan.close();
    }
}
