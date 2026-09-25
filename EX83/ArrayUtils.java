class ArrayUtils {
    
    // Implement getLast - a generic method that takes an array of type T
    // and returns the last element. Return null if array is empty.
    public static <T> T getLast(T[] array) {
        if (array.length == 0) {
            return null;
        }
        return array[array.length - 1];
    }
    
    // Implement swap - a generic method that takes an array of type T
    // and two integer indices, then swaps the elements at those positions.
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    // Implement printWithLabel - a generic method with two type parameters K and V
    // Takes a label of type K and a value of type V
    // Prints in format: [label]: [value]
    public static <K, V> void printWithLabel(K label, V value) {
        System.out.println(label + ": " + value);
    }
}
