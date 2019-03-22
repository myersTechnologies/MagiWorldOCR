package com.myersthecnologies;

import java.util.Scanner;

public class Joueur1 extends Attributs {

    public Joueur1(){

    }

    /**
     * proposition des choix d'attaque
     */

    public void Joueur1Attaque(){
        if (vie > 0) {
            System.out.println("Joueur 1 (" + vie + " Vitalité) Veuillez choisir votre action ( 1 : Attaque Basique, 2 : Attaque Spéciale )");
        } else {
            //End game
            System.out.println("Joueur 1 est mort" + "\n" + "Joueur 1 a perdu");
        }
       }

    /**
     * Le système choisi le type d'attaque choisi par le joueur (Attaque basique ou Attaque spécial)
     * ici je passe les paramètres suivants:
     *
     * @param choice
     * @param joueur1
     * @param joueur2
     *
     * pour permetre d'identifier le joueur qui attaque
     * Pour alléger la méthode j'ai créer une autre méthode liées au choix des attaques
     */

       public void getJoueur1AttackChoice(int choice, Joueur1 joueur1, Joueur2 joueur2){
        switch (choice){
            case 1:
                attaqueBasiqueJoueur1(joueur2);
                break;
            case 2:
               attaqueSpecialJoueur1(joueur2);
                break;
                default:
                    System.out.println("Veuillez choisir parmis les actions proposées");
                    break;
        }

        //on passe l'attaque au Joueur 2
           joueur2.setAttaqueJoueur2();
           Scanner scanner = new Scanner(System.in);
           int nb = scanner.nextInt();
           joueur2.getJoueur2AttackChoice(nb, joueur1, joueur2);
       }

    /**
     * méthode pour trier les attaques basiques des personnage
     * @param joueur2
     */


    public void attaqueBasiqueJoueur1(Joueur2 joueur2){
           if(personnage == 1){
               System.out.println("Joueur 1 utilise Coup d'Epée et inflige " + joueur2.force + " dommages" + "\n" + "Joueur 2 perd " + joueur2.force + " points de vie");
               joueur2.vie -= joueur2.force;
           }
           if(personnage ==2){
               System.out.println("Joueur 1 utilise Tir à l'Arc et inflige " + agilite + " dommages");
               System.out.println("Joueur 2 perd " + agilite  + " points de vie");
               joueur2.vie -= agilite;
           }
           if(personnage == 3){
               System.out.println("Joueur 1 utilise Boule de Feu et inflige " + joueur2.intelligence + " dommages" + "\n" + "Joueur 2 perd " + joueur2.intelligence + " points de vie");
               joueur2.vie -= joueur2.intelligence;
           }
       }

    /**
     * méthode pour les attaque sépciaux du Joueur 1 pour attaquer le joueur 2
     * @param joueur2
     */

    public void attaqueSpecialJoueur1(Joueur2 joueur2){
           if(personnage == 1){
               System.out.println("Joueur 1 utilise Coup de Rage et inflige " + joueur2.force * 2 +" dommages" + "\n" + "Joueur 2 perd " + joueur2.force * 2 + " points de vie");
               System.out.println("Joueur 1 perd " + force / 2 + " points de vie");
               joueur2.vie -= joueur2.force * 2;
               vie -= force / 2;
           }
           if (personnage == 2){
               System.out.println("Joueur 1 utilise Concentration et gagne " + niveau / 2 + " en agilité");
               agilite +=  niveau / 2;
           }
           if(personnage == 3){
               if(vie < niveau * 5) {
                   vie += intelligence * 2;
                   System.out.println("Joueur 1 utilise Soin et gagne " + intelligence * 2 + " en vitalité");
               } else {
                   System.out.println("Joueur 1 utilise Soin mais la Vie est au maximum");
               }
           }
       }


}
