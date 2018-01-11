package com.mischief247.utils;

import com.mischief247.interfaces.IItem;
import java.util.HashMap;

public class Inventory {
    private HashMap<IItem,Integer> inventory = new HashMap<>();
    private int weight;
    public HashMap<IItem, Integer> getInventory() {
        return inventory;
    }

    public void addItem(IItem item){
        weight+=item.getWeight();
        if(inventory.containsKey(item)){
            inventory.replace(item,inventory.get(item)+1);
        }

        else{
            inventory.put(item,1);
        }

    }
    public void addItem(IItem item, Integer amount){
        weight += item.getWeight();
        if(inventory.containsKey(item)){
            inventory.replace(item,inventory.get(item)+amount);
        }
        else{
            inventory.put(item,amount);
        }

    }
    public boolean dropitem(IItem item, Integer amount){
        if(inventory.containsKey(item)){
            if(inventory.get(item)> amount){
                inventory.replace(item,inventory.get(item)-amount);
            }
            else
                inventory.remove(item);
            return true;
        }
        else
            return false;
    }
    int getWeight(){
        return weight;
    }
}
