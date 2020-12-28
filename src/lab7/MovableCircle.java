// implementation of interface Movable
// classes: MovablePoint, Movable Circle

package lab7;

class MovablePoint implements Movable {

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
                return "Point is at (" + x + ", " + y + ")";
        }

} // end of class MovablePoint.

class MovableCircle implements Movable {

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
                return "Point is at (" + center.x + ", " + center.y + ")";
        }

} // end of class MovableCircle.
