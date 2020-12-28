// implementation of interface Movable
// class: Movable Circle
// sort using Comparator interface

package lab8;

import java.util.Comparator;

class Checker implements Comparator<MovablePoint> {

    @Override
    public int compare(MovablePoint o1, MovablePoint o2) {
        if (o1.xSpeed < o2.ySpeed)
            return -1;
        else if (o1.xSpeed > o2.ySpeed)
            return 1;
        else
            return 0;
    }
    
} // end of class Checker.

public class MovablePoint implements Movable {

    // instance variables with package access (default)
    int x, y;
    int xSpeed, ySpeed;

    // constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
    }

    // implementation of abstract methods declared in interface Movable
    // all methods will be public since visibility cannot be reduced
    public void moveUp() {
            y += ySpeed;
    }

    public void moveDown() {
            y -= ySpeed;
    }

    public void moveLeft() {
            x -= xSpeed;
    }

    public void moveRight() {
            x += xSpeed;
    }

    // toString override
    @Override
    public String toString() {
            return "Speed (" + xSpeed + ", " + ySpeed + ")";
    }

} // end of class MovablePoint.