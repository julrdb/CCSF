package Quiz.finalPracticeCode;

public class Rectangle extends Figure {
    private int width;

    public Rectangle() {
        super();
        width=0;
    }

    public Rectangle(int cP, int h, int w) {
        super(cP,h);
        width=w;
    }

    public Rectangle(Rectangle other) {
        super(other);
        width = other.width;
    }

    public void erase() {
        System.out.println("This is Rectangle class method erase()");
    }
    public void draw() {
        System.out.println("This is Rectangle class method draw()");
    }

    public void center() {
        System.out.println("Rectangle class method center() being called!");
        erase();
        draw();
    }



}
