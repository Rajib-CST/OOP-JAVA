// Dog inherits from Animal and also has the ability to swim.
class Dog extends Animal implements Swimmable {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return getName() + " barks: woof!";
    }

    @Override
    public String swim() {
        return getName() + " the " + breed + " dog is swimming.";
    }
}
