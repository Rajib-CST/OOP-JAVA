class SmartTV implements Powerable, VolumeControl {
    private String brand;
    private boolean isOn = false;
    private int volume = 0;
    
    public SmartTV(String brand) {
        this.brand = brand;
    }
    
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println(brand + " TV is now ON");
    }
    
    @Override
    public void powerOff() {
        isOn = false;
        System.out.println(brand + " TV is now OFF");
    }
    
    @Override
    public void setVolume(int level) {
        volume = level;
        System.out.println(brand + " TV volume set to " + level);
    }
    
    @Override
    public int getVolume() {
        return volume;
    }
}
