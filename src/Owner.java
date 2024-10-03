/*
 * Created on 2026-09-30
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

// LAB06 template - CMPINF 0401, Fall 2026
// Condensed from the LAB05 sample solution.

public class Owner {

    private String name;
    private Cat cat = null; // an owner has zero or one cat

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Cat getCat() {
        return this.cat;
    }

    // Adoption needs both: the owner has no cat, the cat is adoptable
    public boolean adopt(Cat cat) {
        if (this.cat != null) {
            System.out.println(this.name + " cannot adopt " + cat.getName() + ". "
                    + this.name + " already owns a cat.");
            return false;
        }
        if (!cat.isAdoptable()) {
            System.out.println(this.name + " cannot adopt " + cat.getName() + ". "
                    + cat.getName() + " is not adoptable.");
            return false;
        }

        // Both sides reference each other
        this.cat = cat;
        cat.setOwner(this);
        System.out.println(this.name + " adopted " + cat.getName() + "!");
        return true;
    }

    // An owner can only play with their own cat
    public void playWithCat() {
        if (this.cat == null) {
            System.out.println(this.name + " has no cat to play with.");
            return;
        }
        if (this.cat.play()) {
            System.out.println(this.cat.getName() + " is playing with " + this.name + "!");
        } else {
            System.out.println(this.cat.getName() + " is too tired to play.");
        }
    }

    @Override
    public String toString() {
        String catName = "none";
        if (this.cat != null) {
            catName = this.cat.getName();
        }
        return "Owner [name=" + this.name + ", cat=" + catName + "]";
    }
}
