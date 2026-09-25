class NumberStats<T extends Number> {
    private T value1;
    private T value2;
    
    public NumberStats(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    
    public double getSum() {
        return value1.doubleValue() + value2.doubleValue();
    }
    
    public double getAverage() {
        return (value1.doubleValue() + value2.doubleValue()) / 2.0;
    }
}
