class Session implements AutoCloseable {
    private String username;
    
    public Session(String username) {
        this.username = username;
        System.out.println("Session started for " + username);
    }
    
    public void performAction(String action) {
        System.out.println(username + " performed: " + action);
    }
    
    @Override
    public void close() {
        System.out.println("Session ended for " + username);
    }
}
