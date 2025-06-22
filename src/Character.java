import java.util.List;
import java.util.Objects;

public class Character {
    private String name;
    private Weapon mainWeapon;
    private Weapon offHand;
    private List<Armor> armor;
    private Resistances resistances;

    public void addWeapon(Weapon weapon){
    }
    public void addArmor(Armor armor){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getMainWeapon() {
        return mainWeapon;
    }

    public void setMainWeapon(Weapon mainWeapon) {
        this.mainWeapon = mainWeapon;
    }

    public Weapon getOffHand() {
        return offHand;
    }

    public void setOffHand(Weapon offHand) {
        this.offHand = offHand;
    }

    public List<Armor> getArmor() {
        return armor;
    }

    public void setArmor(List<Armor> armor) {
        this.armor = armor;
    }

    public Resistances getResistances() {
        return resistances;
    }

    public void setResistances(Resistances resistances) {
        this.resistances = resistances;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(name, character.name) && Objects.equals(mainWeapon, character.mainWeapon) && Objects.equals(offHand, character.offHand) && Objects.equals(armor, character.armor) && Objects.equals(resistances, character.resistances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mainWeapon, offHand, armor, resistances);
    }


    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", mainWeapon=" + mainWeapon +
                ", offHand=" + offHand +
                ", armor=" + armor +
                ", resistances=" + resistances +
                '}';
    }
}
