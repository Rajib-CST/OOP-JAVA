class AppConfig {
    private static AppConfig instance;
    
    private String appName;
    private int maxUsers;
    
    private AppConfig() {
        appName = "MyApplication";
        maxUsers = 100;
        System.out.println("AppConfig initialized");
    }
    
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }
    
    public void setAppName(String name) {
        appName = name;
    }
    
    public void setMaxUsers(int max) {
        maxUsers = max;
    }
    
    public void displaySettings() {
        System.out.println("App: " + appName + ", Max Users: " + maxUsers);
    }
}
