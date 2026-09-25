import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read three lines of movie data
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        
        // TODO: Create an ArrayList to store Movie objects
        ArrayList<Movie> movies = new ArrayList<>();
        
        // TODO: Parse each line (format: title,director,rating)
        // Hint: Use split(",") to separate the parts
        // Hint: Use Double.parseDouble() for the rating
        String[] parts1 = line1.split(",");
        String[] parts2 = line2.split(",");
        String[] parts3 = line3.split(",");
        
        // TODO: Create Movie objects and add them to the list
        movies.add(new Movie(parts1[0], parts1[1], Double.parseDouble(parts1[2])));
        movies.add(new Movie(parts2[0], parts2[1], Double.parseDouble(parts2[2])));
        movies.add(new Movie(parts3[0], parts3[1], Double.parseDouble(parts3[2])));
        
        // TODO: Sort the list using Collections.sort()
        Collections.sort(movies);
        
        // TODO: Print each movie (one per line)
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}

    
