/*
 * Created on 2026-09-30
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

// LAB06 template - CMPINF 0401, Fall 2026
// Condensed from the LAB05 sample solution.

public class Cat {

    private String name;
    private int age;
    private String funnyStory;
    private int energyLevel;

    private Owner owner = null;
    private boolean isAdoptable = true;

    public Cat(String name, int age, String funnyStory, int energyLevel) {
        this.name = name;
        this.age = age;
        this.funnyStory = funnyStory;
        this.energyLevel = energyLevel;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getFunnyStory() {
        return this.funnyStory;
    }

    public int getEnergyLevel() {
        return this.energyLevel;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public boolean isAdoptable() {
        return this.isAdoptable;
    }

    // Only sets an owner if the cat is still adoptable
    public void setOwner(Owner owner) {
        if (this.isAdoptable && this.owner == null && owner != null) {
            this.owner = owner;
            this.isAdoptable = false;
        }
    }

    public boolean wantsToPlay() {
        return this.energyLevel > 3;
    }

    public boolean play() {
        if (wantsToPlay()) {
            this.energyLevel = this.energyLevel - 2;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cat [name=" + this.name + ", age=" + this.age + ", funnyStory=" + this.funnyStory
                + ", energyLevel=" + this.energyLevel + "]";
    }
}
