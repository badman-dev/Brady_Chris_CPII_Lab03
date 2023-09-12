import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        Filter bigRectangleFilter = new BigRectangleFilter();

        rectangles.add(new Rectangle(1, 2));
        rectangles.add(new Rectangle(20, 3));
        rectangles.add(new Rectangle(50, 40));
        rectangles.add(new Rectangle(1, 1));
        rectangles.add(new Rectangle(18, 45));
        rectangles.add(new Rectangle(7, 8));
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(10, 10));
        rectangles.add(new Rectangle(12, 5));
        rectangles.add(new Rectangle(9, 4));

        Object[] acceptedRectangles = Collect.collectAll(rectangles.toArray(), bigRectangleFilter).toArray();

        System.out.println("Rectangles with perimeter over 10:");
        for(Object r: acceptedRectangles) {
            System.out.println("width of " + ((Rectangle)r).width + " and height of " + ((Rectangle)r).height + ", for a perimeter of " + (2 * (((Rectangle)r).width + ((Rectangle)r).height)));
        }
    }
}
