public class MovablePoint implements Movable{

    private int x,y,xSpeed,ySpeed;

    public MovablePoint() {
        this(0,0,0,0);
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    @Override
    public void moveUp() {
        this.y -= getySpeed();
    }

    @Override
    public void moveDown() {
        this.y += getySpeed();
    }

    @Override
    public void moveLeft() {
        this.x -= getxSpeed();
    }

    @Override
    public void moveRight() {
        this.x += getxSpeed();
    }
}