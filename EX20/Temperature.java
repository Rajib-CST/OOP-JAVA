class Temperature {
    private double celsius;
    
    private boolean valid;
    
    public double getCelsius() {
        return celsius;
    }
    
    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
            this.valid = true;
        } else {
            this.valid = false;
        }
    }
    
    public boolean isValid() {
        return valid;
    }
    
    public double getFahrenheit() {
        return (celsius * 9.0 / 5.0) + 32;
    }
}
