public class Computer {
    private Processor processor;
    private Memory memory;
    
    public Computer(Processor processor, Memory memory) {
        this.processor = processor;
        this.memory = memory;
    }
    
    public String boot() {
        return "Booting computer...\n" + processor.process() + "\n" + memory.load() + "\nSystem ready!";
    }
    
    public String getSpecs() {
        return "Specs: " + processor.getBrand() + " CPU, " + memory.getSizeGB() + "GB " + memory.getType();
    }
}
