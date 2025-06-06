import java.util.Objects;
import java.util.EnumMap;
import java.util.Map;


public class Resistances {
    public enum ResistanceType {
        FIRE,
        ICE,
        SHOCK,
        SPIRIT,
        NATURE
    }
    //EnumMap is used to store resistance values
    private EnumMap<ResistanceType, Integer> resistanceMap;

    public Resistances() {
        resistanceMap = new EnumMap<>(ResistanceType.class);
        for(ResistanceType type : ResistanceType.values()) {
            resistanceMap.put(type, 0);
        }
    }

    public int getResistance(ResistanceType type) {
        return resistanceMap.get(type);
    }


    public int setResistance(ResistanceType type, Integer value) {
        return resistanceMap.put(type, value);
    }


    public int addResistance(ResistanceType type, Integer amount) {
        return resistanceMap.put(type, getResistance(type) + amount);
    }

    //has to be void to reinstance map?
    public void addAllResistance(ResistanceType type, Map<ResistanceType, Integer> amounts) {
        for (ResistanceType t : ResistanceType.values()) {
            if (amounts.containsKey(t)) {
                resistanceMap.put(t, amounts.get(t));
            }
        }
    }
    public int minusResistance(ResistanceType type, Integer amount) {
        return resistanceMap.get(type) - amount;
    }


    @Override
    public String toString() {
        return "Resistance: " + resistanceMap.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resistances that = (Resistances) o;
        return Objects.equals(resistanceMap, that.resistanceMap);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(resistanceMap);
    }
}

/*
Example usage would be the following:
Resistances resistance = new Resistances();

resistance.addResistance(Resistances.ResistantType.FIRE, 5);
sout("how to display a specific resistance" + resistance.getResistance(Resistences.ResistanceType.FIRE);
sout(resistance)


 */






    //Below is using the enum switch method, this has been commented out in preference for the map method
    /*
    private int fireResistance;
    private int iceResistance;
    private int shockResistance;
    private int spiritResistance;
    private int natureResistance;


    //Enum method for solving function redundancy

    public int getIceResistance() {
        return iceResistance;
    }

    public void setIceResistance(int iceResistance) {
        this.iceResistance = iceResistance;
    }

    public int getFireResistance() {
        return fireResistance;
    }

    public void setFireResistance(int fireResistance) {
        this.fireResistance = fireResistance;
    }

    public int getShockResistance() {
        return shockResistance;
    }

    public void setShockResistance(int shockResistance) {
        this.shockResistance = shockResistance;
    }

    public int getSpiritResistance() {
        return spiritResistance;
    }

    public void setSpiritResistance(int spiritResistance) {
        this.spiritResistance = spiritResistance;
    }

    public int getNatureResistance() {
        return natureResistance;
    }

    public void setNatureResistance(int natureResistance) {
        this.natureResistance = natureResistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resistances that = (Resistances) o;
        return fireResistance == that.fireResistance && iceResistance == that.iceResistance && shockResistance == that.shockResistance && spiritResistance == that.spiritResistance && natureResistance == that.natureResistance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fireResistance, iceResistance, shockResistance, spiritResistance, natureResistance);
    }

    @Override
    public String toString() {
        return "Resistances: " +
                "fireResistance: " + fireResistance +
                ", iceResistance: " + iceResistance +
                ", shockResistance: " + shockResistance +
                ", spiritResistance: " + spiritResistance +
                ", natureResistance: " + natureResistance;
    }

    //functions
    //function using ENUM to add resistances
    public void addResistance(ResistanceType type, int amount) {
        switch (type) {
            case FIRE:
                this.fireResistance += amount;
                break;
            case ICE:
                this.iceResistance += amount;
                break;
            case SHOCK:
                this.shockResistance += amount;
                break;
            case SPIRIT:
                this.spiritResistance += amount;
                break;
            case NATURE:
                this.natureResistance += amount;
                break;

        }
    }


}
*/