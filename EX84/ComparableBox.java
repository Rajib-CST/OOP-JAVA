class ComparableBox<T extends Number & Comparable<T>> {
    private T first;
    private T second;
    
    public ComparableBox(T first, T second) {
        this.first = first;
        this.second = second;
    }
    
    public T getMax() {
        return first.compareTo(second) > 0 ? first : second;
    }
    
    public double getMaxAsDouble() {
        return getMax().doubleValue();
    }
}
