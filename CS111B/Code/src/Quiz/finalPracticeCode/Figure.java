package Quiz.finalPracticeCode;

public class Figure {
    private int centerPoint, height;

    public Figure() {
        centerPoint=0;
        height=0;
    }

    public Figure(int cP, int h) {
        centerPoint=cP;
        height=h;
    }

    public Figure(Figure other) {
        centerPoint=other.centerPoint;
        height=other.height;
    }

    public int getCenterPoint() {
        return centerPoint;
    }

    public int getHeight() {
        return height;
    }

    public void setCenterPoint(int centerPoint) {
        this.centerPoint = centerPoint;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return ("Center Point: "+getCenterPoint()+"Height: "+getHeight());
    }

}
