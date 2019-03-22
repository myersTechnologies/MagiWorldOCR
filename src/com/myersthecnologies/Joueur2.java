package com.myersthecnologies;

import java.util.Scanner;

public class Joueur2 extends Attributs  {
    /**
     * la classe Joueur 2 hérite de la classe Attributs
     */

    public Joueur2(){

    }

    /**
     * Au moment de proposer le choix entre les attaques, le système vérifie que la fie du joueur est supérieur ou égale a 0
     * sinon la partie est fini
     */
    public void setAttaqueJoueur2(){
        if (vie > 0) {
            System.out.println("Joueur 2 (" + vie + " Vitalité) Veuillez choisir votre action ( 1 : Attaque Basique, 2 : Attaque Spéciale)");
        } else {
            System.out.println("Joueur 2 est mort" + "\n" + "Joueur 2 a perdu");
        }
    }

    public void getJoueur2AttackChoice(int choice, Joueur1 joueur1, Joueur2 joueur2){
        switch (choice){
            case 1:
                attaqueBasiqueJoueur2(joueur1);
                break;
            case 2:
                attaqueSpecialJoueur2(joueur1);
                break;
            default:
                System.out.println("Veuillez choisir parmis les actions proposées");
                break;
        }
        joueur1.Joueur1Attaque();
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();
        joueur1.getJoueur1AttackChoice(nb, joueur1, joueur2);
        }

    public void attaqueBasiqueJoueur2(Joueur1 joueur1){
        if(personnage == 1){
            System.out.println("Joueur 2 utilise Coup d'Epée et inflige " + joueur1.force +" dommages" + "\n" + "Joueur 1 perd " + joueur1.force +" points de vie");
            joueur1.vie -= joueur1.force;
        }
        if(personnage ==2){
            System.out.println("Joueur 2 utilise Tir à l'Arc et inflige " + agilite + " dommages");
            System.out.println("Joueur 1 perd " + agilite  + " points de vie");
            joueur1.vie -= agilite;
        }
        if(personnage == 3){
            System.out.println("Joueur 2 utilise Boule de Feu et inflige " + joueur1.intelligence +" dommages" + "\n" + "Joueur 1 perd " + joueur1.intelligence + " points de vie");
            joueur1.vie -= joueur1.intelligence;
        }
    }

    public void attaqueSpecialJoueur2(Joueur1 joueur1){
        if(personnage == 1){
            System.out.println("Joueur 2 utilise Coup de Rage et inflige " + joueur1.force * 2 + " dommages" + "\n" + "Joueur 1 perd " + joueur1.force * 2 + " points de vie");
            System.out.println("Joueur 2 perd " + force / 2 + " points de vie");
            joueur1.vie -= joueur1.force * 2;
            vie -= force / 2;
        }
        if (personnage == 2){
            System.out.println("Joueur 2 utilise Concentration et gagne " + niveau / 2 + " en agilité");
            agilite += niveau / 2;
        }
        if(personnage == 3){
            if (vie < niveau * 5){
                vie += intelligence * 2;
                System.out.println("Joueur 2 utilise Soin et gagne " + intelligence * 2 +" en vitalité");
            } else {
                System.out.println("Joueur 2 utilise Soin mais la Vie est au maximum");
            }
        }
    }

}


