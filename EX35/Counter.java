class Counter {
    private static int totalCount = 0;
    
    private int id;
    
    public Counter() {
        totalCount++;
        this.id = totalCount;
    }
    
    public int getId() {
        return this.id;
    }
    
    public static int getTotalCount() {
        return totalCount;
    }
}
