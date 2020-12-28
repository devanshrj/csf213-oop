// implementation of interface Movable
// class: Movable Circle
// sort using Comparable interface

package lab8;

class MovableCircle implements Movable, Comparable<MovableCircle> {

        // instance variables
        // center.x, center.y can be accessed directly since default visibility
        private MovablePoint center;
        private int radius;

        // constructor
        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
                this.center = new MovablePoint(x, y, xSpeed, ySpeed);
                this.radius = radius;
        }

        // implementation of abstract methods declared in interface Movable
        // all methods will be public since visibility cannot be reduced
        public void moveUp() {
                center.y += center.ySpeed;
        }

        public void moveDown() {
                center.y -= center.ySpeed;
        }

        public void moveLeft() {
                center.x -= center.xSpeed;
        }

        public void moveRight() {
                center.x += center.xSpeed;
        }

        // toString override
        @Override
        public String toString() {
                return "Point is at (" + center.x + ", " + center.y + ")" + " Radius " + radius;
        }

        // compareTo override
        @Override
        public int compareTo(MovableCircle circle) {
                if (this.radius > circle.radius)
                        return 1;
                else if (this.radius < circle.radius)
                        return -1;
                else
                        return 0;
        }
} // end of class MovableCircle.
