public abstract class Character {
    private String name;
    private int health;
    private int maxHealth;
    private int level;
    
    public Character(String name, int maxHealth, int level) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.level = level;
    }
    
    public String getName() {
        return name;
    }
    
    public int getHealth() {
        return health;
    }
    
    public int getMaxHealth() {
        return maxHealth;
    }
    
    public int getLevel() {
        return level;
    }
    
    protected void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else if (health > maxHealth) {
            this.health = maxHealth;
        } else {
            this.health = health;
        }
    }
    
    public String takeDamage(int damage) {
        setHealth(health - damage);
        return name + " takes " + damage + " damage! Health: " + health + "/" + maxHealth;
    }
    
    public boolean isAlive() {
        return health > 0;
    }
    
    public abstract String getCharacterClass();
}
