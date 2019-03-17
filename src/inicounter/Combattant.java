/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicounter;

/**
 *
 * @author Chris
 */
public class Combattant {
    private String name;
    private int initiative;
    private boolean hasUmgewandelt;
    private boolean isDead;

    public Combattant(String name, int initiative) {
        this.name = name;
        this.initiative = initiative;
        this.hasUmgewandelt = false;
        this.isDead = false;
    }

    public int getInitiative() {
        return initiative;
    }

    public String getName() {
        return name;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public boolean isHasUmgewandelt() {
        return hasUmgewandelt;
    }

    public void setHasUmgewandelt(boolean hasUmgewandelt) {
        this.hasUmgewandelt = hasUmgewandelt;
    }

    public boolean isIsDead() {
        return isDead;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }
    
    
    
    
    
    
    
    
}
