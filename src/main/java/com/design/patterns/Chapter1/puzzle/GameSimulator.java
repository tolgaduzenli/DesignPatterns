package com.design.patterns.Chapter1.puzzle;


import com.design.patterns.Chapter1.puzzle.characters.King;
import com.design.patterns.Chapter1.puzzle.characters.Character;
import com.design.patterns.Chapter1.puzzle.weapons.SwordBehavior;

/**
 * @author Tolga Duzenli on 18-Sep-2016.
 */
public class GameSimulator {

    public static void main(String[] args) {
        Character ch = new King();
        ch.setWeaponBehavior(new SwordBehavior());
        ch.display();
        ch.damage();

    }
}
