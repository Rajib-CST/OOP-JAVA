public enum DamageType {
    PHYSICAL("brute force"),
    MAGICAL("arcane energy"),
    RANGED("precision strike");
    
    private String description;
    
    DamageType(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}
