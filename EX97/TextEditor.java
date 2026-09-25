class TextEditor {
    private TextFormatter formatter;
    
    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }
    
    public void publishText(String text) {
        if (formatter != null) {
            System.out.println("Published: " + formatter.format(text));
        } else {
            System.out.println("Published: " + text);
        }
    }
}