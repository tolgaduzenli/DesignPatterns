package com.design.patterns.chapter01.puzzle;


import com.design.patterns.chapter01.puzzle.characters.King;
import com.design.patterns.chapter01.puzzle.characters.Character;
import com.design.patterns.chapter01.puzzle.weapons.SwordBehavior;

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
