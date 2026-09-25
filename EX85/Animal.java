// Base class for all animals
class Animal {
    private String species;
    
    public Animal(String species) {
        this.species = species;
    }
    
    public String getSpecies() {
        return species;
    }
}

class Carnivore extends Animal {
    public Carnivore(String species) {
        super(species);
    }
}

class Herbivore extends Animal {
    public Herbivore(String species) {
        super(species);
    }
}
