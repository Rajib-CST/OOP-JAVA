// Abstract class - shared state and behavior for all animals
abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String makeSound();

    public String getInfo() {
        return name + " (" + age + " years old)";
    }
}
