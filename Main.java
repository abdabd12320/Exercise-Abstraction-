
public class Main {
    public static void main(String[] args) {

        System.out.println("Q1:");
        Book book1 = new Book();
        Book book2 = new Book("Talal",330,"Fady");
        Book book3 = new Book();
        book3.setName("Ahmed");
        book3.setPrice(100);
        book3.setAuthor("Salah");

        Movie movie1 = new Movie();
        Movie movie2 = new Movie("Ali",260,"Hanan");
        Movie movie3 = new Movie();
        movie3.setName("Kamal");
        movie3.setPrice(190);
        movie3.setDirector("Basmah");

        System.out.println(book1.toString());
        System.out.println(book1.getName());
        System.out.println(book1.getPrice());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getDiscount());
        System.out.println(book2.toString());
        System.out.println(book2.getName());
        System.out.println(book2.getPrice());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getDiscount());
        System.out.println(book3.toString());
        System.out.println(book3.getName());
        System.out.println(book3.getPrice());
        System.out.println(book3.getAuthor());
        System.out.println(book3.getDiscount());
        System.out.println("--------------------------");
        System.out.println(movie1.toString());
        System.out.println(movie1.getName());
        System.out.println(movie1.getPrice());
        System.out.println(movie1.getDirector());
        System.out.println(movie1.getDiscount());
        System.out.println(movie2.toString());
        System.out.println(movie2.getName());
        System.out.println(movie2.getPrice());
        System.out.println(movie2.getDirector());
        System.out.println(movie2.getDiscount());
        System.out.println(movie3.toString());
        System.out.println(movie3.getName());
        System.out.println(movie3.getPrice());
        System.out.println(movie3.getDirector());
        System.out.println(movie3.getDiscount());

        System.out.println("\n");
        System.out.println("Q2");
        MovablePoint movablePoint1 = new MovablePoint();
        MovablePoint movablePoint2 = new MovablePoint(5,8,12,3);
        MovablePoint movablePoint3 = new MovablePoint();
        movablePoint3.setX(2);
        movablePoint3.setY(6);
        movablePoint3.setxSpeed(15);
        movablePoint3.setySpeed(4);

        System.out.println(movablePoint1.getX());
        System.out.println(movablePoint1.getY());
        System.out.println(movablePoint1.getxSpeed());
        System.out.println(movablePoint1.getySpeed());
        movablePoint1.moveUp();
        movablePoint1.moveDown();
        movablePoint1.moveLeft();
        movablePoint1.moveRight();
        System.out.println(movablePoint1.getX());
        System.out.println(movablePoint1.getY());
        System.out.println(movablePoint1.getxSpeed());
        System.out.println(movablePoint1.getySpeed());
        System.out.println("--------------------------");
        System.out.println(movablePoint2.getX());
        System.out.println(movablePoint2.getY());
        System.out.println(movablePoint2.getxSpeed());
        System.out.println(movablePoint2.getySpeed());
        movablePoint2.moveUp();
        movablePoint2.moveLeft();
        System.out.println(movablePoint2.getX());
        System.out.println(movablePoint2.getY());
        System.out.println(movablePoint2.getxSpeed());
        System.out.println(movablePoint2.getySpeed());
        System.out.println("--------------------------");
        System.out.println(movablePoint3.getX());
        System.out.println(movablePoint3.getY());
        System.out.println(movablePoint3.getxSpeed());
        System.out.println(movablePoint3.getySpeed());
        movablePoint3.moveDown();
        movablePoint3.moveRight();
        System.out.println(movablePoint3.getX());
        System.out.println(movablePoint3.getY());
        System.out.println(movablePoint3.getxSpeed());
        System.out.println(movablePoint3.getySpeed());
    }
}