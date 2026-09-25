// Bird also inherits from Animal, but it does not swim.
class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public String makeSound() {
        return getName() + " chirps happily.";
    }

    public String flyStatus() {
        return canFly ? getName() + " can fly." : getName() + " cannot fly.";
    }
}
