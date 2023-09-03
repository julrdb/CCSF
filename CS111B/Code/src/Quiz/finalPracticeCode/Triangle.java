package Quiz.finalPracticeCode;

public class Triangle extends Figure {
    private int base;

    public Triangle() {
        super();
        base=0;
    }

    public Triangle(int cP, int h,int b) {
        super(cP,h);
        base=b;
    }

    public Triangle(Triangle other) {
        super(other);
        base=other.base;
    }

    public void erase() {
        System.out.println("This is Triangle class method erase()");
    }

    public void draw() {
        System.out.println("This is Triangle class method draw()");
    }

    public void center() {
        System.out.println("Triangle class method center() being called!");
        erase();
        draw();
    }

}
