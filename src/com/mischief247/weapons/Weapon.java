package com.mischief247.weapons;

import com.mischief247.interfaces.IItem;
import com.mischief247.utils.Type;

public class Weapon implements IItem{
    private String name;
    private boolean isEnchanted;
    private String description;
    private Type type;
    private int weight;
    
    public Weapon(String name, boolean isEnchanted,String description,Type type,int weight){
        this.name = name;
        this.isEnchanted = isEnchanted;
        this.description = description;
        this.type = type;
        this.weight = weight;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isEnchanted() {
        return isEnchanted;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int hashcode() {
        return name.hashCode() ;
    }
}
