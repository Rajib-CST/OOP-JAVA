import java.util.ArrayList;

class Container<T> {
    private ArrayList<T> items;
    
    public Container() {
        items = new ArrayList<>();
    }
    
    public void add(T item) {
        items.add(item);
    }
    
    public T get(int index) {
        return items.get(index);
    }
    
    public int size() {
        return items.size();
    }
    
    public boolean isEmpty() {
        return items.isEmpty();
    }
    
    public ArrayList<T> getAll() {
        return items;
    }
}
