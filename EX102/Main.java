import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        Document document = new Document();
        
        System.out.println("Status: " + document.getStatus());
        
        String[] actions = input.split(",");
        
        for (String action : actions) {
            if (action.equals("edit")) {
                document.edit();
            } else if (action.equals("approve")) {
                document.approve();
            }
            System.out.println("Status: " + document.getStatus());
        }
    }
}
