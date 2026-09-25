public class Warrior extends Character implements Attackable {
    private int strength;
    
    public Warrior(String name, int maxHealth, int level, int strength) {
        super(name, maxHealth, level);
        this.strength = strength;
    }
    
    @Override
    public String getCharacterClass() {
        return "Warrior";
    }
    
    @Override
    public DamageType getDamageType() {
        return DamageType.PHYSICAL;
    }
    
    @Override
    public String attack(Character target) {
        int damage = strength + getLevel();
        String damageResult = target.takeDamage(damage);
        return getName() + " strikes with " + getDamageType().getDescription() + " for " + damage + " damage!\n" + damageResult;
    }
}
