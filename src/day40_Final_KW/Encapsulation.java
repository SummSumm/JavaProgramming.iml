package day40_Final_KW;

import day39_OOPPractices.Shape.Circle;
import day39_OOPPractices.Shape.Square;

public class Encapsulation {
    private Circle circle;
    private Square square;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        if (circle.getRadius() <= 0) {
            System.err.println("Invalid");
            System.exit(1);
        }
        this.circle = circle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        if (square.getSide() <= 0) {
            System.err.println("Invalid");
            this.square = square;
        }
    }

}
