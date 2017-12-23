package com.mischief247.interfaces;

public interface IPlayer extends  IActor {
    int getXp();
    void addXp(int xp);
    int getGold();
    boolean spendGold();
    void addGold();
}
