// driver for Exercise 7

package lab8;

import java.util.ArrayList;
import java.util.Collections;

public class MovableTest {

        // main()
        public static void main(String[] args) {
                // MovableCircle elements
                ArrayList<MovableCircle> circleList = new ArrayList<MovableCircle>();
                circleList.add(new MovableCircle(0, 0, 5, 5, 4));
                circleList.add(new MovableCircle(3, 1, 5, 5, 3));
                circleList.add(new MovableCircle(1, 1, 5, 5, 1));
                circleList.add(new MovableCircle(2, 4, 5, 5, 2));
                System.out.println("Initial Circles list: " + circleList);

                // sorting MovableCircle elements
                Collections.sort(circleList);
                System.out.println("Sorted Circles list: " + circleList);

                // MovablePoint elements
                ArrayList<MovablePoint> pointList = new ArrayList<MovablePoint>();
                pointList.add(new MovablePoint(0, 0, 5, 2));
                pointList.add(new MovablePoint(1, 1, 3, 10));
                pointList.add(new MovablePoint(2, 2, 9, 6));
                pointList.add(new MovablePoint(3, 3, 7, 8));
                System.out.println("Initial Points list: " + pointList);

                // sorting MovablePoint elements
                Checker checker = new Checker();
                Collections.sort(pointList, checker);
                System.out.println("Sorted Points list: " +  pointList);
        }
        
} // end of class MovableTest.
