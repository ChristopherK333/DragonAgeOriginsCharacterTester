public class Weapon {
    private String name;
    private int tier;
    private double damage;
    private double criticalChance;
    private double strengthModifier;
    private double armorPenetration;
    private double healthRegeneration;
    private double manaStamRegeneration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(double criticalChance) {
        this.criticalChance = criticalChance;
    }

    public double getStrengthModifier() {
        return strengthModifier;
    }

    public void setStrengthModifier(double strengthModifier) {
        this.strengthModifier = strengthModifier;
    }

    public double getArmorPenetration() {
        return armorPenetration;
    }

    public void setArmorPenetration(double armorPenetration) {
        this.armorPenetration = armorPenetration;
    }

    public double getHealthRegeneration() {
        return healthRegeneration;
    }

    public void setHealthRegeneration(double healthRegeneration) {
        this.healthRegeneration = healthRegeneration;
    }

    public double getManaStamRegeneration() {
        return manaStamRegeneration;
    }

    public void setManaStamRegeneration(double manaStamRegeneration) {
        this.manaStamRegeneration = manaStamRegeneration;
    }
}
