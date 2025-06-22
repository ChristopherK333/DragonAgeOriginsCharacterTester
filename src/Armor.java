import java.util.Objects;

public class Armor {
    private double armor;
    private int tier;
    private double fatigue;
    private int magicResistance;
    private int dodgeChance;
    private double healthRegeneration;
    private double manaStamRegeneration;
    private Resistances resistance;


    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
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

    public double getHealthRegeneration() {
        return healthRegeneration;
    }

    public void setHealthRegeneration(double healthRegeneration) {
        this.healthRegeneration = healthRegeneration;
    }

    public double getManaRegeneration() {
        return manaStamRegeneration;
    }

    public void setManaRegeneration(double manaRegeneration) {
        this.manaStamRegeneration = manaRegeneration;
    }


    public Resistances getResistance() {
        return resistance;
    }

    public void setResistance(Resistances resistance) {
        this.resistance = resistance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Armor armor1 = (Armor) o;
        return Double.compare(armor, armor1.armor) == 0 && Double.compare(fatigue, armor1.fatigue) == 0 && magicResistance == armor1.magicResistance && dodgeChance == armor1.dodgeChance && Double.compare(healthRegeneration, armor1.healthRegeneration) == 0 && Double.compare(manaStamRegeneration, armor1.manaStamRegeneration) == 0 &&  Objects.equals(resistance, armor1.resistance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(armor, fatigue, magicResistance, dodgeChance, healthRegeneration, manaStamRegeneration, resistance);
    }
}
