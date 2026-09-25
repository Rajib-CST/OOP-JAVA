import java.util.Scanner;

class Movie {
    private String title;
    private String director;
    private int year;
    private double rating;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    public boolean isClassic() {
        return this.year < 1990;
    }

    public String getInfo() {
        return "Title: " + this.title + ", Director: " + this.director + ", Year: " + this.year + ", Rating: " + this.rating;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String director = sc.nextLine();
        int year = Integer.parseInt(sc.nextLine());
        double rating = Double.parseDouble(sc.nextLine());

        Movie movie = new Movie(title, director, year, rating);
        System.out.println(movie.getInfo());
        System.out.println("Classic: " + movie.isClassic());
    }
}
