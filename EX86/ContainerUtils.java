class ContainerUtils {
    
    public static void printAll(Container<?> container) {
        for (int i = 0; i < container.size(); i++) {
            System.out.println(container.get(i));
        }
    }
    
    public static double countItems(Container<? extends Number> container) {
        double sum = 0.0;
        for (int i = 0; i < container.size(); i++) {
            sum += container.get(i).doubleValue();
        }
        return sum;
    }
    
    public static void addDefaults(Container<? super Integer> container) {
        container.add(1);
        container.add(2);
        container.add(3);
    }
    
    public static <T> T getLastOrDefault(Container<T> container, T defaultValue) {
        if (container.isEmpty()) {
            return defaultValue;
        }
        return container.get(container.size() - 1);
    }
}
