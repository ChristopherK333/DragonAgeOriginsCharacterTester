import java.util.Objects;

public class Skills {
    private String skillName;
    private double dodgeChance;
    private double magicResistance;

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public double getDodgeChance() {
        return dodgeChance;
    }

    public void setDodgeChance(double dodgeChance) {
        this.dodgeChance = dodgeChance;
    }

    public double getMagicResistance() {
        return magicResistance;
    }

    public void setMagicResistance(double magicResistance) {
        this.magicResistance = magicResistance;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Skills skills = (Skills) o;
        return Double.compare(dodgeChance, skills.dodgeChance) == 0 && Double.compare(magicResistance, skills.magicResistance) == 0 && Objects.equals(skillName, skills.skillName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillName, dodgeChance, magicResistance);
    }

    @Override
    public String toString() {
        return "Skills{" +
                "skillName='" + skillName + '\'' +
                ", dodgeChance=" + dodgeChance +
                ", magicResistance=" + magicResistance +
                '}';
    }
}
