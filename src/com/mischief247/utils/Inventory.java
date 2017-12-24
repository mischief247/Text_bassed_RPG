package com.mischief247.utils;

import com.mischief247.interfaces.IItem;
import java.util.HashMap;

public class Inventory {
    HashMap<IItem,Integer> inventory = new HashMap<>();

    public HashMap<IItem, Integer> getInventory() {
        return inventory;
    }

    public void addItem(IItem item){

        if(inventory.containsKey(item)){
            inventory.replace(item,inventory.get(item)+1);
        }

        else{
            inventory.put(item,1);
        }

    }
    public void addItem(IItem item, Integer amount){

        if(inventory.containsKey(item)){
            inventory.replace(item,inventory.get(item)+amount);
        }
        else{
            inventory.put(item,amount);
        }

    }

}
