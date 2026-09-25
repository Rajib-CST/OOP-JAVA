public class StringHelper {
    private String text;
    
    public StringHelper(String text) {
        this.text = text;
    }
    
    // Method toUpperCase() that returns this.text in uppercase
    public String toUpperCase() {
        return this.text.toUpperCase();
    }
    
    // Method getLength() that returns the length of this.text as an int
    public int getLength() {
        return this.text.length();
    }
    
    // Method contains(String word) that returns true/false if this.text contains the word
    public boolean contains(String word) {
        return this.text.contains(word);
    }
    
    // Method repeat(int times) that returns this.text repeated 'times' times
    // Each repetition followed by a space
    public String repeat(int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += this.text + " ";
        }
        return result;
    }
}