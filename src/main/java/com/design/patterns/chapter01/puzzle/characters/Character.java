package com.design.patterns.chapter01.puzzle.characters;

import com.design.patterns.chapter01.puzzle.weapons.WeaponBehavior;

/**
 * @author Tolga Duzenli on 18-Sep-2016.
 */
public abstract class Character {

    private WeaponBehavior weaponBehavior;

    public abstract void display();

    public void damage(){
        weaponBehavior.useWeapon();
    };

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
