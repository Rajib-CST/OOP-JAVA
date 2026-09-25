import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String style = scanner.nextLine();
        
        TextEditor editor = new TextEditor();
        
        editor.publishText(text);
        
        if (style.equals("upper")) {
            editor.setFormatter(new UpperCaseFormatter());
        } else if (style.equals("lower")) {
            editor.setFormatter(new LowerCaseFormatter());
        } else if (style.equals("title")) {
            editor.setFormatter(new TitleCaseFormatter());
        }
        
        editor.publishText(text);
    }
}