package com.myersthecnologies;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Joueur1 joueur1 = new Joueur1();
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();;
        //Choix du personnage du joueur 1
        joueur1.setPersonnage();
        System.out.println("Création du Personnage du Joueur 2");
        Joueur2 joueur2 = new Joueur2();
        joueur2.setPersonnage();
        //on commence le jeu par le joueur 1
        joueur1.Joueur1Attaque();
        scanner = new Scanner(System.in);
        nb = scanner.nextInt();
        // j'ai mis les joueurs en paramétres pour pouvoir y accéder
        joueur1.getJoueur1AttackChoice(nb, joueur1, joueur2);
    }
}
