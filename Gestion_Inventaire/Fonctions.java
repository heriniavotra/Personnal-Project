package Gestion_Inventaire;

import java.util.Scanner;

public class Fonctions {

    
    public static void Produit(Article article, Scanner scan, String nom, int stock) {

        article = new Produit(nom, stock);
        article.Stock();

        if (article != null) {

            System.out.println("\n ----- Infos article -----\n\nNom de l'article: " + article.Nom());
            System.out.println("Stock: " + article.Stock());
            System.out.println("Categorie: " + article.Categorie());

        }

        System.out.println("\n--------------------------\n \nDonner la quantité à ajouter: ");
        int qt_prod_ajoute = scan.nextInt();

        if (article != null) {

            System.out.println("\nNom de l'article: " + article.Nom());
            System.out.println("Stock: " + article.AjoutStock(qt_prod_ajoute));
            System.out.println("Categorie: " + article.Categorie());

        }

        System.out.println("\n--------------------------\n \nDonner la quantité à retirer: ");
        int qt_prod_retire = scan.nextInt();

        if (article != null) {

            System.out.println("\nNom de l'article: " + article.Nom());
            System.out.println("Stock: " + article.RetireStock(qt_prod_retire));
            System.out.println("Categorie: " + article.Categorie());

        }
    }

    public static void Materiel(Article article, Scanner scan, String nom, int stock) {
        
        article = new Materiel(nom, stock);
        article.Stock();

        if (article != null) {

            System.out.println("\n ----- Infos article -----\n\nNom de l'article: " + article.Nom());
            System.out.println("Stock: " + article.Stock());
            System.out.println("Categorie: " + article.Categorie());

        }

        System.out.println("\n--------------------------\n \nDonner la quantité à ajouter: ");
        int qt_mat_ajoute = scan.nextInt();

        if (article != null) {

            System.out.println("\nNom de l'article: " + article.Nom());
            System.out.println("Stock: " + article.AjoutStock(qt_mat_ajoute));
            System.out.println("Categorie: " + article.Categorie());

        }

        System.out.println("\n--------------------------\n \nDonner la quantité à retirer: ");
        int qt_mat_retire = scan.nextInt();

        if (article != null) {

            System.out.println("\nNom de l'article: " + article.Nom());
            System.out.println("Stock: " + article.RetireStock(qt_mat_retire));
            System.out.println("Categorie: " + article.Categorie());

        }

    }
}
