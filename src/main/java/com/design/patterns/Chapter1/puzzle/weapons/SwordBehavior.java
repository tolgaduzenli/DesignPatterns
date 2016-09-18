package com.design.patterns.Chapter1.puzzle.weapons;

/**
 * @author Tolga Duzenli on 18-Sep-2016.
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.printf("Damage by sword!");
    }
}
