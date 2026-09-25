class Connection implements AutoCloseable {
    private String name;
    
    public Connection(String name) {
        this.name = name;
        System.out.println(name + " connection opened");
    }
    
    public void query(String sql) {
        System.out.println("Executing on " + name + ": " + sql);
    }
    
    @Override
    public void close() {
        System.out.println(name + " connection closed");
    }
}
