package com.myersthecnologies;

import java.util.Scanner;

/**
 * Classe permettant créer les attributs pour chaque Joueur
 */

public class Attributs {

    int personnage;
    int niveau;
    int force;
    int agilite;
    int intelligence;
    int vie;
    String choixPersonnage;
    String cri;
    Scanner scanner;
    int nb;


    public Attributs(){

    }

    public void setPersonnage(){
        System.out.println("Veuillez choisir la classe de votre personnage " + "(" + "1 : Guerrier, " + "2 : Rôdeur, " + "3 : Mage)");
        scanner = new Scanner(System.in);
        nb = scanner.nextInt();
        if(nb >= 1 && nb <= 3){
            personnage = nb;
            setNiveau();
        } else{
            System.out.println("Choisissez un personnage parmis les personnages porposés");
            setPersonnage();
        }
    }

    public void setNiveau(){
        System.out.println("Niveau du personnage ?");
        scanner = new Scanner(System.in);
        nb = scanner.nextInt();
        if(nb >= 1 && nb <= 100){
            niveau = nb;
            setForce();
        } else {
            System.out.println("Veuillez séléctionner un niveau entre 1 et 100");
            setNiveau();
        }
    }

    public void setForce(){
        System.out.println("Force du personnage ?");
        scanner = new Scanner(System.in);
        nb = scanner.nextInt();
        if(force <= niveau) {
            if (nb >= 0 && nb <= 100) {
                force = nb;
                setAgilite();
            } else {
                System.out.println("Veuillez choisir la Force de votre personnage entre 0 et 100");
                setForce();
            }
        } else {
            System.out.println("La Force ne doit pas dépasser le Niveau");
        }
    }

    public void setAgilite(){
        System.out.println("Agilité du personnage ?");
        scanner = new Scanner(System.in);
        nb = scanner.nextInt();
        if (force + nb <= niveau){
        if(nb >= 0 && nb <= 100) {
                agilite = nb;
                setIntelligence();
            } else {
            System.out.println("Veuillez choisir l'Agilité de votre personnage entre 0 et 100");
             setAgilite();
            }
        } else {
            System.out.println("La combinaison de Force et Agilité ne doit pas dépasser le Niveau");
            setAgilite();
        }
    }

    public void setIntelligence(){
        System.out.println("Intelligence du personnage ?");
        scanner = new Scanner(System.in);
        nb = scanner.nextInt();
        if (force + agilite + nb <= niveau) {
            if (nb >= 0 && nb <= 100) {
                intelligence = nb;
                totalStats();
            } else {
                System.out.println("Veuillez choisir l'Intéligence de votre personnage entre 0 et 100");
                setIntelligence();
            }
        } else {
            System.out.println("La combinaison de Force, Agilité et Intelligence ne doit pas dépasser le Niveau");
            setIntelligence();
        }
    }

    /**
     * décodage du nom du personnage et son cri corresppondant
     */

    public void infosPersonnage(){
        if (personnage == 1) {
            choixPersonnage = "Guerrier";
            cri = "Woarg";
        }
        else if (personnage == 2) {
            choixPersonnage = "Rôdeur";
            cri = "Brwaa";
        }
        else if(personnage == 3){
            choixPersonnage = "Mage";
            cri = "Abracadabra";
        } else {
            System.out.println("Choisissez un personnage parmis les personnages porposés");
        }
    }

    /**
     * Calcul de la vie du joueur et affichage du texte d'acceuil au joueur crée
     */

    public void totalStats(){
        infosPersonnage();
        vie = niveau * 5;
        System.out.println(cri + " je suis le " + choixPersonnage + " je possède " + vie + " de vitalité, " + force + " de force, " + agilite +
                " d'agilité, " + intelligence + " d'intelligence !" );

    }

}
