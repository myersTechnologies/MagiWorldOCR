package com.myersthecnologies;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class Joueur1Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void Given_More_Life_ToMage_When_SpecialAttackSoin_Then_ThrowException(){
        Joueur1 joueur1 = new Joueur1();
        Joueur2 joueur2 = new Joueur2();
        joueur1.personnage = 3;
        joueur1.niveau = 5;
        joueur1.vie = 50;
        joueur1.intelligence = 10;
        joueur1.getJoueur1AttackChoice(2, joueur1, joueur2);
        assertTrue(joueur1.vie == 50);
    }



}