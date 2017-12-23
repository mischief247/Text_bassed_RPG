package com.mischief247.interfaces;

import com.mischief247.utils.Location;
import java.util.HashMap;

public interface IActor {
     int getHP();
     void takeDamage(int Damage);
     int getLv();
     int getDef();
     int getATK();
     int getSPD();
     void modDef(int mod);
     void modSPD(int mod);
     void modATK(int mod);
     HashMap<Location,IItem> getEquipment();
     boolean equip(Location l,IItem item);
     int getACC();
     String getName();
     String getHeight();
     int getWeight();
     String getGender();

}
