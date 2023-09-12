import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectangleFilter implements Filter {
    @Override
    public boolean accept(Object x) {
        Rectangle newRect = (Rectangle)x;
        if (2 * (newRect.width + newRect.height) > 10) {
            return true;
        }
        return false;
    }
}
