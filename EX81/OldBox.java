// OldBox.java - The pre-generics approach using Object

class OldBox {
    private Object content;
    
    public OldBox(Object content) {
        this.content = content;
    }
    
    public Object getContent() {
        return content;
    }
}
