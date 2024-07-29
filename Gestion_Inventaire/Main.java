package Gestion_Inventaire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nApplication de Gestion d'inventaire\n-----------------------------------");

        System.out.println("\nDonner le nom de l'article:");
        String nom = scan.next();

        System.out.println("Donner le nombre de stock: ");
        int stock = scan.nextInt();

        System.out.println("-------->Choisissez la categorie de l'article<------\n  1- Produit\n  2- Materiel");
        int choix = scan.nextInt();

        Article article = null;
        switch (choix) {
            case 1:
                Fonctions.Produit(article, scan, nom, stock);
                break;
            case 2:
                Fonctions.Materiel(article,scan, nom, stock);
                break;
            default:
                break;
        }

        scan.close();
    }
}
