// Generic class with two type parameters that pairs a recipient with their gift
class Registry<K, V> {
    private K recipient;
    private V gift;
    
    public Registry(K recipient, V gift) {
        this.recipient = recipient;
        this.gift = gift;
    }
    
    public K getRecipient() {
        return recipient;
    }
    
    public V getGift() {
        return gift;
    }
    
    public String getEntry() {
        return recipient + " -> " + gift;
    }
}
