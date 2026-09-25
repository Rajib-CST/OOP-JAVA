class CreationalPattern implements Pattern {
    public String getCategory() {
        return "Creational";
    }
    
    public String getPurpose() {
        return "How objects are created";
    }
}

class StructuralPattern implements Pattern {
    public String getCategory() {
        return "Structural";
    }
    
    public String getPurpose() {
        return "How objects are composed";
    }
}

class BehavioralPattern implements Pattern {
    public String getCategory() {
        return "Behavioral";
    }
    
    public String getPurpose() {
        return "How objects communicate";
    }
}
