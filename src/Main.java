//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Character Chris = new Character();
        Chris.setName("Chris");
        Chris.setCritRate(3.5);
        Chris.setDodgeChance(10);
        System.out.println(Chris);

        System.out.println(Chris.getResistance());
        Chris.getResistance().addResistance(Resistances.ResistanceType.FIRE, 25);
        System.out.println(Chris);

        Weapon StarfangLongsword = new Weapon();

    }
}