import java.util.Objects;

public class CharacterOld {
    private String name;
    private double criticalRate;
    private double criticalDamage;
    private int magicResistance;
    private int dodgeChance;
    private Resistances resistance;
    private Weapon weapon;


    //Default Constructor
    public CharacterOld(){
        //The default constructor needs this so resistances will not be null when initialized if not given resistances
        this.resistance = new Resistances();

    }

    public CharacterOld(String name, double critRate, double critDamage, int magicResistance, int dodgeChance, Resistances resistance) {
        this.name = name;
        this.criticalRate = critRate;
        this.criticalDamage = critDamage;
        this.magicResistance = magicResistance;
        this.dodgeChance = dodgeChance;
        this.resistance = resistance; //if needed swap this to new resistance to always create a new one

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
        CharacterOld characterOld = (CharacterOld) o;
        return Double.compare(criticalRate, characterOld.criticalRate) == 0 && Double.compare(criticalDamage, characterOld.criticalDamage) == 0 && magicResistance == characterOld.magicResistance && dodgeChance == characterOld.dodgeChance && Objects.equals(name, characterOld.name) && Objects.equals(resistance, characterOld.resistance) && Objects.equals(weapon, characterOld.weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, criticalRate, criticalDamage, magicResistance, dodgeChance, resistance, weapon);
    }

//functions



}
