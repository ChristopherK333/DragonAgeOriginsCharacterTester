public class Character {
    private String name;
    private float critRate;
    private float critDamage;
    private int magicResistance;
    private int dodgeChance;
    private int fireResistance;
    private int iceResistance;
    private int shockResistance;
    private int spiritResistance;
    private int natureResistance;


    //Constructors
    public Character(){



    }

    public Character(String name, float critRate, float critDamage, int magicResistance, int dodgeChance) {
        this.name = name;
        this.critRate = critRate;
        this.critDamage = critDamage;
        this.magicResistance = magicResistance;
        this.dodgeChance = dodgeChance;

    }



    //getters
    public String getName() {
        return name;
    }

    public float getCritDamage() {
        return critDamage;
    }

    public void setCritDamage(float critDamage) {
        this.critDamage = critDamage;
    }

    public float getCritRate() {
        return critRate;
    }

    public void setCritRate(float critRate) {
        this.critRate = critRate;
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





    //functions



}
