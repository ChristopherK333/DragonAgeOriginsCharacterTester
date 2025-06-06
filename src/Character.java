import java.util.Objects;

public class Character {
    private String name;
    private double criticalRate;
    private double criticalDamage;
    private int magicResistance;
    private int dodgeChance;
    private Resistances resistance;
    private Weapon weapon;


    //Default Constructor
    public Character(){

    }

    public Character(String name, double critRate, double critDamage, int magicResistance, int dodgeChance, Resistances resistance) {
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



    public void setName(String name) {
        this.name = name;
    }


    public Resistances getResistance() {
        return resistance;
    }
    public void setResistance(Resistances resistance) {
        this.resistance = resistance;
    }


    @Override
    public String toString() {
        return "Name:" + name +
                "\nCritical Rate: " + criticalRate +
                "\nCritical Damage: " + criticalDamage +
                "\nmagicResistance: " + magicResistance +
                "\ndodgeChance: " + dodgeChance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Double.compare(criticalRate, character.criticalRate) == 0 && Double.compare(criticalDamage, character.criticalDamage) == 0 && magicResistance == character.magicResistance && dodgeChance == character.dodgeChance && Objects.equals(name, character.name) && Objects.equals(resistance, character.resistance) && Objects.equals(weapon, character.weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, criticalRate, criticalDamage, magicResistance, dodgeChance, resistance, weapon);
    }

//functions



}
