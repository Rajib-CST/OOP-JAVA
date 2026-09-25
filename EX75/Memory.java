public class Memory {
    private String type;
    private int sizeGB;
    
    public Memory(String type, int sizeGB) {
        this.type = type;
        this.sizeGB = sizeGB;
    }
    
    public String getType() {
        return type;
    }
    
    public int getSizeGB() {
        return sizeGB;
    }
    
    public String load() {
        return "Loading " + sizeGB + "GB " + type + " memory";
    }
}
