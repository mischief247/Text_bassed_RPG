import com.mischief247.interfaces.IActor;
import com.mischief247.interfaces.IItem;
import com.mischief247.utils.Location;

import java.util.HashMap;

public class NPC implements IActor {
    private int hp ;
    private int lv;
    private int def;
    private int atk;
    private int spd;
    private int acc;
    private int weight;
    private String name;
    private String gender;
    private String height;
    private HashMap<Location,IItem> equipment = new HashMap<>();

    NPC(int hp, int lv, int def, int atk, int spd, int acc, int weight, String name, String gender, String height){
    this.hp = hp;
    this.lv = lv;
    this.def = def;
    this.atk = atk;
    this.spd = spd;
    this.acc = acc;
    this.weight = weight;
    this.name = name;
    this.gender = gender;
    this.height = height;
    }
    @Override
    public int getHP() {
        return hp;
    }

    @Override
    public void takeDamage(int Damage) {

    }

    @Override
    public int getLv() {
        return lv;
    }

    @Override
    public int getDef() {
        return def;
    }

    @Override
    public int getATK() {
        return atk;
    }

    @Override
    public int getSPD() {
        return spd;
    }

    @Override
    public void modDef(int mod) {
        def += mod;
    }

    @Override
    public void modSPD(int mod) {
        spd += mod;
    }

    @Override
    public void modATK(int mod) {
        atk += mod;
    }

    @Override
    public HashMap<Location, IItem> getEquipment() {
        return equipment;
    }

    @Override
    public boolean equip(Location l, IItem item) {
        if(equipment.containsKey(l)){
            return false;
        }
        else{
            equipment.put(l,item);
            return true;
        }
    }

    @Override
    public int getACC() {
        return acc;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getHeight() {
        return height;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String getGender() {
        return gender;
    }
}
