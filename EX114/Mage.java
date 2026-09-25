public class Mage extends Character implements Attackable, Healable {
    private int intelligence;
    private int mana;
    
    public Mage(String name, int maxHealth, int level, int intelligence, int mana) {
        super(name, maxHealth, level);
        this.intelligence = intelligence;
        this.mana = mana;
    }
    
    @Override
    public String getCharacterClass() {
        return "Mage";
    }
    
    @Override
    public DamageType getDamageType() {
        return DamageType.MAGICAL;
    }
    
    @Override
    public String attack(Character target) {
        int damage = intelligence * 2;
        String damageResult = target.takeDamage(damage);
        return getName() + " strikes with " + getDamageType().getDescription() + " for " + damage + " damage!\n" + damageResult;
    }
    
    @Override
    public String heal(int amount) {
        setHealth(getHealth() + amount);
        return getName() + " channels healing magic! Health: " + getHealth() + "/" + getMaxHealth();
    }
}
