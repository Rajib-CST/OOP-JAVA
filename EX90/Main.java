import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String connectionName = scanner.nextLine();
        String username = scanner.nextLine();
        String action = scanner.nextLine();
        
        // === Single Resource ===
        System.out.println("=== Single Resource ===");
        try (Connection conn = new Connection(connectionName)) {
            conn.query("SELECT * FROM users");
        }
        
        // === Multiple Resources ===
        System.out.println();
        System.out.println("=== Multiple Resources ===");
        try (Connection conn = new Connection(connectionName);
             Session session = new Session(username)) {
            conn.query("INSERT INTO logs");
            session.performAction(action);
        }
        
    }
}
