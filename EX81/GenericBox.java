// GenericBox.java - The modern, type-safe approach using generics

class GenericBox<T> {
    private T content;
    
    public GenericBox(T content) {
        this.content = content;
    }
    
    public T getContent() {
        return content;
    }
}
