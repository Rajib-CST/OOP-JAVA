public class Calculator {
    private String name;
    private double memory;
    private int operationCount;
    
    public Calculator(String name) {
        this.name = name;
        this.memory = 0;
        this.operationCount = 0;
    }
    
    public Calculator() {
        this("Default");
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getMemory() {
        return this.memory;
    }
    
    public int getOperationCount() {
        return this.operationCount;
    }
    
    public double add(double a, double b) {
        this.memory = a + b;
        this.operationCount++;
        return this.memory;
    }
    
    public double subtract(double a, double b) {
        this.operationCount++;
        return a - b;
    }
    
    public double multiply(double a, double b) {
        this.operationCount++;
        return a * b;
    }
    
    public double divide(double a, double b) {
        this.operationCount++;
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
    
    public double power(double base, double exponent) {
        this.operationCount++;
        return Math.pow(base, exponent);
    }
}