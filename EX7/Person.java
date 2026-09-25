public class Person {
    private String name;
    private int age;
    private String city;
    
    // Created constructor with parameters: name, age, city
    // Using 'this' keyword to assign each parameter to the field
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    
    // getName() method that returns this.name
    public String getName() {
        return this.name;
    }
    
    // getAge() method that returns this.age
    public int getAge() {
        return this.age;
    }
    
    // getCity() method that returns this.city
    public String getCity() {
        return this.city;
    }
    
    // Fixed getDescription() to actually inject the variables into the string
    // Using 'this' keyword to access each field
    public String getDescription() {  
        return this.name + ", age " + this.age + ", from " + this.city;
    }
}