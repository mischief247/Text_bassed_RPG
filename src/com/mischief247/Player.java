package com.mischief247;

import com.mischief247.interfaces.IPlayable;
import com.mischief247.utils.Inventory;

public class Player extends NPC implements IPlayable {
    private int xp;
    private int gold;
    private Inventory inventory = new Inventory();

     Player(int hp, int lv, int def, int atk, int spd, int acc, int weight, int xp, int gold , String name, String gender, String height){
        super(hp,lv,def,atk,spd,acc,weight,name,gender,height);
        this.xp = xp;
        this.gold = gold;
    }

    @Override
    public int getXp() {
        return xp;
    }

    @Override
    public void addXp(int xp) {
        this.xp += xp;
    }

    @Override
    public int getGold() {
        return gold;
    }

    @Override
    public boolean spendGold(int goldSpent) {
        if(gold - goldSpent < 0){
            return false;
        }
        else {
            gold -= goldSpent;
            return true;
        }
    }

    @Override
    public void addGold(int goldGained) {
        gold += goldGained;
    }

}
