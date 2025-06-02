import java.util.Objects;

public class Character {
    private String name;
    private double criticalRate;
    private double criticalDamage;
    private int magicResistance;
    private int dodgeChance;
    private int fireResistance;
    private int iceResistance;
    private int shockResistance;
    private int spiritResistance;
    private int natureResistance;
    private Weapon weapon;


    //Default Constructor
    public Character(){

    }

    public Character(String name, double critRate, double critDamage, int magicResistance, int dodgeChance) {
        this.name = name;
        this.criticalRate = critRate;
        this.criticalDamage = critDamage;
        this.magicResistance = magicResistance;
        this.dodgeChance = dodgeChance;

    }



    //getters
    public String getName() {
        return name;
    }

    public double getCritDamage() {
        return criticalDamage;
    }

    public void setCritDamage(double critDamage) {
        this.criticalDamage = critDamage;
    }

    public double getCritRate() {
        return criticalRate;
    }

    public void setCritRate(double critRate) {
        this.criticalRate = critRate;
    }

    public int getMagicResistance() {
        return magicResistance;
    }

    public void setMagicResistance(int magicResistance) {
        this.magicResistance = magicResistance;
    }

    public int getDodgeChance() {
        return dodgeChance;
    }

    public void setDodgeChance(int dodgeChance) {
        this.dodgeChance = dodgeChance;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", critRate=" + criticalRate +
                ", critDamage=" + criticalDamage +
                ", magicResistance=" + magicResistance +
                ", dodgeChance=" + dodgeChance +
                ", fireResistance=" + fireResistance +
                ", iceResistance=" + iceResistance +
                ", shockResistance=" + shockResistance +
                ", spiritResistance=" + spiritResistance +
                ", natureResistance=" + natureResistance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Double.compare(criticalRate, character.criticalRate) == 0 && Double.compare(criticalDamage, character.criticalDamage) == 0 && magicResistance == character.magicResistance && dodgeChance == character.dodgeChance && fireResistance == character.fireResistance && iceResistance == character.iceResistance && shockResistance == character.shockResistance && spiritResistance == character.spiritResistance && natureResistance == character.natureResistance && Objects.equals(name, character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, criticalRate, criticalDamage, magicResistance, dodgeChance, fireResistance, iceResistance, shockResistance, spiritResistance, natureResistance);
    }

    //functions



}
