 // TODO: Make this class implement Comparable<Movie>
class Movie implements Comparable<Movie> {
    // Private fields
    private String title;
    private String director;
    private double rating;
    
    // TODO: Create a constructor that initializes all fields
    Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }
    // TODO: Create getter methods for title, director, and rating
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }

    // TODO: Override compareTo() method
    // Movies should be sorted by rating in DESCENDING order (highest first)
    // Hint: Use Double.compare() for safe double comparison
    // Hint: For descending order, reverse the comparison order
    @Override
    public int compareTo(Movie other) {
        return Double.compare(other.rating, this.rating);
    }

    // TODO: Override toString() method
    // Format: [title] by [director] - Rating: [rating]
    @Override
    public String toString() {
        return title + " by " + director + " - Rating: " + rating;
    }
}
