public class Movie extends Product{

    private String director;

    public Movie() {
        this(null,0.0,null);
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        return super.getPrice() - 30;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "director='" + director + '\'' +
                "} " + super.toString();
    }
}
