// Generic class that can wrap any type of gift
class GiftBox<T> {
    private T item;
    private boolean wrapped = false;
    
    public GiftBox(T item) {
        this.item = item;
    }
    
    public T getItem() {
        return item;
    }
    
    public void wrap() {
        wrapped = true;
    }
    
    public boolean isWrapped() {
        return wrapped;
    }
    
    public String getStatus() {
        if (wrapped) {
            return item + " (wrapped)";
        } else {
            return item + " (unwrapped)";
        }
    }
}
